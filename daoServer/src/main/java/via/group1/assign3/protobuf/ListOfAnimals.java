// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assign3.proto

package via.group1.assign3.protobuf;

/**
 * Protobuf type {@code ListOfAnimals}
 */
public final class ListOfAnimals extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListOfAnimals)
    ListOfAnimalsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOfAnimals.newBuilder() to construct.
  private ListOfAnimals(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOfAnimals() {
    animals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOfAnimals();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListOfAnimals(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              animals_ = new java.util.ArrayList<via.group1.assign3.protobuf.AnimalGrpc>();
              mutable_bitField0_ |= 0x00000001;
            }
            animals_.add(
                input.readMessage(via.group1.assign3.protobuf.AnimalGrpc.parser(), extensionRegistry));
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
        animals_ = java.util.Collections.unmodifiableList(animals_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.group1.assign3.protobuf.Assign3.internal_static_ListOfAnimals_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.group1.assign3.protobuf.Assign3.internal_static_ListOfAnimals_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.group1.assign3.protobuf.ListOfAnimals.class, via.group1.assign3.protobuf.ListOfAnimals.Builder.class);
  }

  public static final int ANIMALS_FIELD_NUMBER = 1;
  private java.util.List<via.group1.assign3.protobuf.AnimalGrpc> animals_;
  /**
   * <code>repeated .AnimalGrpc animals = 1;</code>
   */
  @java.lang.Override
  public java.util.List<via.group1.assign3.protobuf.AnimalGrpc> getAnimalsList() {
    return animals_;
  }
  /**
   * <code>repeated .AnimalGrpc animals = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends via.group1.assign3.protobuf.AnimalGrpcOrBuilder> 
      getAnimalsOrBuilderList() {
    return animals_;
  }
  /**
   * <code>repeated .AnimalGrpc animals = 1;</code>
   */
  @java.lang.Override
  public int getAnimalsCount() {
    return animals_.size();
  }
  /**
   * <code>repeated .AnimalGrpc animals = 1;</code>
   */
  @java.lang.Override
  public via.group1.assign3.protobuf.AnimalGrpc getAnimals(int index) {
    return animals_.get(index);
  }
  /**
   * <code>repeated .AnimalGrpc animals = 1;</code>
   */
  @java.lang.Override
  public via.group1.assign3.protobuf.AnimalGrpcOrBuilder getAnimalsOrBuilder(
      int index) {
    return animals_.get(index);
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
    for (int i = 0; i < animals_.size(); i++) {
      output.writeMessage(1, animals_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < animals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, animals_.get(i));
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
    if (!(obj instanceof via.group1.assign3.protobuf.ListOfAnimals)) {
      return super.equals(obj);
    }
    via.group1.assign3.protobuf.ListOfAnimals other = (via.group1.assign3.protobuf.ListOfAnimals) obj;

    if (!getAnimalsList()
        .equals(other.getAnimalsList())) return false;
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
    if (getAnimalsCount() > 0) {
      hash = (37 * hash) + ANIMALS_FIELD_NUMBER;
      hash = (53 * hash) + getAnimalsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.group1.assign3.protobuf.ListOfAnimals parseFrom(
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
  public static Builder newBuilder(via.group1.assign3.protobuf.ListOfAnimals prototype) {
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
   * Protobuf type {@code ListOfAnimals}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListOfAnimals)
      via.group1.assign3.protobuf.ListOfAnimalsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.group1.assign3.protobuf.Assign3.internal_static_ListOfAnimals_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.group1.assign3.protobuf.Assign3.internal_static_ListOfAnimals_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.group1.assign3.protobuf.ListOfAnimals.class, via.group1.assign3.protobuf.ListOfAnimals.Builder.class);
    }

    // Construct using via.group1.assign3.protobuf.ListOfAnimals.newBuilder()
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
        getAnimalsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (animalsBuilder_ == null) {
        animals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        animalsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.group1.assign3.protobuf.Assign3.internal_static_ListOfAnimals_descriptor;
    }

    @java.lang.Override
    public via.group1.assign3.protobuf.ListOfAnimals getDefaultInstanceForType() {
      return via.group1.assign3.protobuf.ListOfAnimals.getDefaultInstance();
    }

    @java.lang.Override
    public via.group1.assign3.protobuf.ListOfAnimals build() {
      via.group1.assign3.protobuf.ListOfAnimals result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.group1.assign3.protobuf.ListOfAnimals buildPartial() {
      via.group1.assign3.protobuf.ListOfAnimals result = new via.group1.assign3.protobuf.ListOfAnimals(this);
      int from_bitField0_ = bitField0_;
      if (animalsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          animals_ = java.util.Collections.unmodifiableList(animals_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.animals_ = animals_;
      } else {
        result.animals_ = animalsBuilder_.build();
      }
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
      if (other instanceof via.group1.assign3.protobuf.ListOfAnimals) {
        return mergeFrom((via.group1.assign3.protobuf.ListOfAnimals)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.group1.assign3.protobuf.ListOfAnimals other) {
      if (other == via.group1.assign3.protobuf.ListOfAnimals.getDefaultInstance()) return this;
      if (animalsBuilder_ == null) {
        if (!other.animals_.isEmpty()) {
          if (animals_.isEmpty()) {
            animals_ = other.animals_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnimalsIsMutable();
            animals_.addAll(other.animals_);
          }
          onChanged();
        }
      } else {
        if (!other.animals_.isEmpty()) {
          if (animalsBuilder_.isEmpty()) {
            animalsBuilder_.dispose();
            animalsBuilder_ = null;
            animals_ = other.animals_;
            bitField0_ = (bitField0_ & ~0x00000001);
            animalsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnimalsFieldBuilder() : null;
          } else {
            animalsBuilder_.addAllMessages(other.animals_);
          }
        }
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
      via.group1.assign3.protobuf.ListOfAnimals parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.group1.assign3.protobuf.ListOfAnimals) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<via.group1.assign3.protobuf.AnimalGrpc> animals_ =
      java.util.Collections.emptyList();
    private void ensureAnimalsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        animals_ = new java.util.ArrayList<via.group1.assign3.protobuf.AnimalGrpc>(animals_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.group1.assign3.protobuf.AnimalGrpc, via.group1.assign3.protobuf.AnimalGrpc.Builder, via.group1.assign3.protobuf.AnimalGrpcOrBuilder> animalsBuilder_;

    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public java.util.List<via.group1.assign3.protobuf.AnimalGrpc> getAnimalsList() {
      if (animalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(animals_);
      } else {
        return animalsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public int getAnimalsCount() {
      if (animalsBuilder_ == null) {
        return animals_.size();
      } else {
        return animalsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public via.group1.assign3.protobuf.AnimalGrpc getAnimals(int index) {
      if (animalsBuilder_ == null) {
        return animals_.get(index);
      } else {
        return animalsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder setAnimals(
        int index, via.group1.assign3.protobuf.AnimalGrpc value) {
      if (animalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnimalsIsMutable();
        animals_.set(index, value);
        onChanged();
      } else {
        animalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder setAnimals(
        int index, via.group1.assign3.protobuf.AnimalGrpc.Builder builderForValue) {
      if (animalsBuilder_ == null) {
        ensureAnimalsIsMutable();
        animals_.set(index, builderForValue.build());
        onChanged();
      } else {
        animalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder addAnimals(via.group1.assign3.protobuf.AnimalGrpc value) {
      if (animalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnimalsIsMutable();
        animals_.add(value);
        onChanged();
      } else {
        animalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder addAnimals(
        int index, via.group1.assign3.protobuf.AnimalGrpc value) {
      if (animalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnimalsIsMutable();
        animals_.add(index, value);
        onChanged();
      } else {
        animalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder addAnimals(
        via.group1.assign3.protobuf.AnimalGrpc.Builder builderForValue) {
      if (animalsBuilder_ == null) {
        ensureAnimalsIsMutable();
        animals_.add(builderForValue.build());
        onChanged();
      } else {
        animalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder addAnimals(
        int index, via.group1.assign3.protobuf.AnimalGrpc.Builder builderForValue) {
      if (animalsBuilder_ == null) {
        ensureAnimalsIsMutable();
        animals_.add(index, builderForValue.build());
        onChanged();
      } else {
        animalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder addAllAnimals(
        java.lang.Iterable<? extends via.group1.assign3.protobuf.AnimalGrpc> values) {
      if (animalsBuilder_ == null) {
        ensureAnimalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, animals_);
        onChanged();
      } else {
        animalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder clearAnimals() {
      if (animalsBuilder_ == null) {
        animals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        animalsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public Builder removeAnimals(int index) {
      if (animalsBuilder_ == null) {
        ensureAnimalsIsMutable();
        animals_.remove(index);
        onChanged();
      } else {
        animalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public via.group1.assign3.protobuf.AnimalGrpc.Builder getAnimalsBuilder(
        int index) {
      return getAnimalsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public via.group1.assign3.protobuf.AnimalGrpcOrBuilder getAnimalsOrBuilder(
        int index) {
      if (animalsBuilder_ == null) {
        return animals_.get(index);  } else {
        return animalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public java.util.List<? extends via.group1.assign3.protobuf.AnimalGrpcOrBuilder> 
         getAnimalsOrBuilderList() {
      if (animalsBuilder_ != null) {
        return animalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(animals_);
      }
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public via.group1.assign3.protobuf.AnimalGrpc.Builder addAnimalsBuilder() {
      return getAnimalsFieldBuilder().addBuilder(
          via.group1.assign3.protobuf.AnimalGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public via.group1.assign3.protobuf.AnimalGrpc.Builder addAnimalsBuilder(
        int index) {
      return getAnimalsFieldBuilder().addBuilder(
          index, via.group1.assign3.protobuf.AnimalGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .AnimalGrpc animals = 1;</code>
     */
    public java.util.List<via.group1.assign3.protobuf.AnimalGrpc.Builder> 
         getAnimalsBuilderList() {
      return getAnimalsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.group1.assign3.protobuf.AnimalGrpc, via.group1.assign3.protobuf.AnimalGrpc.Builder, via.group1.assign3.protobuf.AnimalGrpcOrBuilder> 
        getAnimalsFieldBuilder() {
      if (animalsBuilder_ == null) {
        animalsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            via.group1.assign3.protobuf.AnimalGrpc, via.group1.assign3.protobuf.AnimalGrpc.Builder, via.group1.assign3.protobuf.AnimalGrpcOrBuilder>(
                animals_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        animals_ = null;
      }
      return animalsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ListOfAnimals)
  }

  // @@protoc_insertion_point(class_scope:ListOfAnimals)
  private static final via.group1.assign3.protobuf.ListOfAnimals DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.group1.assign3.protobuf.ListOfAnimals();
  }

  public static via.group1.assign3.protobuf.ListOfAnimals getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOfAnimals>
      PARSER = new com.google.protobuf.AbstractParser<ListOfAnimals>() {
    @java.lang.Override
    public ListOfAnimals parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListOfAnimals(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOfAnimals> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOfAnimals> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.group1.assign3.protobuf.ListOfAnimals getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

