package hanaviewers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baskar.driverapp.R;


public class DispatchLoginPage extends Activity{

    Button login;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispach_login);

        login = (Button) findViewById(R.id.dispatch_login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent log = new Intent(DispatchLoginPage.this,Trips.class);
                startActivity(log);
            }
        });
    }

}
