package com.example.ashish.applcation_rmansir;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    ViewPager viewPager;
    MenuItem prevMenuItem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Intent intent = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                 //   mTextMessage.setText(R.string.title_home);
                    pushFragment(new Bid_frag());
                    return true;
                case R.id.navigation_dashboard:
                //    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
               //     mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.navigation_profile:
                //    mTextMessage.setText(R.string.profile_notifications);
                    //fragment=new Profile_Frag();
                    pushFragment(new Profile_Frag());


                    return true;
            }

            return true;
        }
    };

    private void pushFragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentContainer,fragment);
        ft.commit();

    }


}
