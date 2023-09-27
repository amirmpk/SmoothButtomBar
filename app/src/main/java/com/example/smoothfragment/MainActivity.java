package com.example.smoothfragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
     SmoothBottomBar smoothBottomBar;
     Toolbar toolbar;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          smoothBottomBar = findViewById(R.id.bottombar);
          toolbar = findViewById(R.id.toolbar);
          getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new HomeFragment()).commit();
          smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
               @Override
               public boolean onItemSelect(int i) {
                    if (i == 0) {
                         getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new HomeFragment()).commit();
                         smoothBottomBar.setBarBackgroundColor(Color.parseColor("#3145B6"));
                         getWindow().setNavigationBarColor(Color.parseColor("#3145B6"));
                         getWindow().setStatusBarColor(Color.parseColor("#3145B6"));
                         toolbar.setBackgroundColor(Color.parseColor("#3145B6"));
                    }
                    if (i == 1) {
                         getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new SettingFragment()).commit();
                         smoothBottomBar.setBarBackgroundColor(Color.parseColor("#009688"));
                         getWindow().setNavigationBarColor(Color.parseColor("#009688"));
                         getWindow().setStatusBarColor(Color.parseColor("#009688"));
                         toolbar.setBackgroundColor(Color.parseColor("#009688"));
                    }
                    if (i == 2) {
                         getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new PersonFragment()).commit();
                         smoothBottomBar.setBarBackgroundColor(Color.parseColor("#ff424e4d"));
                         getWindow().setNavigationBarColor(Color.parseColor("#ff424e4d"));
                         getWindow().setStatusBarColor(Color.parseColor("#ff424e4d"));
                         toolbar.setBackgroundColor(Color.parseColor("#ff424e4d"));
                    }
                    if (i == 3) {
                         getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new MoreFragment()).commit();
                         smoothBottomBar.setBarBackgroundColor(Color.parseColor("#FF2F92E1"));
                         getWindow().setNavigationBarColor(Color.parseColor("#FF2F92E1"));
                         getWindow().setStatusBarColor(Color.parseColor("#FF2F92E1"));
                         toolbar.setBackgroundColor(Color.parseColor("#FF2F92E1"));
                    }
                    return false;
               }
          });

     }

}