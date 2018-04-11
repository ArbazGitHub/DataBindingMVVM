package com.techno.databindingmvvm.Screens;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.techno.databindingmvvm.Interface.MainActivityContract;
import com.techno.databindingmvvm.Model.TemperatureData;
import com.techno.databindingmvvm.Presenter.MainActivityPresenter;
import com.techno.databindingmvvm.R;
import com.techno.databindingmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, this);

        TemperatureData temperatureData = new TemperatureData("Humburg", "10", "http://www.kinyu-z.net/data/wallpapers/55/895591.jpg");

        binding.setTemp(temperatureData);

        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius = temperatureData.getCelsius();
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
    }


}
