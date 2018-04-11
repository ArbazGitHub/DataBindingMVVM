package com.techno.databindingmvvm.Presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.techno.databindingmvvm.Interface.MainActivityContract;
import com.techno.databindingmvvm.Model.TemperatureData;
import com.techno.databindingmvvm.Screens.MyListActivity;

/**
 * Created by Arbaz.
 * Date: 30/3/18
 * Time: 11:24 AM
 */
public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private Context ctx;

    public MainActivityPresenter(MainActivityContract.View view, Context ctx) {
        this.view = view;
        this.ctx = ctx;
    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

    @Override
    public void showList() {
        Intent intent = new Intent(ctx, MyListActivity.class);
        ctx.startActivity(intent);
    }
}
