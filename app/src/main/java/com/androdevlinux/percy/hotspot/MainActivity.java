package com.androdevlinux.percy.hotspot;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hot.isApOn(MainActivity.this);
        Hot.configApState(MainActivity.this);
    }

//    public MainActivity() {
//        Hot.isApOn(MainActivity.this);
//        Hot.configApState(MainActivity.this);
//    }

    public class BootReciever extends BroadcastReceiver {



        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "My Service Started", Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(context, MainActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(myIntent);
        }

    }
}
