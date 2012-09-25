package com.ime.messagedialer;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

public class DialerService extends Service {


	@Override
	public void onCreate() {
        IncomingCallMonitor inReceiver = new IncomingCallMonitor();
        IntentFilter filterInReceiver = new IntentFilter();
        filterInReceiver.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(inReceiver, filterInReceiver);
        
        OutgoingCallMonitor outReceiver = new OutgoingCallMonitor();
        IntentFilter filterOutReceiver = new IntentFilter();
        filterOutReceiver.addAction("android.intent.action.NEW_OUTGOING_CALL");
        registerReceiver(outReceiver, filterOutReceiver);

	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
