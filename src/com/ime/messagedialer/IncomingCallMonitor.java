package com.ime.messagedialer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class IncomingCallMonitor extends BroadcastReceiver {


	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle bundle = intent.getExtras();

		if (null == bundle)
			return;

		String state = bundle.getString(TelephonyManager.EXTRA_STATE);

		if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_RINGING)) {
			String phonenumber = bundle
					.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
			String info = "Incoming number : "
					+ phonenumber;
			Toast.makeText(context, info, Toast.LENGTH_LONG).show();
		}
	}

}
