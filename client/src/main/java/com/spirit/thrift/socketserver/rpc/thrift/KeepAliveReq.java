/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.spirit.thrift.socketserver.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-21")
public class KeepAliveReq implements org.apache.thrift.TBase<KeepAliveReq, KeepAliveReq._Fields>, java.io.Serializable, Cloneable, Comparable<KeepAliveReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeepAliveReq");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_BEGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp_begin", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SERIVCE_QUALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("serivce_quality", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeepAliveReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeepAliveReqTupleSchemeFactory();

  public int id; // required
  public long timestamp_begin; // required
  public java.lang.String serivce_quality; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TIMESTAMP_BEGIN((short)2, "timestamp_begin"),
    SERIVCE_QUALITY((short)3, "serivce_quality");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // TIMESTAMP_BEGIN
          return TIMESTAMP_BEGIN;
        case 3: // SERIVCE_QUALITY
          return SERIVCE_QUALITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __TIMESTAMP_BEGIN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIMESTAMP_BEGIN, new org.apache.thrift.meta_data.FieldMetaData("timestamp_begin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SERIVCE_QUALITY, new org.apache.thrift.meta_data.FieldMetaData("serivce_quality", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeepAliveReq.class, metaDataMap);
  }

  public KeepAliveReq() {
  }

  public KeepAliveReq(
    int id,
    long timestamp_begin,
    java.lang.String serivce_quality)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.timestamp_begin = timestamp_begin;
    setTimestamp_beginIsSet(true);
    this.serivce_quality = serivce_quality;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeepAliveReq(KeepAliveReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.timestamp_begin = other.timestamp_begin;
    if (other.isSetSerivce_quality()) {
      this.serivce_quality = other.serivce_quality;
    }
  }

  public KeepAliveReq deepCopy() {
    return new KeepAliveReq(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setTimestamp_beginIsSet(false);
    this.timestamp_begin = 0;
    this.serivce_quality = null;
  }

  public int getId() {
    return this.id;
  }

  public KeepAliveReq setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public long getTimestamp_begin() {
    return this.timestamp_begin;
  }

  public KeepAliveReq setTimestamp_begin(long timestamp_begin) {
    this.timestamp_begin = timestamp_begin;
    setTimestamp_beginIsSet(true);
    return this;
  }

  public void unsetTimestamp_begin() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_BEGIN_ISSET_ID);
  }

  /** Returns true if field timestamp_begin is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp_begin() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_BEGIN_ISSET_ID);
  }

  public void setTimestamp_beginIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_BEGIN_ISSET_ID, value);
  }

  public java.lang.String getSerivce_quality() {
    return this.serivce_quality;
  }

  public KeepAliveReq setSerivce_quality(java.lang.String serivce_quality) {
    this.serivce_quality = serivce_quality;
    return this;
  }

  public void unsetSerivce_quality() {
    this.serivce_quality = null;
  }

  /** Returns true if field serivce_quality is set (has been assigned a value) and false otherwise */
  public boolean isSetSerivce_quality() {
    return this.serivce_quality != null;
  }

  public void setSerivce_qualityIsSet(boolean value) {
    if (!value) {
      this.serivce_quality = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case TIMESTAMP_BEGIN:
      if (value == null) {
        unsetTimestamp_begin();
      } else {
        setTimestamp_begin((java.lang.Long)value);
      }
      break;

    case SERIVCE_QUALITY:
      if (value == null) {
        unsetSerivce_quality();
      } else {
        setSerivce_quality((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TIMESTAMP_BEGIN:
      return getTimestamp_begin();

    case SERIVCE_QUALITY:
      return getSerivce_quality();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TIMESTAMP_BEGIN:
      return isSetTimestamp_begin();
    case SERIVCE_QUALITY:
      return isSetSerivce_quality();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof KeepAliveReq)
      return this.equals((KeepAliveReq)that);
    return false;
  }

  public boolean equals(KeepAliveReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_timestamp_begin = true;
    boolean that_present_timestamp_begin = true;
    if (this_present_timestamp_begin || that_present_timestamp_begin) {
      if (!(this_present_timestamp_begin && that_present_timestamp_begin))
        return false;
      if (this.timestamp_begin != that.timestamp_begin)
        return false;
    }

    boolean this_present_serivce_quality = true && this.isSetSerivce_quality();
    boolean that_present_serivce_quality = true && that.isSetSerivce_quality();
    if (this_present_serivce_quality || that_present_serivce_quality) {
      if (!(this_present_serivce_quality && that_present_serivce_quality))
        return false;
      if (!this.serivce_quality.equals(that.serivce_quality))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timestamp_begin);

    hashCode = hashCode * 8191 + ((isSetSerivce_quality()) ? 131071 : 524287);
    if (isSetSerivce_quality())
      hashCode = hashCode * 8191 + serivce_quality.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(KeepAliveReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimestamp_begin()).compareTo(other.isSetTimestamp_begin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp_begin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp_begin, other.timestamp_begin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSerivce_quality()).compareTo(other.isSetSerivce_quality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerivce_quality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serivce_quality, other.serivce_quality);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeepAliveReq(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp_begin:");
    sb.append(this.timestamp_begin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("serivce_quality:");
    if (this.serivce_quality == null) {
      sb.append("null");
    } else {
      sb.append(this.serivce_quality);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KeepAliveReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeepAliveReqStandardScheme getScheme() {
      return new KeepAliveReqStandardScheme();
    }
  }

  private static class KeepAliveReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeepAliveReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeepAliveReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMESTAMP_BEGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp_begin = iprot.readI64();
              struct.setTimestamp_beginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERIVCE_QUALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serivce_quality = iprot.readString();
              struct.setSerivce_qualityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeepAliveReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIMESTAMP_BEGIN_FIELD_DESC);
      oprot.writeI64(struct.timestamp_begin);
      oprot.writeFieldEnd();
      if (struct.serivce_quality != null) {
        oprot.writeFieldBegin(SERIVCE_QUALITY_FIELD_DESC);
        oprot.writeString(struct.serivce_quality);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeepAliveReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeepAliveReqTupleScheme getScheme() {
      return new KeepAliveReqTupleScheme();
    }
  }

  private static class KeepAliveReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeepAliveReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeepAliveReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTimestamp_begin()) {
        optionals.set(1);
      }
      if (struct.isSetSerivce_quality()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetTimestamp_begin()) {
        oprot.writeI64(struct.timestamp_begin);
      }
      if (struct.isSetSerivce_quality()) {
        oprot.writeString(struct.serivce_quality);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeepAliveReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timestamp_begin = iprot.readI64();
        struct.setTimestamp_beginIsSet(true);
      }
      if (incoming.get(2)) {
        struct.serivce_quality = iprot.readString();
        struct.setSerivce_qualityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

