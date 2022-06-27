package com.example.pizzarecepies;

import android.os.Parcel;
import android.os.Parcelable;

public class PizzaRecipeModel implements Parcelable {

    private String title;
    private String doughRecipe;
    private String recipe;
    private int image;

    public PizzaRecipeModel(String title, String description, String recipe, int image) {
        this.title = title;
        this.doughRecipe = description;
        this.recipe = recipe;
        this.image = image;
    }

    protected PizzaRecipeModel(Parcel in) {
        title = in.readString();
        doughRecipe = in.readString();
        recipe = in.readString();
        image = in.readInt();
    }

    public static final Creator<PizzaRecipeModel> CREATOR = new Creator<PizzaRecipeModel>() {
        @Override
        public PizzaRecipeModel createFromParcel(Parcel in) {
            return new PizzaRecipeModel(in);
        }

        @Override
        public PizzaRecipeModel[] newArray(int size) {
            return new PizzaRecipeModel[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getDoughRecipe() {
        return doughRecipe;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(doughRecipe);
        dest.writeString(recipe);
        dest.writeInt(image);
    }
}
