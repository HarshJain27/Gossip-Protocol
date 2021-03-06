// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hearGossipRequest.proto

public final class hearGossipRequestProto {
  private hearGossipRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface hearGossipRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string msg = 1;
    /**
     * <code>optional string msg = 1;</code>
     */
    boolean hasMsg();
    /**
     * <code>optional string msg = 1;</code>
     */
    java.lang.String getMsg();
    /**
     * <code>optional string msg = 1;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();

    // optional int32 clk = 2;
    /**
     * <code>optional int32 clk = 2;</code>
     */
    boolean hasClk();
    /**
     * <code>optional int32 clk = 2;</code>
     */
    int getClk();
  }
  /**
   * Protobuf type {@code hearGossipRequest}
   */
  public static final class hearGossipRequest extends
      com.google.protobuf.GeneratedMessage
      implements hearGossipRequestOrBuilder {
    // Use hearGossipRequest.newBuilder() to construct.
    private hearGossipRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private hearGossipRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final hearGossipRequest defaultInstance;
    public static hearGossipRequest getDefaultInstance() {
      return defaultInstance;
    }

    public hearGossipRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private hearGossipRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              msg_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              clk_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hearGossipRequestProto.internal_static_hearGossipRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hearGossipRequestProto.internal_static_hearGossipRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hearGossipRequestProto.hearGossipRequest.class, hearGossipRequestProto.hearGossipRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<hearGossipRequest> PARSER =
        new com.google.protobuf.AbstractParser<hearGossipRequest>() {
      public hearGossipRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new hearGossipRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<hearGossipRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string msg = 1;
    public static final int MSG_FIELD_NUMBER = 1;
    private java.lang.Object msg_;
    /**
     * <code>optional string msg = 1;</code>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 clk = 2;
    public static final int CLK_FIELD_NUMBER = 2;
    private int clk_;
    /**
     * <code>optional int32 clk = 2;</code>
     */
    public boolean hasClk() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 clk = 2;</code>
     */
    public int getClk() {
      return clk_;
    }

    private void initFields() {
      msg_ = "";
      clk_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMsgBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, clk_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMsgBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, clk_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static hearGossipRequestProto.hearGossipRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static hearGossipRequestProto.hearGossipRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static hearGossipRequestProto.hearGossipRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hearGossipRequestProto.hearGossipRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(hearGossipRequestProto.hearGossipRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hearGossipRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements hearGossipRequestProto.hearGossipRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return hearGossipRequestProto.internal_static_hearGossipRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return hearGossipRequestProto.internal_static_hearGossipRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                hearGossipRequestProto.hearGossipRequest.class, hearGossipRequestProto.hearGossipRequest.Builder.class);
      }

      // Construct using hearGossipRequestProto.hearGossipRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        clk_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return hearGossipRequestProto.internal_static_hearGossipRequest_descriptor;
      }

      public hearGossipRequestProto.hearGossipRequest getDefaultInstanceForType() {
        return hearGossipRequestProto.hearGossipRequest.getDefaultInstance();
      }

      public hearGossipRequestProto.hearGossipRequest build() {
        hearGossipRequestProto.hearGossipRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public hearGossipRequestProto.hearGossipRequest buildPartial() {
        hearGossipRequestProto.hearGossipRequest result = new hearGossipRequestProto.hearGossipRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.msg_ = msg_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.clk_ = clk_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof hearGossipRequestProto.hearGossipRequest) {
          return mergeFrom((hearGossipRequestProto.hearGossipRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(hearGossipRequestProto.hearGossipRequest other) {
        if (other == hearGossipRequestProto.hearGossipRequest.getDefaultInstance()) return this;
        if (other.hasMsg()) {
          bitField0_ |= 0x00000001;
          msg_ = other.msg_;
          onChanged();
        }
        if (other.hasClk()) {
          setClk(other.getClk());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        hearGossipRequestProto.hearGossipRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (hearGossipRequestProto.hearGossipRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string msg = 1;
      private java.lang.Object msg_ = "";
      /**
       * <code>optional string msg = 1;</code>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string msg = 1;</code>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string msg = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string msg = 1;</code>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 1;</code>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 1;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        msg_ = value;
        onChanged();
        return this;
      }

      // optional int32 clk = 2;
      private int clk_ ;
      /**
       * <code>optional int32 clk = 2;</code>
       */
      public boolean hasClk() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 clk = 2;</code>
       */
      public int getClk() {
        return clk_;
      }
      /**
       * <code>optional int32 clk = 2;</code>
       */
      public Builder setClk(int value) {
        bitField0_ |= 0x00000002;
        clk_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 clk = 2;</code>
       */
      public Builder clearClk() {
        bitField0_ = (bitField0_ & ~0x00000002);
        clk_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hearGossipRequest)
    }

    static {
      defaultInstance = new hearGossipRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hearGossipRequest)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearGossipRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearGossipRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027hearGossipRequest.proto\"-\n\021hearGossipR" +
      "equest\022\013\n\003msg\030\001 \001(\t\022\013\n\003clk\030\002 \001(\005B\030B\026hear" +
      "GossipRequestProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hearGossipRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hearGossipRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearGossipRequest_descriptor,
              new java.lang.String[] { "Msg", "Clk", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
