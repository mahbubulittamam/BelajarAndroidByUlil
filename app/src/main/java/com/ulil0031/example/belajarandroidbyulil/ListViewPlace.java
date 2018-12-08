package com.ulil0031.example.belajarandroidbyulil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewPlace extends AppCompatActivity {
    String[] listArray={"1","2",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_places);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_list_view,listArray);
        ListView listview =(ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);
    }
}
