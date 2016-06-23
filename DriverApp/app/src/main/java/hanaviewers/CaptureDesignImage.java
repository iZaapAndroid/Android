package hanaviewers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.baskar.driverapp.R;
import com.navdrawer.SimpleSideDrawer;

public class CaptureDesignImage extends Activity {

    ImageView florist_menu;
    SimpleSideDrawer slide_me;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.capture_design_image);

        slide_me = new SimpleSideDrawer(this);

        slide_me.setRightBehindContentView(R.layout.florist_menu);

        florist_menu = (ImageView) findViewById(R.id.florist_menu);

        florist_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slide_me.toggleRightDrawer();

            }
        });
    }
}
