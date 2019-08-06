package com.spirit.thrift.socketserver.rpc.thrift;
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-06")
public class KeepAliveRes implements org.apache.thrift.TBase<KeepAliveRes, KeepAliveRes._Fields>, java.io.Serializable, Cloneable, Comparable<KeepAliveRes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeepAliveRes");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("error_code", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("error_text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("req_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CURRENT_TIME_REQ_FIELD_DESC = new org.apache.thrift.protocol.TField("current_time_req", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField CURRENT_TIME_RES_FIELD_DESC = new org.apache.thrift.protocol.TField("current_time_res", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeepAliveResStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeepAliveResTupleSchemeFactory();

  public short error_code; // required
  public java.lang.String error_text; // required
  public int req_id; // required
  public long current_time_req; // required
  public long current_time_res; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "error_code"),
    ERROR_TEXT((short)2, "error_text"),
    REQ_ID((short)3, "req_id"),
    CURRENT_TIME_REQ((short)4, "current_time_req"),
    CURRENT_TIME_RES((short)5, "current_time_res");

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
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERROR_TEXT
          return ERROR_TEXT;
        case 3: // REQ_ID
          return REQ_ID;
        case 4: // CURRENT_TIME_REQ
          return CURRENT_TIME_REQ;
        case 5: // CURRENT_TIME_RES
          return CURRENT_TIME_RES;
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
  private static final int __ERROR_CODE_ISSET_ID = 0;
  private static final int __REQ_ID_ISSET_ID = 1;
  private static final int __CURRENT_TIME_REQ_ISSET_ID = 2;
  private static final int __CURRENT_TIME_RES_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("error_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.ERROR_TEXT, new org.apache.thrift.meta_data.FieldMetaData("error_text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQ_ID, new org.apache.thrift.meta_data.FieldMetaData("req_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CURRENT_TIME_REQ, new org.apache.thrift.meta_data.FieldMetaData("current_time_req", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CURRENT_TIME_RES, new org.apache.thrift.meta_data.FieldMetaData("current_time_res", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeepAliveRes.class, metaDataMap);
  }

  public KeepAliveRes() {
  }

  public KeepAliveRes(
    short error_code,
    java.lang.String error_text,
    int req_id,
    long current_time_req,
    long current_time_res)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.error_text = error_text;
    this.req_id = req_id;
    setReq_idIsSet(true);
    this.current_time_req = current_time_req;
    setCurrent_time_reqIsSet(true);
    this.current_time_res = current_time_res;
    setCurrent_time_resIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeepAliveRes(KeepAliveRes other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error_code = other.error_code;
    if (other.isSetError_text()) {
      this.error_text = other.error_text;
    }
    this.req_id = other.req_id;
    this.current_time_req = other.current_time_req;
    this.current_time_res = other.current_time_res;
  }

  public KeepAliveRes deepCopy() {
    return new KeepAliveRes(this);
  }


  public void clear() {
    setError_codeIsSet(false);
    this.error_code = 0;
    this.error_text = null;
    setReq_idIsSet(false);
    this.req_id = 0;
    setCurrent_time_reqIsSet(false);
    this.current_time_req = 0;
    setCurrent_time_resIsSet(false);
    this.current_time_res = 0;
  }

  public short getError_code() {
    return this.error_code;
  }

  public KeepAliveRes setError_code(short error_code) {
    this.error_code = error_code;
    setError_codeIsSet(true);
    return this;
  }

  public void unsetError_code() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_CODE_ISSET_ID);
  }

  /** Returns true if field error_code is set (has been assigned a value) and false otherwise */
  public boolean isSetError_code() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_CODE_ISSET_ID);
  }

  public void setError_codeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_CODE_ISSET_ID, value);
  }

  public java.lang.String getError_text() {
    return this.error_text;
  }

  public KeepAliveRes setError_text(java.lang.String error_text) {
    this.error_text = error_text;
    return this;
  }

  public void unsetError_text() {
    this.error_text = null;
  }

  /** Returns true if field error_text is set (has been assigned a value) and false otherwise */
  public boolean isSetError_text() {
    return this.error_text != null;
  }

  public void setError_textIsSet(boolean value) {
    if (!value) {
      this.error_text = null;
    }
  }

  public int getReq_id() {
    return this.req_id;
  }

  public KeepAliveRes setReq_id(int req_id) {
    this.req_id = req_id;
    setReq_idIsSet(true);
    return this;
  }

  public void unsetReq_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQ_ID_ISSET_ID);
  }

  /** Returns true if field req_id is set (has been assigned a value) and false otherwise */
  public boolean isSetReq_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQ_ID_ISSET_ID);
  }

  public void setReq_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQ_ID_ISSET_ID, value);
  }

  public long getCurrent_time_req() {
    return this.current_time_req;
  }

  public KeepAliveRes setCurrent_time_req(long current_time_req) {
    this.current_time_req = current_time_req;
    setCurrent_time_reqIsSet(true);
    return this;
  }

  public void unsetCurrent_time_req() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CURRENT_TIME_REQ_ISSET_ID);
  }

  /** Returns true if field current_time_req is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrent_time_req() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CURRENT_TIME_REQ_ISSET_ID);
  }

  public void setCurrent_time_reqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CURRENT_TIME_REQ_ISSET_ID, value);
  }

  public long getCurrent_time_res() {
    return this.current_time_res;
  }

  public KeepAliveRes setCurrent_time_res(long current_time_res) {
    this.current_time_res = current_time_res;
    setCurrent_time_resIsSet(true);
    return this;
  }

  public void unsetCurrent_time_res() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CURRENT_TIME_RES_ISSET_ID);
  }

  /** Returns true if field current_time_res is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrent_time_res() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CURRENT_TIME_RES_ISSET_ID);
  }

  public void setCurrent_time_resIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CURRENT_TIME_RES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetError_code();
      } else {
        setError_code((java.lang.Short)value);
      }
      break;

    case ERROR_TEXT:
      if (value == null) {
        unsetError_text();
      } else {
        setError_text((java.lang.String)value);
      }
      break;

    case REQ_ID:
      if (value == null) {
        unsetReq_id();
      } else {
        setReq_id((java.lang.Integer)value);
      }
      break;

    case CURRENT_TIME_REQ:
      if (value == null) {
        unsetCurrent_time_req();
      } else {
        setCurrent_time_req((java.lang.Long)value);
      }
      break;

    case CURRENT_TIME_RES:
      if (value == null) {
        unsetCurrent_time_res();
      } else {
        setCurrent_time_res((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return getError_code();

    case ERROR_TEXT:
      return getError_text();

    case REQ_ID:
      return getReq_id();

    case CURRENT_TIME_REQ:
      return getCurrent_time_req();

    case CURRENT_TIME_RES:
      return getCurrent_time_res();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetError_code();
    case ERROR_TEXT:
      return isSetError_text();
    case REQ_ID:
      return isSetReq_id();
    case CURRENT_TIME_REQ:
      return isSetCurrent_time_req();
    case CURRENT_TIME_RES:
      return isSetCurrent_time_res();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof KeepAliveRes)
      return this.equals((KeepAliveRes)that);
    return false;
  }

  public boolean equals(KeepAliveRes that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error_code = true;
    boolean that_present_error_code = true;
    if (this_present_error_code || that_present_error_code) {
      if (!(this_present_error_code && that_present_error_code))
        return false;
      if (this.error_code != that.error_code)
        return false;
    }

    boolean this_present_error_text = true && this.isSetError_text();
    boolean that_present_error_text = true && that.isSetError_text();
    if (this_present_error_text || that_present_error_text) {
      if (!(this_present_error_text && that_present_error_text))
        return false;
      if (!this.error_text.equals(that.error_text))
        return false;
    }

    boolean this_present_req_id = true;
    boolean that_present_req_id = true;
    if (this_present_req_id || that_present_req_id) {
      if (!(this_present_req_id && that_present_req_id))
        return false;
      if (this.req_id != that.req_id)
        return false;
    }

    boolean this_present_current_time_req = true;
    boolean that_present_current_time_req = true;
    if (this_present_current_time_req || that_present_current_time_req) {
      if (!(this_present_current_time_req && that_present_current_time_req))
        return false;
      if (this.current_time_req != that.current_time_req)
        return false;
    }

    boolean this_present_current_time_res = true;
    boolean that_present_current_time_res = true;
    if (this_present_current_time_res || that_present_current_time_res) {
      if (!(this_present_current_time_res && that_present_current_time_res))
        return false;
      if (this.current_time_res != that.current_time_res)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + error_code;

    hashCode = hashCode * 8191 + ((isSetError_text()) ? 131071 : 524287);
    if (isSetError_text())
      hashCode = hashCode * 8191 + error_text.hashCode();

    hashCode = hashCode * 8191 + req_id;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(current_time_req);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(current_time_res);

    return hashCode;
  }


  public int compareTo(KeepAliveRes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetError_code()).compareTo(other.isSetError_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_code, other.error_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetError_text()).compareTo(other.isSetError_text());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_text()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_text, other.error_text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReq_id()).compareTo(other.isSetReq_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReq_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req_id, other.req_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrent_time_req()).compareTo(other.isSetCurrent_time_req());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrent_time_req()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_time_req, other.current_time_req);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrent_time_res()).compareTo(other.isSetCurrent_time_res());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrent_time_res()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_time_res, other.current_time_res);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeepAliveRes(");
    boolean first = true;

    sb.append("error_code:");
    sb.append(this.error_code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("error_text:");
    if (this.error_text == null) {
      sb.append("null");
    } else {
      sb.append(this.error_text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("req_id:");
    sb.append(this.req_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("current_time_req:");
    sb.append(this.current_time_req);
    first = false;
    if (!first) sb.append(", ");
    sb.append("current_time_res:");
    sb.append(this.current_time_res);
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

  private static class KeepAliveResStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeepAliveResStandardScheme getScheme() {
      return new KeepAliveResStandardScheme();
    }
  }

  private static class KeepAliveResStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeepAliveRes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeepAliveRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.error_code = iprot.readI16();
              struct.setError_codeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error_text = iprot.readString();
              struct.setError_textIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.req_id = iprot.readI32();
              struct.setReq_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CURRENT_TIME_REQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.current_time_req = iprot.readI64();
              struct.setCurrent_time_reqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CURRENT_TIME_RES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.current_time_res = iprot.readI64();
              struct.setCurrent_time_resIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeepAliveRes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI16(struct.error_code);
      oprot.writeFieldEnd();
      if (struct.error_text != null) {
        oprot.writeFieldBegin(ERROR_TEXT_FIELD_DESC);
        oprot.writeString(struct.error_text);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REQ_ID_FIELD_DESC);
      oprot.writeI32(struct.req_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CURRENT_TIME_REQ_FIELD_DESC);
      oprot.writeI64(struct.current_time_req);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CURRENT_TIME_RES_FIELD_DESC);
      oprot.writeI64(struct.current_time_res);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeepAliveResTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeepAliveResTupleScheme getScheme() {
      return new KeepAliveResTupleScheme();
    }
  }

  private static class KeepAliveResTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeepAliveRes> {


    public void write(org.apache.thrift.protocol.TProtocol prot, KeepAliveRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError_code()) {
        optionals.set(0);
      }
      if (struct.isSetError_text()) {
        optionals.set(1);
      }
      if (struct.isSetReq_id()) {
        optionals.set(2);
      }
      if (struct.isSetCurrent_time_req()) {
        optionals.set(3);
      }
      if (struct.isSetCurrent_time_res()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetError_code()) {
        oprot.writeI16(struct.error_code);
      }
      if (struct.isSetError_text()) {
        oprot.writeString(struct.error_text);
      }
      if (struct.isSetReq_id()) {
        oprot.writeI32(struct.req_id);
      }
      if (struct.isSetCurrent_time_req()) {
        oprot.writeI64(struct.current_time_req);
      }
      if (struct.isSetCurrent_time_res()) {
        oprot.writeI64(struct.current_time_res);
      }
    }


    public void read(org.apache.thrift.protocol.TProtocol prot, KeepAliveRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.error_code = iprot.readI16();
        struct.setError_codeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_text = iprot.readString();
        struct.setError_textIsSet(true);
      }
      if (incoming.get(2)) {
        struct.req_id = iprot.readI32();
        struct.setReq_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.current_time_req = iprot.readI64();
        struct.setCurrent_time_reqIsSet(true);
      }
      if (incoming.get(4)) {
        struct.current_time_res = iprot.readI64();
        struct.setCurrent_time_resIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

