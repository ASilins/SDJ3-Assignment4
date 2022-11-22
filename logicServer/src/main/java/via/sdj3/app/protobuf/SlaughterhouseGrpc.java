package via.sdj3.app.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: assign3.proto")
public final class SlaughterhouseGrpc {

  private SlaughterhouseGrpc() {}

  public static final String SERVICE_NAME = "Slaughterhouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.ProductId,
      via.sdj3.app.protobuf.InvolvedAnimals> getRetrieveRegNumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveRegNums",
      requestType = via.sdj3.app.protobuf.ProductId.class,
      responseType = via.sdj3.app.protobuf.InvolvedAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.ProductId,
      via.sdj3.app.protobuf.InvolvedAnimals> getRetrieveRegNumsMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.ProductId, via.sdj3.app.protobuf.InvolvedAnimals> getRetrieveRegNumsMethod;
    if ((getRetrieveRegNumsMethod = SlaughterhouseGrpc.getRetrieveRegNumsMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getRetrieveRegNumsMethod = SlaughterhouseGrpc.getRetrieveRegNumsMethod) == null) {
          SlaughterhouseGrpc.getRetrieveRegNumsMethod = getRetrieveRegNumsMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.ProductId, via.sdj3.app.protobuf.InvolvedAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrieveRegNums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.InvolvedAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("retrieveRegNums"))
              .build();
        }
      }
    }
    return getRetrieveRegNumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalId,
      via.sdj3.app.protobuf.InvolvedProducts> getRetrieveProdNumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveProdNums",
      requestType = via.sdj3.app.protobuf.AnimalId.class,
      responseType = via.sdj3.app.protobuf.InvolvedProducts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalId,
      via.sdj3.app.protobuf.InvolvedProducts> getRetrieveProdNumsMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalId, via.sdj3.app.protobuf.InvolvedProducts> getRetrieveProdNumsMethod;
    if ((getRetrieveProdNumsMethod = SlaughterhouseGrpc.getRetrieveProdNumsMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getRetrieveProdNumsMethod = SlaughterhouseGrpc.getRetrieveProdNumsMethod) == null) {
          SlaughterhouseGrpc.getRetrieveProdNumsMethod = getRetrieveProdNumsMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.AnimalId, via.sdj3.app.protobuf.InvolvedProducts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrieveProdNums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.AnimalId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.InvolvedProducts.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("retrieveProdNums"))
              .build();
        }
      }
    }
    return getRetrieveProdNumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalGrpc,
      via.sdj3.app.protobuf.AnimalGrpc> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimal",
      requestType = via.sdj3.app.protobuf.AnimalGrpc.class,
      responseType = via.sdj3.app.protobuf.AnimalGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalGrpc,
      via.sdj3.app.protobuf.AnimalGrpc> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalGrpc, via.sdj3.app.protobuf.AnimalGrpc> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = SlaughterhouseGrpc.getCreateAnimalMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getCreateAnimalMethod = SlaughterhouseGrpc.getCreateAnimalMethod) == null) {
          SlaughterhouseGrpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.AnimalGrpc, via.sdj3.app.protobuf.AnimalGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.AnimalGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.AnimalGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("createAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.NoParam,
      via.sdj3.app.protobuf.ListOfAnimals> getGetAllAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllAnimals",
      requestType = via.sdj3.app.protobuf.NoParam.class,
      responseType = via.sdj3.app.protobuf.ListOfAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.NoParam,
      via.sdj3.app.protobuf.ListOfAnimals> getGetAllAnimalsMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.NoParam, via.sdj3.app.protobuf.ListOfAnimals> getGetAllAnimalsMethod;
    if ((getGetAllAnimalsMethod = SlaughterhouseGrpc.getGetAllAnimalsMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetAllAnimalsMethod = SlaughterhouseGrpc.getGetAllAnimalsMethod) == null) {
          SlaughterhouseGrpc.getGetAllAnimalsMethod = getGetAllAnimalsMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.NoParam, via.sdj3.app.protobuf.ListOfAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.NoParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.ListOfAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getAllAnimals"))
              .build();
        }
      }
    }
    return getGetAllAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalId,
      via.sdj3.app.protobuf.AnimalGrpc> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = via.sdj3.app.protobuf.AnimalId.class,
      responseType = via.sdj3.app.protobuf.AnimalGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalId,
      via.sdj3.app.protobuf.AnimalGrpc> getGetByIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.AnimalId, via.sdj3.app.protobuf.AnimalGrpc> getGetByIdMethod;
    if ((getGetByIdMethod = SlaughterhouseGrpc.getGetByIdMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByIdMethod = SlaughterhouseGrpc.getGetByIdMethod) == null) {
          SlaughterhouseGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.AnimalId, via.sdj3.app.protobuf.AnimalGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.AnimalId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.AnimalGrpc.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.Origin,
      via.sdj3.app.protobuf.ListOfAnimals> getGetByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByOrigin",
      requestType = via.sdj3.app.protobuf.Origin.class,
      responseType = via.sdj3.app.protobuf.ListOfAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.Origin,
      via.sdj3.app.protobuf.ListOfAnimals> getGetByOriginMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.Origin, via.sdj3.app.protobuf.ListOfAnimals> getGetByOriginMethod;
    if ((getGetByOriginMethod = SlaughterhouseGrpc.getGetByOriginMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByOriginMethod = SlaughterhouseGrpc.getGetByOriginMethod) == null) {
          SlaughterhouseGrpc.getGetByOriginMethod = getGetByOriginMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.Origin, via.sdj3.app.protobuf.ListOfAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.Origin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.ListOfAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getByOrigin"))
              .build();
        }
      }
    }
    return getGetByOriginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.app.protobuf.Date,
      via.sdj3.app.protobuf.ListOfAnimals> getGetByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByDate",
      requestType = via.sdj3.app.protobuf.Date.class,
      responseType = via.sdj3.app.protobuf.ListOfAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.app.protobuf.Date,
      via.sdj3.app.protobuf.ListOfAnimals> getGetByDateMethod() {
    io.grpc.MethodDescriptor<via.sdj3.app.protobuf.Date, via.sdj3.app.protobuf.ListOfAnimals> getGetByDateMethod;
    if ((getGetByDateMethod = SlaughterhouseGrpc.getGetByDateMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByDateMethod = SlaughterhouseGrpc.getGetByDateMethod) == null) {
          SlaughterhouseGrpc.getGetByDateMethod = getGetByDateMethod =
              io.grpc.MethodDescriptor.<via.sdj3.app.protobuf.Date, via.sdj3.app.protobuf.ListOfAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.Date.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.app.protobuf.ListOfAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getByDate"))
              .build();
        }
      }
    }
    return getGetByDateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterhouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub>() {
        @java.lang.Override
        public SlaughterhouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseStub(channel, callOptions);
        }
      };
    return SlaughterhouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterhouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub>() {
        @java.lang.Override
        public SlaughterhouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterhouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterhouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub>() {
        @java.lang.Override
        public SlaughterhouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterhouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterhouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void retrieveRegNums(via.sdj3.app.protobuf.ProductId request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.InvolvedAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveRegNumsMethod(), responseObserver);
    }

    /**
     */
    public void retrieveProdNums(via.sdj3.app.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.InvolvedProducts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveProdNumsMethod(), responseObserver);
    }

    /**
     */
    public void createAnimal(via.sdj3.app.protobuf.AnimalGrpc request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.AnimalGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAllAnimals(via.sdj3.app.protobuf.NoParam request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllAnimalsMethod(), responseObserver);
    }

    /**
     */
    public void getById(via.sdj3.app.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.AnimalGrpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByOrigin(via.sdj3.app.protobuf.Origin request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByOriginMethod(), responseObserver);
    }

    /**
     */
    public void getByDate(via.sdj3.app.protobuf.Date request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByDateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveRegNumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.ProductId,
                via.sdj3.app.protobuf.InvolvedAnimals>(
                  this, METHODID_RETRIEVE_REG_NUMS)))
          .addMethod(
            getRetrieveProdNumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.AnimalId,
                via.sdj3.app.protobuf.InvolvedProducts>(
                  this, METHODID_RETRIEVE_PROD_NUMS)))
          .addMethod(
            getCreateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.AnimalGrpc,
                via.sdj3.app.protobuf.AnimalGrpc>(
                  this, METHODID_CREATE_ANIMAL)))
          .addMethod(
            getGetAllAnimalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.NoParam,
                via.sdj3.app.protobuf.ListOfAnimals>(
                  this, METHODID_GET_ALL_ANIMALS)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.AnimalId,
                via.sdj3.app.protobuf.AnimalGrpc>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getGetByOriginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.Origin,
                via.sdj3.app.protobuf.ListOfAnimals>(
                  this, METHODID_GET_BY_ORIGIN)))
          .addMethod(
            getGetByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.app.protobuf.Date,
                via.sdj3.app.protobuf.ListOfAnimals>(
                  this, METHODID_GET_BY_DATE)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterhouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterhouseStub> {
    private SlaughterhouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseStub(channel, callOptions);
    }

    /**
     */
    public void retrieveRegNums(via.sdj3.app.protobuf.ProductId request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.InvolvedAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveRegNumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveProdNums(via.sdj3.app.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.InvolvedProducts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveProdNumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAnimal(via.sdj3.app.protobuf.AnimalGrpc request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.AnimalGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAnimals(via.sdj3.app.protobuf.NoParam request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(via.sdj3.app.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.AnimalGrpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByOrigin(via.sdj3.app.protobuf.Origin request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByOriginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByDate(via.sdj3.app.protobuf.Date request,
        io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByDateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterhouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterhouseBlockingStub> {
    private SlaughterhouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.app.protobuf.InvolvedAnimals retrieveRegNums(via.sdj3.app.protobuf.ProductId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveRegNumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.app.protobuf.InvolvedProducts retrieveProdNums(via.sdj3.app.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveProdNumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.app.protobuf.AnimalGrpc createAnimal(via.sdj3.app.protobuf.AnimalGrpc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.app.protobuf.ListOfAnimals getAllAnimals(via.sdj3.app.protobuf.NoParam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.app.protobuf.AnimalGrpc getById(via.sdj3.app.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.app.protobuf.ListOfAnimals getByOrigin(via.sdj3.app.protobuf.Origin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.app.protobuf.ListOfAnimals getByDate(via.sdj3.app.protobuf.Date request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByDateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterhouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterhouseFutureStub> {
    private SlaughterhouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.InvolvedAnimals> retrieveRegNums(
        via.sdj3.app.protobuf.ProductId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveRegNumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.InvolvedProducts> retrieveProdNums(
        via.sdj3.app.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveProdNumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.AnimalGrpc> createAnimal(
        via.sdj3.app.protobuf.AnimalGrpc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.ListOfAnimals> getAllAnimals(
        via.sdj3.app.protobuf.NoParam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllAnimalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.AnimalGrpc> getById(
        via.sdj3.app.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.ListOfAnimals> getByOrigin(
        via.sdj3.app.protobuf.Origin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByOriginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.app.protobuf.ListOfAnimals> getByDate(
        via.sdj3.app.protobuf.Date request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByDateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_REG_NUMS = 0;
  private static final int METHODID_RETRIEVE_PROD_NUMS = 1;
  private static final int METHODID_CREATE_ANIMAL = 2;
  private static final int METHODID_GET_ALL_ANIMALS = 3;
  private static final int METHODID_GET_BY_ID = 4;
  private static final int METHODID_GET_BY_ORIGIN = 5;
  private static final int METHODID_GET_BY_DATE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterhouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterhouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRIEVE_REG_NUMS:
          serviceImpl.retrieveRegNums((via.sdj3.app.protobuf.ProductId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.InvolvedAnimals>) responseObserver);
          break;
        case METHODID_RETRIEVE_PROD_NUMS:
          serviceImpl.retrieveProdNums((via.sdj3.app.protobuf.AnimalId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.InvolvedProducts>) responseObserver);
          break;
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((via.sdj3.app.protobuf.AnimalGrpc) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.AnimalGrpc>) responseObserver);
          break;
        case METHODID_GET_ALL_ANIMALS:
          serviceImpl.getAllAnimals((via.sdj3.app.protobuf.NoParam) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((via.sdj3.app.protobuf.AnimalId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.AnimalGrpc>) responseObserver);
          break;
        case METHODID_GET_BY_ORIGIN:
          serviceImpl.getByOrigin((via.sdj3.app.protobuf.Origin) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals>) responseObserver);
          break;
        case METHODID_GET_BY_DATE:
          serviceImpl.getByDate((via.sdj3.app.protobuf.Date) request,
              (io.grpc.stub.StreamObserver<via.sdj3.app.protobuf.ListOfAnimals>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterhouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.app.protobuf.Assign3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Slaughterhouse");
    }
  }

  private static final class SlaughterhouseFileDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier {
    SlaughterhouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterhouseMethodDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterhouseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterhouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterhouseFileDescriptorSupplier())
              .addMethod(getRetrieveRegNumsMethod())
              .addMethod(getRetrieveProdNumsMethod())
              .addMethod(getCreateAnimalMethod())
              .addMethod(getGetAllAnimalsMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getGetByOriginMethod())
              .addMethod(getGetByDateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
