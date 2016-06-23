package com.example.baskar.driverapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hanaviewers.DispatchLoginPage;
import hanaviewers.FloristLoginPage;

public class MainActivity extends Activity {

    Button dispatch_login,florist_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_buttons);

        dispatch_login=(Button) findViewById(R.id.dispatch_btn);
        florist_login=(Button) findViewById(R.id.florist_btn);

        dispatch_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dis = new Intent(MainActivity.this, DispatchLoginPage.class);
                startActivity(dis);
            }
        });

        florist_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flo = new Intent(MainActivity.this, FloristLoginPage.class);
                startActivity(flo);
            }
        });

    }
}
