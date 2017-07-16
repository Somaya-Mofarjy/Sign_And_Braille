package com.example.bottombar.sample;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {
// ImageView m= (ImageView) findViewById(R.id.nouf);

    BottomBar bottomBar ;
    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setDefaultTab(R.id.tab_home);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_info) {
                    TextView t = (TextView)findViewById(R.id.text);
                    t.setText("دليل!!");

                    //m.setVisibility(View.VISIBLE);

                }else if(tabId == R.id.tab_home){

                    //m.setVisibility(View.INVISIBLE);
                }

            }
        });



        //findViewById(R.id.five_tabs_changing_colors).setOnClickListener(this);

    }



/*    @Override
    public void onClick(View v) {
        Class clazz = null;
        switch (v.getId()) {
            case R.id.five_tabs_changing_colors:
                clazz = FiveColorChangingTabsActivity.class;
                break;
        }
        startActivity(new Intent(this, clazz));
    }*/

}//end class
