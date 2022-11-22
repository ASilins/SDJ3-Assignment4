package via.group1.assign3.services;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import via.group1.assign3.protobuf.AnimalGrpc;
import via.group1.assign3.protobuf.AnimalId;
import via.group1.assign3.protobuf.Date;
import via.group1.assign3.protobuf.InvolvedAnimals;
import via.group1.assign3.protobuf.InvolvedProducts;
import via.group1.assign3.protobuf.ListOfAnimals;
import via.group1.assign3.protobuf.NoParam;
import via.group1.assign3.protobuf.Origin;
import via.group1.assign3.protobuf.ProductId;
import via.group1.assign3.protobuf.SlaughterhouseGrpc.SlaughterhouseImplBase;
import via.group1.assign3.repositories.DAO;

@GRpcService
public class SlaughterhouseImpl extends SlaughterhouseImplBase {

    private DAO dao;

    public SlaughterhouseImpl(DAO dao) {
        this.dao = dao;
    }

    @Override
    public void createAnimal(AnimalGrpc animal, StreamObserver<AnimalGrpc> responseObserver) {
        AnimalGrpc createdAnimal = dao.createAnimal(animal);

        responseObserver.onNext(createdAnimal);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllAnimals(NoParam param, StreamObserver<ListOfAnimals> responseObserver) {
        ListOfAnimals animals = dao.getAllAnimals();

        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void getById(AnimalId id, StreamObserver<AnimalGrpc> responseObserver) {
        AnimalGrpc animal = dao.getById(id.getIdOfAnimal());

        responseObserver.onNext(animal);
        responseObserver.onCompleted();
    }

    @Override
    public void getByOrigin(Origin origin, StreamObserver<ListOfAnimals> responseObserver) {
        ListOfAnimals animals = dao.getByOrigin(origin.getOrigin());

        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void getByDate(Date date, StreamObserver<ListOfAnimals> responseObserver) {
        ListOfAnimals animals = dao.getByDate(date.getDate());

        responseObserver.onNext(animals);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveRegNums(ProductId request, StreamObserver<InvolvedAnimals> responseObserver) {

        InvolvedAnimals involvedAnimals = dao.retrieveRegNums(request);

        responseObserver.onNext(involvedAnimals);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveProdNums(AnimalId request, StreamObserver<InvolvedProducts> responseObserver) {
        InvolvedProducts involvedProducts = dao.retrieveProdNums(request);

        responseObserver.onNext(involvedProducts);
        responseObserver.onCompleted();
    }
}
