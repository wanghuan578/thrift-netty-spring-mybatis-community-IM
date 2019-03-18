/************************************************************

Description: SL_RPC_ProtocolFactory <TMessageBody>.

Author: wanghuan. 2013-01-20.

Boxin Technology Corporated Corporation. All Rights Reserved.

*************************************************************/

package com.gyc.thrift.socketserver.rpc.minicore;

import org.apache.thrift.protocol.TProtocol;

public class SL_RPC_ProtocolFactory <TMessageBody> {

	private SL_RPC_MessageParser m_cmdParser = null;
	
	private SL_RPC_MessageBuilder<TMessageBody> m_CmdBuilder = null;
	
//	private TMessageBody body_;
	
	public SL_RPC_ProtocolFactory (TMessageBody body, int buff_size, int offset) {

		m_CmdBuilder = new SL_RPC_MessageBuilder<TMessageBody>(body, buff_size, offset);
	}
	
	public SL_RPC_ProtocolFactory(SL_RPC_ByteBuffer buff){
		
		m_cmdParser = new SL_RPC_MessageParser(buff.GetBytes(), buff.Length());
	}
	
	public TMessageBody GetBody() {
	    return m_CmdBuilder.GetBody();
	}
	public TProtocol GetProtocol() {
        return m_CmdBuilder.GetTProtocol();
    }
	
	public SL_RPC_MessageBuilder<TMessageBody> GetHead() {

	    return m_CmdBuilder;
	}
	
	public SL_RPC_MessageParser GetParser(){
		
		if(null != m_cmdParser)
		{
			return m_cmdParser;
		}
		else
		{
			return null;
		}
	}
	
	public SL_RPC_MessageBuilder<TMessageBody> GetBuilder(){
		
		if(null != m_CmdBuilder)
		{
			return m_CmdBuilder;
		}
		else
		{
			return null;
		}
	}
}
