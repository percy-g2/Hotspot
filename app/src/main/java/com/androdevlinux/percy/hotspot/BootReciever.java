package com.androdevlinux.percy.hotspot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by percy on 18/12/14.
 */
public class BootReciever extends BroadcastReceiver {



    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "My Service Started", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(context, MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(myIntent);
    }

}
