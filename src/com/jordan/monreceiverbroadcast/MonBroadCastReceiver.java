package com.jordan.monreceiverbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MonBroadCastReceiver extends BroadcastReceiver {
	
	public MonBroadCastReceiver(){}

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		String message =" monBroadCastReceiver : Intent détecté";
		Toast.makeText(arg0, message, Toast.LENGTH_SHORT).show();

	}

}
