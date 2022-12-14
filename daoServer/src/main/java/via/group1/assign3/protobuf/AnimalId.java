// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assign3.proto

package via.group1.assign3.protobuf;

/**
 * Protobuf type {@code AnimalId}
 */
public final class AnimalId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AnimalId)
    AnimalIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnimalId.newBuilder() to construct.
  private AnimalId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalId() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnimalId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnimalId(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            idOfAnimal_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.group1.assign3.protobuf.Assign3.internal_static_AnimalId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.group1.assign3.protobuf.Assign3.internal_static_AnimalId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.group1.assign3.protobuf.AnimalId.class, via.group1.assign3.protobuf.AnimalId.Builder.class);
  }

  public static final int IDOFANIMAL_FIELD_NUMBER = 1;
  private int idOfAnimal_;
  /**
   * <code>int32 idOfAnimal = 1;</code>
   * @return The idOfAnimal.
   */
  @java.lang.Override
  public int getIdOfAnimal() {
    return idOfAnimal_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (idOfAnimal_ != 0) {
      output.writeInt32(1, idOfAnimal_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idOfAnimal_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, idOfAnimal_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.group1.assign3.protobuf.AnimalId)) {
      return super.equals(obj);
    }
    via.group1.assign3.protobuf.AnimalId other = (via.group1.assign3.protobuf.AnimalId) obj;

    if (getIdOfAnimal()
        != other.getIdOfAnimal()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDOFANIMAL_FIELD_NUMBER;
    hash = (53 * hash) + getIdOfAnimal();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.AnimalId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.group1.assign3.protobuf.AnimalId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.group1.assign3.protobuf.AnimalId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.group1.assign3.protobuf.AnimalId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AnimalId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AnimalId)
      via.group1.assign3.protobuf.AnimalIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.group1.assign3.protobuf.Assign3.internal_static_AnimalId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.group1.assign3.protobuf.Assign3.internal_static_AnimalId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.group1.assign3.protobuf.AnimalId.class, via.group1.assign3.protobuf.AnimalId.Builder.class);
    }

    // Construct using via.group1.assign3.protobuf.AnimalId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      idOfAnimal_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.group1.assign3.protobuf.Assign3.internal_static_AnimalId_descriptor;
    }

    @java.lang.Override
    public via.group1.assign3.protobuf.AnimalId getDefaultInstanceForType() {
      return via.group1.assign3.protobuf.AnimalId.getDefaultInstance();
    }

    @java.lang.Override
    public via.group1.assign3.protobuf.AnimalId build() {
      via.group1.assign3.protobuf.AnimalId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.group1.assign3.protobuf.AnimalId buildPartial() {
      via.group1.assign3.protobuf.AnimalId result = new via.group1.assign3.protobuf.AnimalId(this);
      result.idOfAnimal_ = idOfAnimal_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.group1.assign3.protobuf.AnimalId) {
        return mergeFrom((via.group1.assign3.protobuf.AnimalId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.group1.assign3.protobuf.AnimalId other) {
      if (other == via.group1.assign3.protobuf.AnimalId.getDefaultInstance()) return this;
      if (other.getIdOfAnimal() != 0) {
        setIdOfAnimal(other.getIdOfAnimal());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.group1.assign3.protobuf.AnimalId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.group1.assign3.protobuf.AnimalId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idOfAnimal_ ;
    /**
     * <code>int32 idOfAnimal = 1;</code>
     * @return The idOfAnimal.
     */
    @java.lang.Override
    public int getIdOfAnimal() {
      return idOfAnimal_;
    }
    /**
     * <code>int32 idOfAnimal = 1;</code>
     * @param value The idOfAnimal to set.
     * @return This builder for chaining.
     */
    public Builder setIdOfAnimal(int value) {
      
      idOfAnimal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idOfAnimal = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdOfAnimal() {
      
      idOfAnimal_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AnimalId)
  }

  // @@protoc_insertion_point(class_scope:AnimalId)
  private static final via.group1.assign3.protobuf.AnimalId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.group1.assign3.protobuf.AnimalId();
  }

  public static via.group1.assign3.protobuf.AnimalId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalId>
      PARSER = new com.google.protobuf.AbstractParser<AnimalId>() {
    @java.lang.Override
    public AnimalId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnimalId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.group1.assign3.protobuf.AnimalId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

