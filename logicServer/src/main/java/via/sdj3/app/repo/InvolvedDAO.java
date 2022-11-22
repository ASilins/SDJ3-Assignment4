package via.sdj3.app.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.app.protobuf.AnimalId;
import via.sdj3.app.protobuf.InvolvedAnimals;
import via.sdj3.app.protobuf.InvolvedProducts;
import via.sdj3.app.protobuf.ProductId;
import via.sdj3.app.protobuf.SlaughterhouseGrpc;
import via.sdj3.app.protobuf.SlaughterhouseGrpc.SlaughterhouseBlockingStub;

@Service
public class InvolvedDAO {

    public List<Integer> getInvolvedAnimals(int id) {
        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);

        InvolvedAnimals animals = stub.retrieveRegNums(ProductId.newBuilder().setIdOfProduct(id).build());
        channel.shutdownNow();

        return animals.getIdOfAnimalList();
    }

    public List<Integer> retrieveProdNums(int id) {
        ManagedChannel channel = createChannel();
        SlaughterhouseBlockingStub stub = createStub(channel);

        InvolvedProducts products = stub.retrieveProdNums(AnimalId.newBuilder().setIdOfAnimal(id).build());
        channel.shutdownNow();

        return products.getIdOfProductList();
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
