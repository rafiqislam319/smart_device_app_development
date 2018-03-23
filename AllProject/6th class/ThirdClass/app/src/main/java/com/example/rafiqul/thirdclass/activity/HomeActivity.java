package com.example.rafiqul.thirdclass.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rafiqul.thirdclass.R;
import com.example.rafiqul.thirdclass.fragment.HomeFragment;
import com.example.rafiqul.thirdclass.services.DownloadedService;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //start fragment

        Fragment homeFragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.homeFragment,homeFragment);
        fragmentTransaction.commit();


        //start service


        startService(new Intent(this, DownloadedService.class));

    }
}
