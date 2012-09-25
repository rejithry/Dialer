package com.ime.messagedialer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootMonitor extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent serviceIntent = new Intent(context, DialerService.class);
		context.startService(serviceIntent);

	}

}
