package com.example.shuvichar_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Happy_Activity extends AppCompatActivity {

    RecyclerView rvhappy;
    Integer[] image = {R.drawable.hbagound,R.drawable.happy2,R.drawable.happy3};
    String[] name = {"Think of the oll beauty still left around you and be HAPPY ","The best feeling of happiness is when you are happy","The bedst feelings comes when you realize the you are perfectly HAPPY without the people you thought you needed most"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
        rvhappy = findViewById(R.id.rvhappy);

        HappyAdapter adapter = new HappyAdapter(this,image,name);
        RecyclerView.LayoutManager lm;
        lm = new LinearLayoutManager(this);
        rvhappy.setAdapter(adapter);
        rvhappy.setLayoutManager(lm);

    }
}