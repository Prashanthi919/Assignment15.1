package com.example.prashu.assignment151;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> myArrayList;
MyAdapter myAdapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.versionNames);


        myAndroidVersionData();

        myAdapter = new MyAdapter(this, myArrayList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }
    private void myAndroidVersionData() {

        // creating the object of the array list.
        myArrayList = new ArrayList<>();
     // adding the versions of android names to arraylist

        myArrayList.add("Alpha");
        myArrayList.add("Beta");
        myArrayList.add("Cupcake");
        myArrayList.add("Donut");
        myArrayList.add("Eclairs");
        myArrayList.add("Froyo");
        myArrayList.add("Gingerbread");
        myArrayList.add("Honeycomb");
        myArrayList.add("Icecream Sandwich");
        myArrayList.add("Jellybean");
        myArrayList.add("Kitkat");
        myArrayList.add("Lollipop");
        myArrayList.add("Marshmallow");
        myArrayList.add("Nougat");
        myArrayList.add("Oreo");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return true;
    }

}
