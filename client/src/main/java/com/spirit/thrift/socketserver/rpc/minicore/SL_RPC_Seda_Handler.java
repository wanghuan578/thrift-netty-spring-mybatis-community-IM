/************************************************************

Description: SL_RPC_Seda_Handler.

Author: wanghuan. 2013-01-20.

Boxin Technology Corporated Corporation. All Rights Reserved.

*************************************************************/

package com.spirit.thrift.socketserver.rpc.minicore;

import com.spirit.netty.RpcEventType;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;



public class SL_RPC_Seda_Handler {

	private SL_RPC_ByteBuffer m_Event = null;

	private SL_RPC_CommHead m_EventHead = null;

	private Object m_Reserve = null;

	public SL_RPC_Seda_Handler(SL_RPC_Seda_Event event) {

		m_Event = event.GetEventBody();

		m_EventHead = event.GetEventHead();

		m_Reserve = event.GetObject();
	}

	private SL_RPC_ByteBuffer GetEvent() {

		return m_Event;
	}

	private SL_RPC_CommHead GetEventHead() {

		return m_EventHead;
	}

	private Object GetReserve() {

		return m_Reserve;
	}

	public int handle_message() {
		return 0;
	}
}

