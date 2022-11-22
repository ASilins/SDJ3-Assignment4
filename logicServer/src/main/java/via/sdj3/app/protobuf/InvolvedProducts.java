// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assign3.proto

package via.sdj3.app.protobuf;

/**
 * Protobuf type {@code InvolvedProducts}
 */
public final class InvolvedProducts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InvolvedProducts)
    InvolvedProductsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvolvedProducts.newBuilder() to construct.
  private InvolvedProducts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvolvedProducts() {
    idOfProduct_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvolvedProducts();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InvolvedProducts(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              idOfProduct_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            idOfProduct_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              idOfProduct_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              idOfProduct_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        idOfProduct_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.app.protobuf.Assign3.internal_static_InvolvedProducts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.app.protobuf.Assign3.internal_static_InvolvedProducts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.app.protobuf.InvolvedProducts.class, via.sdj3.app.protobuf.InvolvedProducts.Builder.class);
  }

  public static final int IDOFPRODUCT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList idOfProduct_;
  /**
   * <code>repeated int32 idOfProduct = 1;</code>
   * @return A list containing the idOfProduct.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getIdOfProductList() {
    return idOfProduct_;
  }
  /**
   * <code>repeated int32 idOfProduct = 1;</code>
   * @return The count of idOfProduct.
   */
  public int getIdOfProductCount() {
    return idOfProduct_.size();
  }
  /**
   * <code>repeated int32 idOfProduct = 1;</code>
   * @param index The index of the element to return.
   * @return The idOfProduct at the given index.
   */
  public int getIdOfProduct(int index) {
    return idOfProduct_.getInt(index);
  }
  private int idOfProductMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getIdOfProductList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(idOfProductMemoizedSerializedSize);
    }
    for (int i = 0; i < idOfProduct_.size(); i++) {
      output.writeInt32NoTag(idOfProduct_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < idOfProduct_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(idOfProduct_.getInt(i));
      }
      size += dataSize;
      if (!getIdOfProductList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idOfProductMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof via.sdj3.app.protobuf.InvolvedProducts)) {
      return super.equals(obj);
    }
    via.sdj3.app.protobuf.InvolvedProducts other = (via.sdj3.app.protobuf.InvolvedProducts) obj;

    if (!getIdOfProductList()
        .equals(other.getIdOfProductList())) return false;
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
    if (getIdOfProductCount() > 0) {
      hash = (37 * hash) + IDOFPRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getIdOfProductList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.app.protobuf.InvolvedProducts parseFrom(
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
  public static Builder newBuilder(via.sdj3.app.protobuf.InvolvedProducts prototype) {
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
   * Protobuf type {@code InvolvedProducts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InvolvedProducts)
      via.sdj3.app.protobuf.InvolvedProductsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.app.protobuf.Assign3.internal_static_InvolvedProducts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.app.protobuf.Assign3.internal_static_InvolvedProducts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.app.protobuf.InvolvedProducts.class, via.sdj3.app.protobuf.InvolvedProducts.Builder.class);
    }

    // Construct using via.sdj3.app.protobuf.InvolvedProducts.newBuilder()
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
      idOfProduct_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.app.protobuf.Assign3.internal_static_InvolvedProducts_descriptor;
    }

    @java.lang.Override
    public via.sdj3.app.protobuf.InvolvedProducts getDefaultInstanceForType() {
      return via.sdj3.app.protobuf.InvolvedProducts.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.app.protobuf.InvolvedProducts build() {
      via.sdj3.app.protobuf.InvolvedProducts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.app.protobuf.InvolvedProducts buildPartial() {
      via.sdj3.app.protobuf.InvolvedProducts result = new via.sdj3.app.protobuf.InvolvedProducts(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        idOfProduct_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.idOfProduct_ = idOfProduct_;
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
      if (other instanceof via.sdj3.app.protobuf.InvolvedProducts) {
        return mergeFrom((via.sdj3.app.protobuf.InvolvedProducts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.app.protobuf.InvolvedProducts other) {
      if (other == via.sdj3.app.protobuf.InvolvedProducts.getDefaultInstance()) return this;
      if (!other.idOfProduct_.isEmpty()) {
        if (idOfProduct_.isEmpty()) {
          idOfProduct_ = other.idOfProduct_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdOfProductIsMutable();
          idOfProduct_.addAll(other.idOfProduct_);
        }
        onChanged();
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
      via.sdj3.app.protobuf.InvolvedProducts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.app.protobuf.InvolvedProducts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList idOfProduct_ = emptyIntList();
    private void ensureIdOfProductIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        idOfProduct_ = mutableCopy(idOfProduct_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @return A list containing the idOfProduct.
     */
    public java.util.List<java.lang.Integer>
        getIdOfProductList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(idOfProduct_) : idOfProduct_;
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @return The count of idOfProduct.
     */
    public int getIdOfProductCount() {
      return idOfProduct_.size();
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @param index The index of the element to return.
     * @return The idOfProduct at the given index.
     */
    public int getIdOfProduct(int index) {
      return idOfProduct_.getInt(index);
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @param index The index to set the value at.
     * @param value The idOfProduct to set.
     * @return This builder for chaining.
     */
    public Builder setIdOfProduct(
        int index, int value) {
      ensureIdOfProductIsMutable();
      idOfProduct_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @param value The idOfProduct to add.
     * @return This builder for chaining.
     */
    public Builder addIdOfProduct(int value) {
      ensureIdOfProductIsMutable();
      idOfProduct_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @param values The idOfProduct to add.
     * @return This builder for chaining.
     */
    public Builder addAllIdOfProduct(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureIdOfProductIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, idOfProduct_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 idOfProduct = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdOfProduct() {
      idOfProduct_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:InvolvedProducts)
  }

  // @@protoc_insertion_point(class_scope:InvolvedProducts)
  private static final via.sdj3.app.protobuf.InvolvedProducts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.app.protobuf.InvolvedProducts();
  }

  public static via.sdj3.app.protobuf.InvolvedProducts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvolvedProducts>
      PARSER = new com.google.protobuf.AbstractParser<InvolvedProducts>() {
    @java.lang.Override
    public InvolvedProducts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InvolvedProducts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvolvedProducts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvolvedProducts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.app.protobuf.InvolvedProducts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

