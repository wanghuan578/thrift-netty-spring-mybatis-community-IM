
/************************************************************

Description: CBM_KeepALiveTimerTask.

Author: wanghuan. 2013-01-20.

Boxin Technology Corporated Corporation. All Rights Reserved.

*************************************************************/

package com.spirit.thrift.socketserver.rpc.minicore;

import java.util.TimerTask;



public class SL_RPC_KeepALiveTask extends TimerTask {
	
	private long m_Index = 0;
	
	public SL_RPC_KeepALiveTask(){
		
	}
	
	@Override
	public void run() {
		
		System.out.println("SL_RPC_KeepALiveTask - SRM_KeepLiveRequest: " + m_Index++);
		
		//new SRM_KeepLiveRequest();
	}

}
