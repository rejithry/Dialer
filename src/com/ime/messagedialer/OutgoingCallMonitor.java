package com.ime.messagedialer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class OutgoingCallMonitor extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle bundle = intent.getExtras();

		if (null == bundle)
			return;

		String phonenumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
		String info = "Outgoing number: " + phonenumber;
		Toast.makeText(context, info, Toast.LENGTH_LONG).show();
	}

}
