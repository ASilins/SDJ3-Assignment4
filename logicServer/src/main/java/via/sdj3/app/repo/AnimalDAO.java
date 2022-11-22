package via.sdj3.app.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.app.objects.Animal;
import via.sdj3.app.protobuf.AnimalGrpc;
import via.sdj3.app.protobuf.AnimalId;
import via.sdj3.app.protobuf.Date;
import via.sdj3.app.protobuf.ListOfAnimals;
import via.sdj3.app.protobuf.NoParam;
import via.sdj3.app.protobuf.Origin;
import via.sdj3.app.protobuf.SlaughterhouseGrpc;
import via.sdj3.app.protobuf.SlaughterhouseGrpc.SlaughterhouseBlockingStub;

@Service
public class AnimalDAO {

    public Animal createAnimal(Animal animal) {

        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);

        AnimalGrpc toCreate = AnimalGrpc.newBuilder()
                .setDate(animal.getDate())
                .setOrigin(animal.getOrigin())
                .setRegNum(animal.getRegistrationNumber())
                .setWeight(animal.getWeight())
                .build();

        AnimalGrpc created = stub.createAnimal(toCreate);
        channel.shutdownNow();
        return new Animal(created.getRegNum(),
                created.getDate(),
                created.getWeight(),
                created.getOrigin());
    }

    public Animal getById(int id) {
        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);

        AnimalGrpc foundAnimal = stub.getById(AnimalId.newBuilder().setIdOfAnimal(id).build());
        channel.shutdownNow();

        return new Animal(foundAnimal.getRegNum(),
                foundAnimal.getDate(),
                foundAnimal.getWeight(),
                foundAnimal.getOrigin());
    }

    public List<Animal> getAllAnimals() {

        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);
        List<Animal> animals = new ArrayList<>();

        ListOfAnimals allAnimals = stub.getAllAnimals(NoParam.newBuilder().build());
        channel.shutdownNow();

        for (AnimalGrpc animal : allAnimals.getAnimalsList()) {
            animals.add(new Animal(animal.getRegNum(),
                    animal.getDate(),
                    animal.getWeight(),
                    animal.getOrigin()));
        }

        return animals;
    }

    public List<Animal> getByOrigin(String origin) {

        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);
        List<Animal> animals = new ArrayList<>();

        ListOfAnimals allAnimals = stub.getByOrigin(Origin.newBuilder().setOrigin(origin).build());
        channel.shutdownNow();

        for (AnimalGrpc animal : allAnimals.getAnimalsList()) {
            animals.add(new Animal(animal.getRegNum(),
                    animal.getDate(),
                    animal.getWeight(),
                    animal.getOrigin()));
        }

        return animals;
    }

    public List<Animal> getByDate(String date) {

        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);
        List<Animal> animals = new ArrayList<>();

        ListOfAnimals allAnimals = stub.getByDate(Date.newBuilder().setDate(date).build());
        channel.shutdownNow();

        for (AnimalGrpc animal : allAnimals.getAnimalsList()) {
            animals.add(new Animal(animal.getRegNum(),
                    animal.getDate(),
                    animal.getWeight(),
                    animal.getOrigin()));
        }

        return animals;
    }

    private ManagedChannel createChannel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();
    }

    private SlaughterhouseBlockingStub createStub(ManagedChannel channel) {
        return SlaughterhouseGrpc.newBlockingStub(channel);
    }
}
