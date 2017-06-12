package com.example.yh.gotgam;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

/**
 * Created by yh on 2017. 6. 9..
 */

public class NextActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public Context mContext;
    public void sendMessageTo(String phoneNum, String message) {

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNum, null, message, null, null);

        Toast.makeText(mContext, "Message transmission is completed.",
                Toast.LENGTH_SHORT).show();
    }public void onClick02(View v) {
        sendMessageTo("01012345678", "This is a test message.");
    }

}