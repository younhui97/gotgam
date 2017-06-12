package com.example.yh.gotgam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by yh on 2017. 6. 9..
 */

public class NextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void onClick02(View v)
    {
        Intent intent = new Intent( Intent.ACTION_VIEW,Uri.parse( "sms:01087319379" ));
        startActivity(intent);

    }


}