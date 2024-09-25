package com.example.profile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profile.model.TopAnimalsData;
import com.example.profile.R;
import com.example.profile.model.TopAnimalsData;

import java.util.List;

public class TopAnimalsAdapter extends RecyclerView.Adapter<TopAnimalsAdapter.TopPlacesViewHolder> {

    Context context;
    List<TopAnimalsData> TopAnimalsDataList;

    public TopAnimalsAdapter(Context context, List<TopAnimalsData> TopAnimalsDataList) {
        this.context = context;
        this.TopAnimalsDataList = TopAnimalsDataList;
    }

    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.top_animals_row_item, parent, false);

        // here we create a recyclerview row item layout file
        return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {

        holder.countryAnimal.setText(TopAnimalsDataList.get(position).getCountryAnimal());
        holder.animalName.setText(TopAnimalsDataList.get(position).getAnimalName());
        holder.population.setText(TopAnimalsDataList.get(position).getPopulation());
        holder.placeImage.setImageResource(TopAnimalsDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return TopAnimalsDataList.size();
    }

    public static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView animalName, countryAnimal, population;

        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            animalName = itemView.findViewById(R.id.animal_name);
            countryAnimal = itemView.findViewById(R.id.country_animal);
            population = itemView.findViewById(R.id.population);

        }
    }
}