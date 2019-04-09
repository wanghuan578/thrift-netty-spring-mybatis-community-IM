/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.spirit.thrift.socketserver.rpc.thrift;
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-04-08")
public class HelloNotify implements org.apache.thrift.TBase<HelloNotify, HelloNotify._Fields>, java.io.Serializable, Cloneable, Comparable<HelloNotify> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HelloNotify");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("error_code", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("error_text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("service_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("service_id", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SERVER_RANDOM_FIELD_DESC = new org.apache.thrift.protocol.TField("server_random", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField SERVER_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("server_time", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HelloNotifyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HelloNotifyTupleSchemeFactory();

  public short error_code; // required
  public java.lang.String error_text; // required
  public java.lang.String service_name; // required
  public int service_id; // required
  public long server_random; // required
  public long server_time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "error_code"),
    ERROR_TEXT((short)2, "error_text"),
    SERVICE_NAME((short)3, "service_name"),
    SERVICE_ID((short)4, "service_id"),
    SERVER_RANDOM((short)5, "server_random"),
    SERVER_TIME((short)6, "server_time");

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
        case 3: // SERVICE_NAME
          return SERVICE_NAME;
        case 4: // SERVICE_ID
          return SERVICE_ID;
        case 5: // SERVER_RANDOM
          return SERVER_RANDOM;
        case 6: // SERVER_TIME
          return SERVER_TIME;
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
  private static final int __SERVICE_ID_ISSET_ID = 1;
  private static final int __SERVER_RANDOM_ISSET_ID = 2;
  private static final int __SERVER_TIME_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("error_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.ERROR_TEXT, new org.apache.thrift.meta_data.FieldMetaData("error_text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("service_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("service_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SERVER_RANDOM, new org.apache.thrift.meta_data.FieldMetaData("server_random", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SERVER_TIME, new org.apache.thrift.meta_data.FieldMetaData("server_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HelloNotify.class, metaDataMap);
  }

  public HelloNotify() {
  }

  public HelloNotify(
    short error_code,
    java.lang.String error_text,
    java.lang.String service_name,
    int service_id,
    long server_random,
    long server_time)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.error_text = error_text;
    this.service_name = service_name;
    this.service_id = service_id;
    setService_idIsSet(true);
    this.server_random = server_random;
    setServer_randomIsSet(true);
    this.server_time = server_time;
    setServer_timeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HelloNotify(HelloNotify other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error_code = other.error_code;
    if (other.isSetError_text()) {
      this.error_text = other.error_text;
    }
    if (other.isSetService_name()) {
      this.service_name = other.service_name;
    }
    this.service_id = other.service_id;
    this.server_random = other.server_random;
    this.server_time = other.server_time;
  }

  public HelloNotify deepCopy() {
    return new HelloNotify(this);
  }

  public void clear() {
    setError_codeIsSet(false);
    this.error_code = 0;
    this.error_text = null;
    this.service_name = null;
    setService_idIsSet(false);
    this.service_id = 0;
    setServer_randomIsSet(false);
    this.server_random = 0;
    setServer_timeIsSet(false);
    this.server_time = 0;
  }

  public short getError_code() {
    return this.error_code;
  }

  public HelloNotify setError_code(short error_code) {
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

  public HelloNotify setError_text(java.lang.String error_text) {
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

  public java.lang.String getService_name() {
    return this.service_name;
  }

  public HelloNotify setService_name(java.lang.String service_name) {
    this.service_name = service_name;
    return this;
  }

  public void unsetService_name() {
    this.service_name = null;
  }

  /** Returns true if field service_name is set (has been assigned a value) and false otherwise */
  public boolean isSetService_name() {
    return this.service_name != null;
  }

  public void setService_nameIsSet(boolean value) {
    if (!value) {
      this.service_name = null;
    }
  }

  public int getService_id() {
    return this.service_id;
  }

  public HelloNotify setService_id(int service_id) {
    this.service_id = service_id;
    setService_idIsSet(true);
    return this;
  }

  public void unsetService_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SERVICE_ID_ISSET_ID);
  }

  /** Returns true if field service_id is set (has been assigned a value) and false otherwise */
  public boolean isSetService_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SERVICE_ID_ISSET_ID);
  }

  public void setService_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SERVICE_ID_ISSET_ID, value);
  }

  public long getServer_random() {
    return this.server_random;
  }

  public HelloNotify setServer_random(long server_random) {
    this.server_random = server_random;
    setServer_randomIsSet(true);
    return this;
  }

  public void unsetServer_random() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SERVER_RANDOM_ISSET_ID);
  }

  /** Returns true if field server_random is set (has been assigned a value) and false otherwise */
  public boolean isSetServer_random() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SERVER_RANDOM_ISSET_ID);
  }

  public void setServer_randomIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SERVER_RANDOM_ISSET_ID, value);
  }

  public long getServer_time() {
    return this.server_time;
  }

  public HelloNotify setServer_time(long server_time) {
    this.server_time = server_time;
    setServer_timeIsSet(true);
    return this;
  }

  public void unsetServer_time() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SERVER_TIME_ISSET_ID);
  }

  /** Returns true if field server_time is set (has been assigned a value) and false otherwise */
  public boolean isSetServer_time() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SERVER_TIME_ISSET_ID);
  }

  public void setServer_timeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SERVER_TIME_ISSET_ID, value);
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

    case SERVICE_NAME:
      if (value == null) {
        unsetService_name();
      } else {
        setService_name((java.lang.String)value);
      }
      break;

    case SERVICE_ID:
      if (value == null) {
        unsetService_id();
      } else {
        setService_id((java.lang.Integer)value);
      }
      break;

    case SERVER_RANDOM:
      if (value == null) {
        unsetServer_random();
      } else {
        setServer_random((java.lang.Long)value);
      }
      break;

    case SERVER_TIME:
      if (value == null) {
        unsetServer_time();
      } else {
        setServer_time((java.lang.Long)value);
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

    case SERVICE_NAME:
      return getService_name();

    case SERVICE_ID:
      return getService_id();

    case SERVER_RANDOM:
      return getServer_random();

    case SERVER_TIME:
      return getServer_time();

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
    case SERVICE_NAME:
      return isSetService_name();
    case SERVICE_ID:
      return isSetService_id();
    case SERVER_RANDOM:
      return isSetServer_random();
    case SERVER_TIME:
      return isSetServer_time();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HelloNotify)
      return this.equals((HelloNotify)that);
    return false;
  }

  public boolean equals(HelloNotify that) {
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

    boolean this_present_service_name = true && this.isSetService_name();
    boolean that_present_service_name = true && that.isSetService_name();
    if (this_present_service_name || that_present_service_name) {
      if (!(this_present_service_name && that_present_service_name))
        return false;
      if (!this.service_name.equals(that.service_name))
        return false;
    }

    boolean this_present_service_id = true;
    boolean that_present_service_id = true;
    if (this_present_service_id || that_present_service_id) {
      if (!(this_present_service_id && that_present_service_id))
        return false;
      if (this.service_id != that.service_id)
        return false;
    }

    boolean this_present_server_random = true;
    boolean that_present_server_random = true;
    if (this_present_server_random || that_present_server_random) {
      if (!(this_present_server_random && that_present_server_random))
        return false;
      if (this.server_random != that.server_random)
        return false;
    }

    boolean this_present_server_time = true;
    boolean that_present_server_time = true;
    if (this_present_server_time || that_present_server_time) {
      if (!(this_present_server_time && that_present_server_time))
        return false;
      if (this.server_time != that.server_time)
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

    hashCode = hashCode * 8191 + ((isSetService_name()) ? 131071 : 524287);
    if (isSetService_name())
      hashCode = hashCode * 8191 + service_name.hashCode();

    hashCode = hashCode * 8191 + service_id;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(server_random);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(server_time);

    return hashCode;
  }

  public int compareTo(HelloNotify other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetService_name()).compareTo(other.isSetService_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetService_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.service_name, other.service_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetService_id()).compareTo(other.isSetService_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetService_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.service_id, other.service_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetServer_random()).compareTo(other.isSetServer_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer_random()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server_random, other.server_random);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetServer_time()).compareTo(other.isSetServer_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server_time, other.server_time);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HelloNotify(");
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
    sb.append("service_name:");
    if (this.service_name == null) {
      sb.append("null");
    } else {
      sb.append(this.service_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("service_id:");
    sb.append(this.service_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("server_random:");
    sb.append(this.server_random);
    first = false;
    if (!first) sb.append(", ");
    sb.append("server_time:");
    sb.append(this.server_time);
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

  private static class HelloNotifyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HelloNotifyStandardScheme getScheme() {
      return new HelloNotifyStandardScheme();
    }
  }

  private static class HelloNotifyStandardScheme extends org.apache.thrift.scheme.StandardScheme<HelloNotify> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HelloNotify struct) throws org.apache.thrift.TException {
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
          case 3: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.service_name = iprot.readString();
              struct.setService_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SERVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.service_id = iprot.readI32();
              struct.setService_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SERVER_RANDOM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.server_random = iprot.readI64();
              struct.setServer_randomIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SERVER_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.server_time = iprot.readI64();
              struct.setServer_timeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HelloNotify struct) throws org.apache.thrift.TException {
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
      if (struct.service_name != null) {
        oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.service_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SERVICE_ID_FIELD_DESC);
      oprot.writeI32(struct.service_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SERVER_RANDOM_FIELD_DESC);
      oprot.writeI64(struct.server_random);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SERVER_TIME_FIELD_DESC);
      oprot.writeI64(struct.server_time);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HelloNotifyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HelloNotifyTupleScheme getScheme() {
      return new HelloNotifyTupleScheme();
    }
  }

  private static class HelloNotifyTupleScheme extends org.apache.thrift.scheme.TupleScheme<HelloNotify> {

    public void write(org.apache.thrift.protocol.TProtocol prot, HelloNotify struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError_code()) {
        optionals.set(0);
      }
      if (struct.isSetError_text()) {
        optionals.set(1);
      }
      if (struct.isSetService_name()) {
        optionals.set(2);
      }
      if (struct.isSetService_id()) {
        optionals.set(3);
      }
      if (struct.isSetServer_random()) {
        optionals.set(4);
      }
      if (struct.isSetServer_time()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetError_code()) {
        oprot.writeI16(struct.error_code);
      }
      if (struct.isSetError_text()) {
        oprot.writeString(struct.error_text);
      }
      if (struct.isSetService_name()) {
        oprot.writeString(struct.service_name);
      }
      if (struct.isSetService_id()) {
        oprot.writeI32(struct.service_id);
      }
      if (struct.isSetServer_random()) {
        oprot.writeI64(struct.server_random);
      }
      if (struct.isSetServer_time()) {
        oprot.writeI64(struct.server_time);
      }
    }

    public void read(org.apache.thrift.protocol.TProtocol prot, HelloNotify struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.error_code = iprot.readI16();
        struct.setError_codeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_text = iprot.readString();
        struct.setError_textIsSet(true);
      }
      if (incoming.get(2)) {
        struct.service_name = iprot.readString();
        struct.setService_nameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.service_id = iprot.readI32();
        struct.setService_idIsSet(true);
      }
      if (incoming.get(4)) {
        struct.server_random = iprot.readI64();
        struct.setServer_randomIsSet(true);
      }
      if (incoming.get(5)) {
        struct.server_time = iprot.readI64();
        struct.setServer_timeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

