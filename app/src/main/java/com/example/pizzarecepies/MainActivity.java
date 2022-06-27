package com.example.pizzarecepies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import utils.GenerateData;

public class MainActivity extends AppCompatActivity implements PizzaRecipeOnClick {

    private List<PizzaRecipeModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = GenerateData.generatePizzaRecipeList();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new PizzaRecipeRecyclerViewAdapter(this, data, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onItemClick(int index) {
        Intent intent = new Intent(MainActivity.this, PizzaRecipeDetails.class);
        intent.putExtra("data", data.get(index));

        startActivity(intent);
    }
}