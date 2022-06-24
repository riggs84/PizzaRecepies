package com.example.pizzarecepies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import utils.GenerateData;

public class MainActivity extends AppCompatActivity {

    private List<PizzaRecipeModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = GenerateData.generatePizzaRecipiesList();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new PizzaRecipeRecyclerViewAdapter(this, data));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}