package hanaviewers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baskar.driverapp.R;


public class FloristLoginPage extends Activity{

    Button florist_login;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.florist_login);

        florist_login = (Button) findViewById(R.id.florist_login_btn);

        florist_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent flo = new Intent(FloristLoginPage.this,CaptureDesignImage.class);
                startActivity(flo);
            }
        });
    }

}

