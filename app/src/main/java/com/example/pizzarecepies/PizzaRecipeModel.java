package com.example.pizzarecepies;

public class PizzaRecipeModel {

    private String title;
    private String description;
    private String recipe;
    private int image;

    public PizzaRecipeModel(String title, String description, String recipe, int image) {
        this.title = title;
        this.description = description;
        this.recipe = recipe;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getImage() {
        return image;
    }
}
