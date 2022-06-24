package com.example.pizzarecepies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PizzaRecipeRecyclerViewAdapter extends RecyclerView.Adapter<PizzaRecipeRecyclerViewAdapter.MyViewHolder> {

    private final List<PizzaRecipeModel> data;
    private final Context context;

    public PizzaRecipeRecyclerViewAdapter(Context context, List<PizzaRecipeModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate layout for row
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.pizza_recepie, parent, false);
        return new PizzaRecipeRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // set data for row
        PizzaRecipeModel recipe = data.get(position);
        holder.imageView.setImageResource(recipe.getImage());
        holder.textView.setText(recipe.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
