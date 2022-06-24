package utils;

import com.example.pizzarecepies.PizzaRecipeModel;
import com.example.pizzarecepies.R;

import java.util.ArrayList;
import java.util.List;

public class GenerateData {

    public static List<PizzaRecipeModel> generatePizzaRecipiesList() {
        List<PizzaRecipeModel> data = new ArrayList<>();
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img1));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img2));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img3));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img4));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img5));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img6));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img7));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img8));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img9));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img10));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img11));
        data.add(new PizzaRecipeModel("Pizza", "", "", R.drawable.img12));

        return data;
    }
}
