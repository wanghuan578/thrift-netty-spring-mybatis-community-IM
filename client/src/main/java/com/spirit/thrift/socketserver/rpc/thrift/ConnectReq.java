package com.spirit.thrift.socketserver.rpc.thrift;
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

public class ConnectReq implements TBase<ConnectReq, ConnectReq._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ConnectReq");

  private static final TField SESSOIN_TICKET_FIELD_DESC = new TField("sessoin_ticket", TType.STRING, (short)1);
  private static final TField CLIENT_RANDOM_FIELD_DESC = new TField("client_random", TType.I64, (short)2);
  private static final TField SERVER_RANDOM_FIELD_DESC = new TField("server_random", TType.I64, (short)3);
  private static final TField CHECKSUM_FIELD_DESC = new TField("checksum", TType.STRING, (short)4);

  public String sessoin_ticket;
  public long client_random;
  public long server_random;
  public String checksum;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SESSOIN_TICKET((short)1, "sessoin_ticket"),
    CLIENT_RANDOM((short)2, "client_random"),
    SERVER_RANDOM((short)3, "server_random"),
    CHECKSUM((short)4, "checksum");

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
        case 1: // SESSOIN_TICKET
          return SESSOIN_TICKET;
        case 2: // CLIENT_RANDOM
          return CLIENT_RANDOM;
        case 3: // SERVER_RANDOM
          return SERVER_RANDOM;
        case 4: // CHECKSUM
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
  private static final int __CLIENT_RANDOM_ISSET_ID = 0;
  private static final int __SERVER_RANDOM_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSOIN_TICKET, new FieldMetaData("sessoin_ticket", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CLIENT_RANDOM, new FieldMetaData("client_random", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.SERVER_RANDOM, new FieldMetaData("server_random", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.CHECKSUM, new FieldMetaData("checksum", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ConnectReq.class, metaDataMap);
  }

  public ConnectReq() {
  }

  public ConnectReq(
    String sessoin_ticket,
    long client_random,
    long server_random,
    String checksum)
  {
    this();
    this.sessoin_ticket = sessoin_ticket;
    this.client_random = client_random;
    setClient_randomIsSet(true);
    this.server_random = server_random;
    setServer_randomIsSet(true);
    this.checksum = checksum;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConnectReq(ConnectReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetSessoin_ticket()) {
      this.sessoin_ticket = other.sessoin_ticket;
    }
    this.client_random = other.client_random;
    this.server_random = other.server_random;
    if (other.isSetChecksum()) {
      this.checksum = other.checksum;
    }
  }

  public ConnectReq deepCopy() {
    return new ConnectReq(this);
  }

  public void clear() {
    this.sessoin_ticket = null;
    setClient_randomIsSet(false);
    this.client_random = 0;
    setServer_randomIsSet(false);
    this.server_random = 0;
    this.checksum = null;
  }

  public String getSessoin_ticket() {
    return this.sessoin_ticket;
  }

  public ConnectReq setSessoin_ticket(String sessoin_ticket) {
    this.sessoin_ticket = sessoin_ticket;
    return this;
  }

  public void unsetSessoin_ticket() {
    this.sessoin_ticket = null;
  }

  /** Returns true if field sessoin_ticket is set (has been asigned a value) and false otherwise */
  public boolean isSetSessoin_ticket() {
    return this.sessoin_ticket != null;
  }

  public void setSessoin_ticketIsSet(boolean value) {
    if (!value) {
      this.sessoin_ticket = null;
    }
  }

  public long getClient_random() {
    return this.client_random;
  }

  public ConnectReq setClient_random(long client_random) {
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

  public long getServer_random() {
    return this.server_random;
  }

  public ConnectReq setServer_random(long server_random) {
    this.server_random = server_random;
    setServer_randomIsSet(true);
    return this;
  }

  public void unsetServer_random() {
    __isset_bit_vector.clear(__SERVER_RANDOM_ISSET_ID);
  }

  /** Returns true if field server_random is set (has been asigned a value) and false otherwise */
  public boolean isSetServer_random() {
    return __isset_bit_vector.get(__SERVER_RANDOM_ISSET_ID);
  }

  public void setServer_randomIsSet(boolean value) {
    __isset_bit_vector.set(__SERVER_RANDOM_ISSET_ID, value);
  }

  public String getChecksum() {
    return this.checksum;
  }

  public ConnectReq setChecksum(String checksum) {
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
    case SESSOIN_TICKET:
      if (value == null) {
        unsetSessoin_ticket();
      } else {
        setSessoin_ticket((String)value);
      }
      break;

    case CLIENT_RANDOM:
      if (value == null) {
        unsetClient_random();
      } else {
        setClient_random((Long)value);
      }
      break;

    case SERVER_RANDOM:
      if (value == null) {
        unsetServer_random();
      } else {
        setServer_random((Long)value);
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
    case SESSOIN_TICKET:
      return getSessoin_ticket();

    case CLIENT_RANDOM:
      return new Long(getClient_random());

    case SERVER_RANDOM:
      return new Long(getServer_random());

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
    case SESSOIN_TICKET:
      return isSetSessoin_ticket();
    case CLIENT_RANDOM:
      return isSetClient_random();
    case SERVER_RANDOM:
      return isSetServer_random();
    case CHECKSUM:
      return isSetChecksum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConnectReq)
      return this.equals((ConnectReq)that);
    return false;
  }

  public boolean equals(ConnectReq that) {
    if (that == null)
      return false;

    boolean this_present_sessoin_ticket = true && this.isSetSessoin_ticket();
    boolean that_present_sessoin_ticket = true && that.isSetSessoin_ticket();
    if (this_present_sessoin_ticket || that_present_sessoin_ticket) {
      if (!(this_present_sessoin_ticket && that_present_sessoin_ticket))
        return false;
      if (!this.sessoin_ticket.equals(that.sessoin_ticket))
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

    boolean this_present_server_random = true;
    boolean that_present_server_random = true;
    if (this_present_server_random || that_present_server_random) {
      if (!(this_present_server_random && that_present_server_random))
        return false;
      if (this.server_random != that.server_random)
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

  public int compareTo(ConnectReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ConnectReq typedOther = (ConnectReq)other;

    lastComparison = Boolean.valueOf(isSetSessoin_ticket()).compareTo(typedOther.isSetSessoin_ticket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessoin_ticket()) {
      lastComparison = TBaseHelper.compareTo(this.sessoin_ticket, typedOther.sessoin_ticket);
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
    lastComparison = Boolean.valueOf(isSetServer_random()).compareTo(typedOther.isSetServer_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer_random()) {
      lastComparison = TBaseHelper.compareTo(this.server_random, typedOther.server_random);
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
        case 1: // SESSOIN_TICKET
          if (field.type == TType.STRING) {
            this.sessoin_ticket = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CLIENT_RANDOM
          if (field.type == TType.I64) {
            this.client_random = iprot.readI64();
            setClient_randomIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SERVER_RANDOM
          if (field.type == TType.I64) {
            this.server_random = iprot.readI64();
            setServer_randomIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // CHECKSUM
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
    if (this.sessoin_ticket != null) {
      oprot.writeFieldBegin(SESSOIN_TICKET_FIELD_DESC);
      oprot.writeString(this.sessoin_ticket);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CLIENT_RANDOM_FIELD_DESC);
    oprot.writeI64(this.client_random);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SERVER_RANDOM_FIELD_DESC);
    oprot.writeI64(this.server_random);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("ConnectReq(");
    boolean first = true;

    sb.append("sessoin_ticket:");
    if (this.sessoin_ticket == null) {
      sb.append("null");
    } else {
      sb.append(this.sessoin_ticket);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_random:");
    sb.append(this.client_random);
    first = false;
    if (!first) sb.append(", ");
    sb.append("server_random:");
    sb.append(this.server_random);
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

