/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.spirit.thrift.socketserver.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-21")
public class SystemInfo implements org.apache.thrift.TBase<SystemInfo, SystemInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SystemInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SystemInfo");

  private static final org.apache.thrift.protocol.TField CPU_USAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("cpu_usage", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField MEMORY_USAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("memory_usage", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField HD_USAGE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("hd_usage_list", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField WORKLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("workload", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SystemInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SystemInfoTupleSchemeFactory();

  public double cpu_usage; // required
  public double memory_usage; // required
  public java.util.List<HdTuple> hd_usage_list; // required
  public double workload; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CPU_USAGE((short)1, "cpu_usage"),
    MEMORY_USAGE((short)2, "memory_usage"),
    HD_USAGE_LIST((short)3, "hd_usage_list"),
    WORKLOAD((short)4, "workload");

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
        case 1: // CPU_USAGE
          return CPU_USAGE;
        case 2: // MEMORY_USAGE
          return MEMORY_USAGE;
        case 3: // HD_USAGE_LIST
          return HD_USAGE_LIST;
        case 4: // WORKLOAD
          return WORKLOAD;
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
  private static final int __CPU_USAGE_ISSET_ID = 0;
  private static final int __MEMORY_USAGE_ISSET_ID = 1;
  private static final int __WORKLOAD_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CPU_USAGE, new org.apache.thrift.meta_data.FieldMetaData("cpu_usage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MEMORY_USAGE, new org.apache.thrift.meta_data.FieldMetaData("memory_usage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.HD_USAGE_LIST, new org.apache.thrift.meta_data.FieldMetaData("hd_usage_list", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HdTuple.class))));
    tmpMap.put(_Fields.WORKLOAD, new org.apache.thrift.meta_data.FieldMetaData("workload", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SystemInfo.class, metaDataMap);
  }

  public SystemInfo() {
  }

  public SystemInfo(
    double cpu_usage,
    double memory_usage,
    java.util.List<HdTuple> hd_usage_list,
    double workload)
  {
    this();
    this.cpu_usage = cpu_usage;
    setCpu_usageIsSet(true);
    this.memory_usage = memory_usage;
    setMemory_usageIsSet(true);
    this.hd_usage_list = hd_usage_list;
    this.workload = workload;
    setWorkloadIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SystemInfo(SystemInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cpu_usage = other.cpu_usage;
    this.memory_usage = other.memory_usage;
    if (other.isSetHd_usage_list()) {
      java.util.List<HdTuple> __this__hd_usage_list = new java.util.ArrayList<HdTuple>(other.hd_usage_list.size());
      for (HdTuple other_element : other.hd_usage_list) {
        __this__hd_usage_list.add(new HdTuple(other_element));
      }
      this.hd_usage_list = __this__hd_usage_list;
    }
    this.workload = other.workload;
  }

  public SystemInfo deepCopy() {
    return new SystemInfo(this);
  }

  @Override
  public void clear() {
    setCpu_usageIsSet(false);
    this.cpu_usage = 0.0;
    setMemory_usageIsSet(false);
    this.memory_usage = 0.0;
    this.hd_usage_list = null;
    setWorkloadIsSet(false);
    this.workload = 0.0;
  }

  public double getCpu_usage() {
    return this.cpu_usage;
  }

  public SystemInfo setCpu_usage(double cpu_usage) {
    this.cpu_usage = cpu_usage;
    setCpu_usageIsSet(true);
    return this;
  }

  public void unsetCpu_usage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CPU_USAGE_ISSET_ID);
  }

  /** Returns true if field cpu_usage is set (has been assigned a value) and false otherwise */
  public boolean isSetCpu_usage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CPU_USAGE_ISSET_ID);
  }

  public void setCpu_usageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CPU_USAGE_ISSET_ID, value);
  }

  public double getMemory_usage() {
    return this.memory_usage;
  }

  public SystemInfo setMemory_usage(double memory_usage) {
    this.memory_usage = memory_usage;
    setMemory_usageIsSet(true);
    return this;
  }

  public void unsetMemory_usage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MEMORY_USAGE_ISSET_ID);
  }

  /** Returns true if field memory_usage is set (has been assigned a value) and false otherwise */
  public boolean isSetMemory_usage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MEMORY_USAGE_ISSET_ID);
  }

  public void setMemory_usageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MEMORY_USAGE_ISSET_ID, value);
  }

  public int getHd_usage_listSize() {
    return (this.hd_usage_list == null) ? 0 : this.hd_usage_list.size();
  }

  public java.util.Iterator<HdTuple> getHd_usage_listIterator() {
    return (this.hd_usage_list == null) ? null : this.hd_usage_list.iterator();
  }

  public void addToHd_usage_list(HdTuple elem) {
    if (this.hd_usage_list == null) {
      this.hd_usage_list = new java.util.ArrayList<HdTuple>();
    }
    this.hd_usage_list.add(elem);
  }

  public java.util.List<HdTuple> getHd_usage_list() {
    return this.hd_usage_list;
  }

  public SystemInfo setHd_usage_list(java.util.List<HdTuple> hd_usage_list) {
    this.hd_usage_list = hd_usage_list;
    return this;
  }

  public void unsetHd_usage_list() {
    this.hd_usage_list = null;
  }

  /** Returns true if field hd_usage_list is set (has been assigned a value) and false otherwise */
  public boolean isSetHd_usage_list() {
    return this.hd_usage_list != null;
  }

  public void setHd_usage_listIsSet(boolean value) {
    if (!value) {
      this.hd_usage_list = null;
    }
  }

  public double getWorkload() {
    return this.workload;
  }

  public SystemInfo setWorkload(double workload) {
    this.workload = workload;
    setWorkloadIsSet(true);
    return this;
  }

  public void unsetWorkload() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WORKLOAD_ISSET_ID);
  }

  /** Returns true if field workload is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkload() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WORKLOAD_ISSET_ID);
  }

  public void setWorkloadIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WORKLOAD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CPU_USAGE:
      if (value == null) {
        unsetCpu_usage();
      } else {
        setCpu_usage((java.lang.Double)value);
      }
      break;

    case MEMORY_USAGE:
      if (value == null) {
        unsetMemory_usage();
      } else {
        setMemory_usage((java.lang.Double)value);
      }
      break;

    case HD_USAGE_LIST:
      if (value == null) {
        unsetHd_usage_list();
      } else {
        setHd_usage_list((java.util.List<HdTuple>)value);
      }
      break;

    case WORKLOAD:
      if (value == null) {
        unsetWorkload();
      } else {
        setWorkload((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CPU_USAGE:
      return getCpu_usage();

    case MEMORY_USAGE:
      return getMemory_usage();

    case HD_USAGE_LIST:
      return getHd_usage_list();

    case WORKLOAD:
      return getWorkload();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CPU_USAGE:
      return isSetCpu_usage();
    case MEMORY_USAGE:
      return isSetMemory_usage();
    case HD_USAGE_LIST:
      return isSetHd_usage_list();
    case WORKLOAD:
      return isSetWorkload();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SystemInfo)
      return this.equals((SystemInfo)that);
    return false;
  }

  public boolean equals(SystemInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cpu_usage = true;
    boolean that_present_cpu_usage = true;
    if (this_present_cpu_usage || that_present_cpu_usage) {
      if (!(this_present_cpu_usage && that_present_cpu_usage))
        return false;
      if (this.cpu_usage != that.cpu_usage)
        return false;
    }

    boolean this_present_memory_usage = true;
    boolean that_present_memory_usage = true;
    if (this_present_memory_usage || that_present_memory_usage) {
      if (!(this_present_memory_usage && that_present_memory_usage))
        return false;
      if (this.memory_usage != that.memory_usage)
        return false;
    }

    boolean this_present_hd_usage_list = true && this.isSetHd_usage_list();
    boolean that_present_hd_usage_list = true && that.isSetHd_usage_list();
    if (this_present_hd_usage_list || that_present_hd_usage_list) {
      if (!(this_present_hd_usage_list && that_present_hd_usage_list))
        return false;
      if (!this.hd_usage_list.equals(that.hd_usage_list))
        return false;
    }

    boolean this_present_workload = true;
    boolean that_present_workload = true;
    if (this_present_workload || that_present_workload) {
      if (!(this_present_workload && that_present_workload))
        return false;
      if (this.workload != that.workload)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cpu_usage);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(memory_usage);

    hashCode = hashCode * 8191 + ((isSetHd_usage_list()) ? 131071 : 524287);
    if (isSetHd_usage_list())
      hashCode = hashCode * 8191 + hd_usage_list.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(workload);

    return hashCode;
  }

  @Override
  public int compareTo(SystemInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCpu_usage()).compareTo(other.isSetCpu_usage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpu_usage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cpu_usage, other.cpu_usage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMemory_usage()).compareTo(other.isSetMemory_usage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemory_usage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memory_usage, other.memory_usage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHd_usage_list()).compareTo(other.isSetHd_usage_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHd_usage_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hd_usage_list, other.hd_usage_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWorkload()).compareTo(other.isSetWorkload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkload()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workload, other.workload);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SystemInfo(");
    boolean first = true;

    sb.append("cpu_usage:");
    sb.append(this.cpu_usage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("memory_usage:");
    sb.append(this.memory_usage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hd_usage_list:");
    if (this.hd_usage_list == null) {
      sb.append("null");
    } else {
      sb.append(this.hd_usage_list);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workload:");
    sb.append(this.workload);
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

  private static class SystemInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SystemInfoStandardScheme getScheme() {
      return new SystemInfoStandardScheme();
    }
  }

  private static class SystemInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SystemInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SystemInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CPU_USAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.cpu_usage = iprot.readDouble();
              struct.setCpu_usageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEMORY_USAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.memory_usage = iprot.readDouble();
              struct.setMemory_usageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HD_USAGE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.hd_usage_list = new java.util.ArrayList<HdTuple>(_list0.size);
                HdTuple _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new HdTuple();
                  _elem1.read(iprot);
                  struct.hd_usage_list.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setHd_usage_listIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WORKLOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.workload = iprot.readDouble();
              struct.setWorkloadIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SystemInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CPU_USAGE_FIELD_DESC);
      oprot.writeDouble(struct.cpu_usage);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MEMORY_USAGE_FIELD_DESC);
      oprot.writeDouble(struct.memory_usage);
      oprot.writeFieldEnd();
      if (struct.hd_usage_list != null) {
        oprot.writeFieldBegin(HD_USAGE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.hd_usage_list.size()));
          for (HdTuple _iter3 : struct.hd_usage_list)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WORKLOAD_FIELD_DESC);
      oprot.writeDouble(struct.workload);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SystemInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SystemInfoTupleScheme getScheme() {
      return new SystemInfoTupleScheme();
    }
  }

  private static class SystemInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SystemInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SystemInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCpu_usage()) {
        optionals.set(0);
      }
      if (struct.isSetMemory_usage()) {
        optionals.set(1);
      }
      if (struct.isSetHd_usage_list()) {
        optionals.set(2);
      }
      if (struct.isSetWorkload()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCpu_usage()) {
        oprot.writeDouble(struct.cpu_usage);
      }
      if (struct.isSetMemory_usage()) {
        oprot.writeDouble(struct.memory_usage);
      }
      if (struct.isSetHd_usage_list()) {
        {
          oprot.writeI32(struct.hd_usage_list.size());
          for (HdTuple _iter4 : struct.hd_usage_list)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetWorkload()) {
        oprot.writeDouble(struct.workload);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SystemInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.cpu_usage = iprot.readDouble();
        struct.setCpu_usageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.memory_usage = iprot.readDouble();
        struct.setMemory_usageIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.hd_usage_list = new java.util.ArrayList<HdTuple>(_list5.size);
          HdTuple _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new HdTuple();
            _elem6.read(iprot);
            struct.hd_usage_list.add(_elem6);
          }
        }
        struct.setHd_usage_listIsSet(true);
      }
      if (incoming.get(3)) {
        struct.workload = iprot.readDouble();
        struct.setWorkloadIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

