package com.techno.databindingmvvm.Interface;

import com.techno.databindingmvvm.Model.TemperatureData;

/**
 * Created by Arbaz.
 * Date: 30/3/18
 * Time: 11:21 AM
 */
public interface MainActivityContract {

    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }
}
