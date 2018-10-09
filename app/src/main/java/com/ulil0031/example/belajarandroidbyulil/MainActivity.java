package com.ulil0031.example.belajarandroidbyulil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.HashMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ulil0031.example.belajarandroidbyulil.util.PreferencesHelper;


public class MainActivity extends AppCompatActivity {


    PreferencesHelper session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        session = new PreferencesHelper(getApplicationContext());

        TextView lblName = (TextView) findViewById(R.id.lblName);





        if(session.checkLogin())
            finish();


        HashMap<String, String> user = session.getUserDetails();


        String name = user.get(PreferencesHelper.KEY_NAME);




        lblName.setText(Html.fromHtml("Welocome : <b>" + name + "</b>"));


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