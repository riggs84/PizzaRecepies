package com.example.pizzarecepies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaRecipeDetails extends AppCompatActivity {

    private PizzaRecipeModel recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_recipe_details);
        recipe = getIntent().getParcelableExtra("data");

        ImageView pizzaImg = findViewById(R.id.rd_pizzaImg);
        pizzaImg.setImageResource(recipe.getImage());
        TextView pizzaTitle = findViewById(R.id.rd_pizzaTitle);
        pizzaTitle.setText(recipe.getTitle());
        TextView pizzaRecipe = findViewById(R.id.rd_pizzaRecipe);
        pizzaRecipe.setText(recipe.getRecipe());
    }
}