package com.ulil0031.example.belajarandroidbyulil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void intent (View view) {
        Intent intent =new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);

    }
    public void fragment (View view) {
        Intent intent =new Intent(MainActivity.this,FragmentWithActivity.class);
        startActivity(intent);

    }

}
