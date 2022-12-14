// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assign3.proto

package via.sdj3.app.protobuf;

/**
 * Protobuf type {@code AnimalGrpc}
 */
public final class AnimalGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AnimalGrpc)
    AnimalGrpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnimalGrpc.newBuilder() to construct.
  private AnimalGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalGrpc() {
    date_ = "";
    origin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnimalGrpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnimalGrpc(
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

            regNum_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            date_ = s;
            break;
          }
          case 25: {

            weight_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            origin_ = s;
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
    return via.sdj3.app.protobuf.Assign3.internal_static_AnimalGrpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.app.protobuf.Assign3.internal_static_AnimalGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.app.protobuf.AnimalGrpc.class, via.sdj3.app.protobuf.AnimalGrpc.Builder.class);
  }

  public static final int REGNUM_FIELD_NUMBER = 1;
  private int regNum_;
  /**
   * <code>int32 regNum = 1;</code>
   * @return The regNum.
   */
  @java.lang.Override
  public int getRegNum() {
    return regNum_;
  }

  public static final int DATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 2;</code>
   * @return The date.
   */
  @java.lang.Override
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 2;</code>
   * @return The bytes for date.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 3;
  private double weight_;
  /**
   * <code>double weight = 3;</code>
   * @return The weight.
   */
  @java.lang.Override
  public double getWeight() {
    return weight_;
  }

  public static final int ORIGIN_FIELD_NUMBER = 4;
  private volatile java.lang.Object origin_;
  /**
   * <code>string origin = 4;</code>
   * @return The origin.
   */
  @java.lang.Override
  public java.lang.String getOrigin() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      origin_ = s;
      return s;
    }
  }
  /**
   * <code>string origin = 4;</code>
   * @return The bytes for origin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginBytes() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      origin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (regNum_ != 0) {
      output.writeInt32(1, regNum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, date_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      output.writeDouble(3, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, origin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, regNum_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, date_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, origin_);
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
    if (!(obj instanceof via.sdj3.app.protobuf.AnimalGrpc)) {
      return super.equals(obj);
    }
    via.sdj3.app.protobuf.AnimalGrpc other = (via.sdj3.app.protobuf.AnimalGrpc) obj;

    if (getRegNum()
        != other.getRegNum()) return false;
    if (!getDate()
        .equals(other.getDate())) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!getOrigin()
        .equals(other.getOrigin())) return false;
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
    hash = (37 * hash) + REGNUM_FIELD_NUMBER;
    hash = (53 * hash) + getRegNum();
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (37 * hash) + ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getOrigin().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.app.protobuf.AnimalGrpc parseFrom(
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
  public static Builder newBuilder(via.sdj3.app.protobuf.AnimalGrpc prototype) {
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
   * Protobuf type {@code AnimalGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AnimalGrpc)
      via.sdj3.app.protobuf.AnimalGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.app.protobuf.Assign3.internal_static_AnimalGrpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.app.protobuf.Assign3.internal_static_AnimalGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.app.protobuf.AnimalGrpc.class, via.sdj3.app.protobuf.AnimalGrpc.Builder.class);
    }

    // Construct using via.sdj3.app.protobuf.AnimalGrpc.newBuilder()
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
      regNum_ = 0;

      date_ = "";

      weight_ = 0D;

      origin_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.app.protobuf.Assign3.internal_static_AnimalGrpc_descriptor;
    }

    @java.lang.Override
    public via.sdj3.app.protobuf.AnimalGrpc getDefaultInstanceForType() {
      return via.sdj3.app.protobuf.AnimalGrpc.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.app.protobuf.AnimalGrpc build() {
      via.sdj3.app.protobuf.AnimalGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.app.protobuf.AnimalGrpc buildPartial() {
      via.sdj3.app.protobuf.AnimalGrpc result = new via.sdj3.app.protobuf.AnimalGrpc(this);
      result.regNum_ = regNum_;
      result.date_ = date_;
      result.weight_ = weight_;
      result.origin_ = origin_;
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
      if (other instanceof via.sdj3.app.protobuf.AnimalGrpc) {
        return mergeFrom((via.sdj3.app.protobuf.AnimalGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.app.protobuf.AnimalGrpc other) {
      if (other == via.sdj3.app.protobuf.AnimalGrpc.getDefaultInstance()) return this;
      if (other.getRegNum() != 0) {
        setRegNum(other.getRegNum());
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      if (!other.getOrigin().isEmpty()) {
        origin_ = other.origin_;
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
      via.sdj3.app.protobuf.AnimalGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.app.protobuf.AnimalGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int regNum_ ;
    /**
     * <code>int32 regNum = 1;</code>
     * @return The regNum.
     */
    @java.lang.Override
    public int getRegNum() {
      return regNum_;
    }
    /**
     * <code>int32 regNum = 1;</code>
     * @param value The regNum to set.
     * @return This builder for chaining.
     */
    public Builder setRegNum(int value) {
      
      regNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 regNum = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegNum() {
      
      regNum_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 2;</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 2;</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 2;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 2;</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 3;</code>
     * @return The weight.
     */
    @java.lang.Override
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 3;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object origin_ = "";
    /**
     * <code>string origin = 4;</code>
     * @return The origin.
     */
    public java.lang.String getOrigin() {
      java.lang.Object ref = origin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        origin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string origin = 4;</code>
     * @return The bytes for origin.
     */
    public com.google.protobuf.ByteString
        getOriginBytes() {
      java.lang.Object ref = origin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        origin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string origin = 4;</code>
     * @param value The origin to set.
     * @return This builder for chaining.
     */
    public Builder setOrigin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      origin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string origin = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrigin() {
      
      origin_ = getDefaultInstance().getOrigin();
      onChanged();
      return this;
    }
    /**
     * <code>string origin = 4;</code>
     * @param value The bytes for origin to set.
     * @return This builder for chaining.
     */
    public Builder setOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      origin_ = value;
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


    // @@protoc_insertion_point(builder_scope:AnimalGrpc)
  }

  // @@protoc_insertion_point(class_scope:AnimalGrpc)
  private static final via.sdj3.app.protobuf.AnimalGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.app.protobuf.AnimalGrpc();
  }

  public static via.sdj3.app.protobuf.AnimalGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalGrpc>
      PARSER = new com.google.protobuf.AbstractParser<AnimalGrpc>() {
    @java.lang.Override
    public AnimalGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnimalGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalGrpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.app.protobuf.AnimalGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

