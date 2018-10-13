package com.ulil0031.example.belajarandroidbyulil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentWithActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Fragment");
        setContentView(R.layout.activity_fragment_with);
        FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        FirstFragment FirstFragment = new FirstFragment();

        transaction.add(R.id.frame_content, FirstFragment);


        transaction.commit();



    }



}