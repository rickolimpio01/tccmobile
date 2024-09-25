package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.profile.adapter.RecentsAdapter;
import com.example.profile.adapter.TopAnimalsAdapter;
import com.example.profile.model.TopAnimalsData;
import com.example.profile.model.RecentsData;


import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topAnimalsRecycler;
    RecentsAdapter recentsAdapter;
    TopAnimalsAdapter topAnimalsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esse RecentsData está com erro

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopAnimalsData> TopAnimalsDataList = new ArrayList<>();
        TopAnimalsDataList.add(new TopAnimalsData("Kasimir Hill", "India", "$200 - $500", R.drawable.arrow));
        TopAnimalsDataList.add(new TopAnimalsData("Kasimir Hill", "India", "$200 - $500", R.drawable.arrow));
        TopAnimalsDataList.add(new TopAnimalsData("Kasimir Hill", "India", "$200 - $500", R.drawable.arrow));
        TopAnimalsDataList.add(new TopAnimalsData("Kasimir Hill", "India", "$200 - $500", R.drawable.arrow));
        TopAnimalsDataList.add(new TopAnimalsData("Kasimir Hill", "India", "$200 - $500", R.drawable.arrow));

        setTopAnimalsRecycler(TopAnimalsDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter((Context) this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private void setTopAnimalsRecycler(List<TopAnimalsData> TopAnimalsDataList) {

        topAnimalsRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topAnimalsRecycler.setLayoutManager(layoutManager);
        topAnimalsAdapter = new TopAnimalsAdapter(this, TopAnimalsDataList);
        topAnimalsRecycler.setAdapter(topAnimalsAdapter);

    }
}
