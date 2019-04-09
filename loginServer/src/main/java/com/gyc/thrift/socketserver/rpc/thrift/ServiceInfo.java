package com.gyc.thrift.socketserver.rpc.thrift;
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-04-08")
public class ServiceInfo implements org.apache.thrift.TBase<ServiceInfo, ServiceInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ServiceInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServiceInfo");

  private static final org.apache.thrift.protocol.TField SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("service_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("service_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERVICE_WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("service_weight", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField SERVICE_ADDR_FIELD_DESC = new org.apache.thrift.protocol.TField("service_addr", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ServiceInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ServiceInfoTupleSchemeFactory();

  public int service_id; // required
  public java.lang.String service_name; // required
  public short service_weight; // required
  public ServiceAddr service_addr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERVICE_ID((short)1, "service_id"),
    SERVICE_NAME((short)2, "service_name"),
    SERVICE_WEIGHT((short)3, "service_weight"),
    SERVICE_ADDR((short)4, "service_addr");

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
        case 1: // SERVICE_ID
          return SERVICE_ID;
        case 2: // SERVICE_NAME
          return SERVICE_NAME;
        case 3: // SERVICE_WEIGHT
          return SERVICE_WEIGHT;
        case 4: // SERVICE_ADDR
          return SERVICE_ADDR;
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
  private static final int __SERVICE_ID_ISSET_ID = 0;
  private static final int __SERVICE_WEIGHT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("service_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("service_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICE_WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("service_weight", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SERVICE_ADDR, new org.apache.thrift.meta_data.FieldMetaData("service_addr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ServiceAddr.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServiceInfo.class, metaDataMap);
  }

  public ServiceInfo() {
  }

  public ServiceInfo(
    int service_id,
    java.lang.String service_name,
    short service_weight,
    ServiceAddr service_addr)
  {
    this();
    this.service_id = service_id;
    setService_idIsSet(true);
    this.service_name = service_name;
    this.service_weight = service_weight;
    setService_weightIsSet(true);
    this.service_addr = service_addr;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceInfo(ServiceInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.service_id = other.service_id;
    if (other.isSetService_name()) {
      this.service_name = other.service_name;
    }
    this.service_weight = other.service_weight;
    if (other.isSetService_addr()) {
      this.service_addr = new ServiceAddr(other.service_addr);
    }
  }

  public ServiceInfo deepCopy() {
    return new ServiceInfo(this);
  }

  @Override
  public void clear() {
    setService_idIsSet(false);
    this.service_id = 0;
    this.service_name = null;
    setService_weightIsSet(false);
    this.service_weight = 0;
    this.service_addr = null;
  }

  public int getService_id() {
    return this.service_id;
  }

  public ServiceInfo setService_id(int service_id) {
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

  public java.lang.String getService_name() {
    return this.service_name;
  }

  public ServiceInfo setService_name(java.lang.String service_name) {
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

  public short getService_weight() {
    return this.service_weight;
  }

  public ServiceInfo setService_weight(short service_weight) {
    this.service_weight = service_weight;
    setService_weightIsSet(true);
    return this;
  }

  public void unsetService_weight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SERVICE_WEIGHT_ISSET_ID);
  }

  /** Returns true if field service_weight is set (has been assigned a value) and false otherwise */
  public boolean isSetService_weight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SERVICE_WEIGHT_ISSET_ID);
  }

  public void setService_weightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SERVICE_WEIGHT_ISSET_ID, value);
  }

  public ServiceAddr getService_addr() {
    return this.service_addr;
  }

  public ServiceInfo setService_addr(ServiceAddr service_addr) {
    this.service_addr = service_addr;
    return this;
  }

  public void unsetService_addr() {
    this.service_addr = null;
  }

  /** Returns true if field service_addr is set (has been assigned a value) and false otherwise */
  public boolean isSetService_addr() {
    return this.service_addr != null;
  }

  public void setService_addrIsSet(boolean value) {
    if (!value) {
      this.service_addr = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SERVICE_ID:
      if (value == null) {
        unsetService_id();
      } else {
        setService_id((java.lang.Integer)value);
      }
      break;

    case SERVICE_NAME:
      if (value == null) {
        unsetService_name();
      } else {
        setService_name((java.lang.String)value);
      }
      break;

    case SERVICE_WEIGHT:
      if (value == null) {
        unsetService_weight();
      } else {
        setService_weight((java.lang.Short)value);
      }
      break;

    case SERVICE_ADDR:
      if (value == null) {
        unsetService_addr();
      } else {
        setService_addr((ServiceAddr)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVICE_ID:
      return getService_id();

    case SERVICE_NAME:
      return getService_name();

    case SERVICE_WEIGHT:
      return getService_weight();

    case SERVICE_ADDR:
      return getService_addr();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SERVICE_ID:
      return isSetService_id();
    case SERVICE_NAME:
      return isSetService_name();
    case SERVICE_WEIGHT:
      return isSetService_weight();
    case SERVICE_ADDR:
      return isSetService_addr();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceInfo)
      return this.equals((ServiceInfo)that);
    return false;
  }

  public boolean equals(ServiceInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_service_id = true;
    boolean that_present_service_id = true;
    if (this_present_service_id || that_present_service_id) {
      if (!(this_present_service_id && that_present_service_id))
        return false;
      if (this.service_id != that.service_id)
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

    boolean this_present_service_weight = true;
    boolean that_present_service_weight = true;
    if (this_present_service_weight || that_present_service_weight) {
      if (!(this_present_service_weight && that_present_service_weight))
        return false;
      if (this.service_weight != that.service_weight)
        return false;
    }

    boolean this_present_service_addr = true && this.isSetService_addr();
    boolean that_present_service_addr = true && that.isSetService_addr();
    if (this_present_service_addr || that_present_service_addr) {
      if (!(this_present_service_addr && that_present_service_addr))
        return false;
      if (!this.service_addr.equals(that.service_addr))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + service_id;

    hashCode = hashCode * 8191 + ((isSetService_name()) ? 131071 : 524287);
    if (isSetService_name())
      hashCode = hashCode * 8191 + service_name.hashCode();

    hashCode = hashCode * 8191 + service_weight;

    hashCode = hashCode * 8191 + ((isSetService_addr()) ? 131071 : 524287);
    if (isSetService_addr())
      hashCode = hashCode * 8191 + service_addr.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ServiceInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetService_weight()).compareTo(other.isSetService_weight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetService_weight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.service_weight, other.service_weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetService_addr()).compareTo(other.isSetService_addr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetService_addr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.service_addr, other.service_addr);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceInfo(");
    boolean first = true;

    sb.append("service_id:");
    sb.append(this.service_id);
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
    sb.append("service_weight:");
    sb.append(this.service_weight);
    first = false;
    if (!first) sb.append(", ");
    sb.append("service_addr:");
    if (this.service_addr == null) {
      sb.append("null");
    } else {
      sb.append(this.service_addr);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (service_addr != null) {
      service_addr.validate();
    }
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

  private static class ServiceInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ServiceInfoStandardScheme getScheme() {
      return new ServiceInfoStandardScheme();
    }
  }

  private static class ServiceInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ServiceInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.service_id = iprot.readI32();
              struct.setService_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.service_name = iprot.readString();
              struct.setService_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERVICE_WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.service_weight = iprot.readI16();
              struct.setService_weightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SERVICE_ADDR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.service_addr = new ServiceAddr();
              struct.service_addr.read(iprot);
              struct.setService_addrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServiceInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SERVICE_ID_FIELD_DESC);
      oprot.writeI32(struct.service_id);
      oprot.writeFieldEnd();
      if (struct.service_name != null) {
        oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.service_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SERVICE_WEIGHT_FIELD_DESC);
      oprot.writeI16(struct.service_weight);
      oprot.writeFieldEnd();
      if (struct.service_addr != null) {
        oprot.writeFieldBegin(SERVICE_ADDR_FIELD_DESC);
        struct.service_addr.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServiceInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ServiceInfoTupleScheme getScheme() {
      return new ServiceInfoTupleScheme();
    }
  }

  private static class ServiceInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ServiceInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetService_id()) {
        optionals.set(0);
      }
      if (struct.isSetService_name()) {
        optionals.set(1);
      }
      if (struct.isSetService_weight()) {
        optionals.set(2);
      }
      if (struct.isSetService_addr()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetService_id()) {
        oprot.writeI32(struct.service_id);
      }
      if (struct.isSetService_name()) {
        oprot.writeString(struct.service_name);
      }
      if (struct.isSetService_weight()) {
        oprot.writeI16(struct.service_weight);
      }
      if (struct.isSetService_addr()) {
        struct.service_addr.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.service_id = iprot.readI32();
        struct.setService_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.service_name = iprot.readString();
        struct.setService_nameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.service_weight = iprot.readI16();
        struct.setService_weightIsSet(true);
      }
      if (incoming.get(3)) {
        struct.service_addr = new ServiceAddr();
        struct.service_addr.read(iprot);
        struct.setService_addrIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

