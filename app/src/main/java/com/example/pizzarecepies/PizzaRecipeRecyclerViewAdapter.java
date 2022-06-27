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
    private final PizzaRecipeOnClick onClickHandler;

    public PizzaRecipeRecyclerViewAdapter(Context context, List<PizzaRecipeModel> data, PizzaRecipeOnClick onClickHandler) {
        this.context = context;
        this.data = data;
        this.onClickHandler = onClickHandler;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate layout for row
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.pizza_recepie, parent, false);
        return new PizzaRecipeRecyclerViewAdapter.MyViewHolder(view, onClickHandler);
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

        public MyViewHolder(@NonNull View itemView, PizzaRecipeOnClick onClickHandler) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(view -> {
                if (onClickHandler != null) {
                    int index = getAdapterPosition();

                    if (index != RecyclerView.NO_POSITION) {
                        onClickHandler.onItemClick(index);
                    }
                }
            });
        }
    }
}
