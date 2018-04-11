package com.techno.databindingmvvm.Screens;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.techno.databindingmvvm.Adapter.MyAdapter;
import com.techno.databindingmvvm.Model.TemperatureData;
import com.techno.databindingmvvm.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyListActivity extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        recyclerView = (RecyclerView) findViewById(R.id.rvList);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        List<TemperatureData> items =
//                Arrays.asList(
//                        new TemperatureData("Hamburg", "5"),
//                        new TemperatureData("Berlin1", "6"),
//                        new TemperatureData("Berlin2", "6"),
//                        new TemperatureData("Berlin2", "6"),
//                        new TemperatureData("Berlin", "6"));


        List<TemperatureData> temperatureDataList = new ArrayList<TemperatureData>();
        for (int i = 1; i <= 10; i++) {
            TemperatureData temperatureData = new TemperatureData("Ahmedabad", "" + 3 + i, "http://www.kinyu-z.net/data/wallpapers/55/895591.jpg");
            temperatureDataList.add(temperatureData);
        }
        // define an adapter
        mAdapter = new MyAdapter(temperatureDataList);
        recyclerView.setAdapter(mAdapter);
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).
                load(url).
                placeholder(R.mipmap.ic_launcher).
                into(view);
    }
}
