package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SetsModel>list;
    SetsAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.my_recycler_view);
        list = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        list.add(new SetsModel("Cour - 1"));
        list.add(new SetsModel("Cour - 2"));
        list.add(new SetsModel("Cour - 3"));
        list.add(new SetsModel("Cour - 4"));
        list.add(new SetsModel("Cour - 5"));
        list.add(new SetsModel("Cour - 6"));
        list.add(new SetsModel("Cour - 7"));
        list.add(new SetsModel("Cour - 8"));
        list.add(new SetsModel("Cour - 9"));

        adapter = new SetsAdapter(list, this);
        recyclerView.setAdapter(adapter);


    }
}