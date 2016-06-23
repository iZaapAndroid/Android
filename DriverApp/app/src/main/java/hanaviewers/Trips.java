package hanaviewers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.baskar.driverapp.R;
import com.navdrawer.SimpleSideDrawer;


public class Trips extends Activity{

    ImageView menu;
    SimpleSideDrawer slide_me;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.trips);
        slide_me = new SimpleSideDrawer(this);

        slide_me.setRightBehindContentView(R.layout.dispatch_menu);

        menu = (ImageView) findViewById(R.id.trips_menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slide_me.toggleRightDrawer();

            }
        });

    }

}

