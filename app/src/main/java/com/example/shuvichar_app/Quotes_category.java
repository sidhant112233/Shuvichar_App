package com.example.shuvichar_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Quotes_category extends AppCompatActivity {

    RecyclerView rvdata;

    Integer[] image = {R.drawable.happy,R.drawable.sad,R.drawable.love,R.drawable.morning,R.drawable.god,R.drawable.alone,
    R.drawable.attitude};
    String[] name = {"HAPPY","SAD","LOVE","MORNING","ALONE","GOD","attitude"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_category);
        rvdata = findViewById(R.id.rvdata);

        QuotesAdapter adapter = new QuotesAdapter(this,image,name);
        RecyclerView.LayoutManager lm;
        lm =new GridLayoutManager(this,2);
        rvdata.setAdapter(adapter);
        rvdata.setLayoutManager(lm);


    }
}