package com.gyc.thrift.socketserver.rpc.thrift;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ClientPasswordLoginReq implements TBase<ClientPasswordLoginReq, ClientPasswordLoginReq._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ClientPasswordLoginReq");

  private static final TField LOGNAME_TYPE_FIELD_DESC = new TField("logname_type", TType.I16, (short)1);
  private static final TField LOGNAME_FIELD_DESC = new TField("logname", TType.STRING, (short)2);
  private static final TField CLIENT_RANDOM_FIELD_DESC = new TField("client_random", TType.I64, (short)3);
  private static final TField CLIENT_MAC_FIELD_DESC = new TField("client_mac", TType.STRING, (short)4);
  private static final TField CLIENT_VERSION_FIELD_DESC = new TField("client_version", TType.STRING, (short)5);
  private static final TField CHECKSUM_FIELD_DESC = new TField("checksum", TType.STRING, (short)6);

  public short logname_type;
  public String logname;
  public long client_random;
  public String client_mac;
  public String client_version;
  public String checksum;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    LOGNAME_TYPE((short)1, "logname_type"),
    LOGNAME((short)2, "logname"),
    CLIENT_RANDOM((short)3, "client_random"),
    CLIENT_MAC((short)4, "client_mac"),
    CLIENT_VERSION((short)5, "client_version"),
    CHECKSUM((short)6, "checksum");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOGNAME_TYPE
          return LOGNAME_TYPE;
        case 2: // LOGNAME
          return LOGNAME;
        case 3: // CLIENT_RANDOM
          return CLIENT_RANDOM;
        case 4: // CLIENT_MAC
          return CLIENT_MAC;
        case 5: // CLIENT_VERSION
          return CLIENT_VERSION;
        case 6: // CHECKSUM
          return CHECKSUM;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LOGNAME_TYPE_ISSET_ID = 0;
  private static final int __CLIENT_RANDOM_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOGNAME_TYPE, new FieldMetaData("logname_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.LOGNAME, new FieldMetaData("logname", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CLIENT_RANDOM, new FieldMetaData("client_random", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.CLIENT_MAC, new FieldMetaData("client_mac", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CLIENT_VERSION, new FieldMetaData("client_version", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CHECKSUM, new FieldMetaData("checksum", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ClientPasswordLoginReq.class, metaDataMap);
  }

  public ClientPasswordLoginReq() {
  }

  public ClientPasswordLoginReq(
    short logname_type,
    String logname,
    long client_random,
    String client_mac,
    String client_version,
    String checksum)
  {
    this();
    this.logname_type = logname_type;
    setLogname_typeIsSet(true);
    this.logname = logname;
    this.client_random = client_random;
    setClient_randomIsSet(true);
    this.client_mac = client_mac;
    this.client_version = client_version;
    this.checksum = checksum;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientPasswordLoginReq(ClientPasswordLoginReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.logname_type = other.logname_type;
    if (other.isSetLogname()) {
      this.logname = other.logname;
    }
    this.client_random = other.client_random;
    if (other.isSetClient_mac()) {
      this.client_mac = other.client_mac;
    }
    if (other.isSetClient_version()) {
      this.client_version = other.client_version;
    }
    if (other.isSetChecksum()) {
      this.checksum = other.checksum;
    }
  }

  public ClientPasswordLoginReq deepCopy() {
    return new ClientPasswordLoginReq(this);
  }

  @Override
  public void clear() {
    setLogname_typeIsSet(false);
    this.logname_type = 0;
    this.logname = null;
    setClient_randomIsSet(false);
    this.client_random = 0;
    this.client_mac = null;
    this.client_version = null;
    this.checksum = null;
  }

  public short getLogname_type() {
    return this.logname_type;
  }

  public ClientPasswordLoginReq setLogname_type(short logname_type) {
    this.logname_type = logname_type;
    setLogname_typeIsSet(true);
    return this;
  }

  public void unsetLogname_type() {
    __isset_bit_vector.clear(__LOGNAME_TYPE_ISSET_ID);
  }

  /** Returns true if field logname_type is set (has been asigned a value) and false otherwise */
  public boolean isSetLogname_type() {
    return __isset_bit_vector.get(__LOGNAME_TYPE_ISSET_ID);
  }

  public void setLogname_typeIsSet(boolean value) {
    __isset_bit_vector.set(__LOGNAME_TYPE_ISSET_ID, value);
  }

  public String getLogname() {
    return this.logname;
  }

  public ClientPasswordLoginReq setLogname(String logname) {
    this.logname = logname;
    return this;
  }

  public void unsetLogname() {
    this.logname = null;
  }

  /** Returns true if field logname is set (has been asigned a value) and false otherwise */
  public boolean isSetLogname() {
    return this.logname != null;
  }

  public void setLognameIsSet(boolean value) {
    if (!value) {
      this.logname = null;
    }
  }

  public long getClient_random() {
    return this.client_random;
  }

  public ClientPasswordLoginReq setClient_random(long client_random) {
    this.client_random = client_random;
    setClient_randomIsSet(true);
    return this;
  }

  public void unsetClient_random() {
    __isset_bit_vector.clear(__CLIENT_RANDOM_ISSET_ID);
  }

  /** Returns true if field client_random is set (has been asigned a value) and false otherwise */
  public boolean isSetClient_random() {
    return __isset_bit_vector.get(__CLIENT_RANDOM_ISSET_ID);
  }

  public void setClient_randomIsSet(boolean value) {
    __isset_bit_vector.set(__CLIENT_RANDOM_ISSET_ID, value);
  }

  public String getClient_mac() {
    return this.client_mac;
  }

  public ClientPasswordLoginReq setClient_mac(String client_mac) {
    this.client_mac = client_mac;
    return this;
  }

  public void unsetClient_mac() {
    this.client_mac = null;
  }

  /** Returns true if field client_mac is set (has been asigned a value) and false otherwise */
  public boolean isSetClient_mac() {
    return this.client_mac != null;
  }

  public void setClient_macIsSet(boolean value) {
    if (!value) {
      this.client_mac = null;
    }
  }

  public String getClient_version() {
    return this.client_version;
  }

  public ClientPasswordLoginReq setClient_version(String client_version) {
    this.client_version = client_version;
    return this;
  }

  public void unsetClient_version() {
    this.client_version = null;
  }

  /** Returns true if field client_version is set (has been asigned a value) and false otherwise */
  public boolean isSetClient_version() {
    return this.client_version != null;
  }

  public void setClient_versionIsSet(boolean value) {
    if (!value) {
      this.client_version = null;
    }
  }

  public String getChecksum() {
    return this.checksum;
  }

  public ClientPasswordLoginReq setChecksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  public void unsetChecksum() {
    this.checksum = null;
  }

  /** Returns true if field checksum is set (has been asigned a value) and false otherwise */
  public boolean isSetChecksum() {
    return this.checksum != null;
  }

  public void setChecksumIsSet(boolean value) {
    if (!value) {
      this.checksum = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOGNAME_TYPE:
      if (value == null) {
        unsetLogname_type();
      } else {
        setLogname_type((Short)value);
      }
      break;

    case LOGNAME:
      if (value == null) {
        unsetLogname();
      } else {
        setLogname((String)value);
      }
      break;

    case CLIENT_RANDOM:
      if (value == null) {
        unsetClient_random();
      } else {
        setClient_random((Long)value);
      }
      break;

    case CLIENT_MAC:
      if (value == null) {
        unsetClient_mac();
      } else {
        setClient_mac((String)value);
      }
      break;

    case CLIENT_VERSION:
      if (value == null) {
        unsetClient_version();
      } else {
        setClient_version((String)value);
      }
      break;

    case CHECKSUM:
      if (value == null) {
        unsetChecksum();
      } else {
        setChecksum((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOGNAME_TYPE:
      return new Short(getLogname_type());

    case LOGNAME:
      return getLogname();

    case CLIENT_RANDOM:
      return new Long(getClient_random());

    case CLIENT_MAC:
      return getClient_mac();

    case CLIENT_VERSION:
      return getClient_version();

    case CHECKSUM:
      return getChecksum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOGNAME_TYPE:
      return isSetLogname_type();
    case LOGNAME:
      return isSetLogname();
    case CLIENT_RANDOM:
      return isSetClient_random();
    case CLIENT_MAC:
      return isSetClient_mac();
    case CLIENT_VERSION:
      return isSetClient_version();
    case CHECKSUM:
      return isSetChecksum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientPasswordLoginReq)
      return this.equals((ClientPasswordLoginReq)that);
    return false;
  }

  public boolean equals(ClientPasswordLoginReq that) {
    if (that == null)
      return false;

    boolean this_present_logname_type = true;
    boolean that_present_logname_type = true;
    if (this_present_logname_type || that_present_logname_type) {
      if (!(this_present_logname_type && that_present_logname_type))
        return false;
      if (this.logname_type != that.logname_type)
        return false;
    }

    boolean this_present_logname = true && this.isSetLogname();
    boolean that_present_logname = true && that.isSetLogname();
    if (this_present_logname || that_present_logname) {
      if (!(this_present_logname && that_present_logname))
        return false;
      if (!this.logname.equals(that.logname))
        return false;
    }

    boolean this_present_client_random = true;
    boolean that_present_client_random = true;
    if (this_present_client_random || that_present_client_random) {
      if (!(this_present_client_random && that_present_client_random))
        return false;
      if (this.client_random != that.client_random)
        return false;
    }

    boolean this_present_client_mac = true && this.isSetClient_mac();
    boolean that_present_client_mac = true && that.isSetClient_mac();
    if (this_present_client_mac || that_present_client_mac) {
      if (!(this_present_client_mac && that_present_client_mac))
        return false;
      if (!this.client_mac.equals(that.client_mac))
        return false;
    }

    boolean this_present_client_version = true && this.isSetClient_version();
    boolean that_present_client_version = true && that.isSetClient_version();
    if (this_present_client_version || that_present_client_version) {
      if (!(this_present_client_version && that_present_client_version))
        return false;
      if (!this.client_version.equals(that.client_version))
        return false;
    }

    boolean this_present_checksum = true && this.isSetChecksum();
    boolean that_present_checksum = true && that.isSetChecksum();
    if (this_present_checksum || that_present_checksum) {
      if (!(this_present_checksum && that_present_checksum))
        return false;
      if (!this.checksum.equals(that.checksum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ClientPasswordLoginReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClientPasswordLoginReq typedOther = (ClientPasswordLoginReq)other;

    lastComparison = Boolean.valueOf(isSetLogname_type()).compareTo(typedOther.isSetLogname_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogname_type()) {
      lastComparison = TBaseHelper.compareTo(this.logname_type, typedOther.logname_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLogname()).compareTo(typedOther.isSetLogname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogname()) {
      lastComparison = TBaseHelper.compareTo(this.logname, typedOther.logname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_random()).compareTo(typedOther.isSetClient_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_random()) {
      lastComparison = TBaseHelper.compareTo(this.client_random, typedOther.client_random);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_mac()).compareTo(typedOther.isSetClient_mac());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_mac()) {
      lastComparison = TBaseHelper.compareTo(this.client_mac, typedOther.client_mac);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_version()).compareTo(typedOther.isSetClient_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_version()) {
      lastComparison = TBaseHelper.compareTo(this.client_version, typedOther.client_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChecksum()).compareTo(typedOther.isSetChecksum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChecksum()) {
      lastComparison = TBaseHelper.compareTo(this.checksum, typedOther.checksum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // LOGNAME_TYPE
          if (field.type == TType.I16) {
            this.logname_type = iprot.readI16();
            setLogname_typeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LOGNAME
          if (field.type == TType.STRING) {
            this.logname = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CLIENT_RANDOM
          if (field.type == TType.I64) {
            this.client_random = iprot.readI64();
            setClient_randomIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // CLIENT_MAC
          if (field.type == TType.STRING) {
            this.client_mac = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // CLIENT_VERSION
          if (field.type == TType.STRING) {
            this.client_version = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // CHECKSUM
          if (field.type == TType.STRING) {
            this.checksum = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(LOGNAME_TYPE_FIELD_DESC);
    oprot.writeI16(this.logname_type);
    oprot.writeFieldEnd();
    if (this.logname != null) {
      oprot.writeFieldBegin(LOGNAME_FIELD_DESC);
      oprot.writeString(this.logname);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CLIENT_RANDOM_FIELD_DESC);
    oprot.writeI64(this.client_random);
    oprot.writeFieldEnd();
    if (this.client_mac != null) {
      oprot.writeFieldBegin(CLIENT_MAC_FIELD_DESC);
      oprot.writeString(this.client_mac);
      oprot.writeFieldEnd();
    }
    if (this.client_version != null) {
      oprot.writeFieldBegin(CLIENT_VERSION_FIELD_DESC);
      oprot.writeString(this.client_version);
      oprot.writeFieldEnd();
    }
    if (this.checksum != null) {
      oprot.writeFieldBegin(CHECKSUM_FIELD_DESC);
      oprot.writeString(this.checksum);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClientPasswordLoginReq(");
    boolean first = true;

    sb.append("logname_type:");
    sb.append(this.logname_type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("logname:");
    if (this.logname == null) {
      sb.append("null");
    } else {
      sb.append(this.logname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_random:");
    sb.append(this.client_random);
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_mac:");
    if (this.client_mac == null) {
      sb.append("null");
    } else {
      sb.append(this.client_mac);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_version:");
    if (this.client_version == null) {
      sb.append("null");
    } else {
      sb.append(this.client_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("checksum:");
    if (this.checksum == null) {
      sb.append("null");
    } else {
      sb.append(this.checksum);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

