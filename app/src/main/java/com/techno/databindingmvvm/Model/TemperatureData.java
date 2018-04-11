package com.techno.databindingmvvm.Model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.techno.databindingmvvm.BR;

/**
 * Created by Arbaz.
 * Date: 30/3/18
 * Time: 11:17 AM
 */
public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;
    private String url;

    public TemperatureData(String location, String celsius, String url) {
        this.location = location;
        this.celsius = celsius;
        this.url = url;
    }


    @Bindable
    public String getCelsius() {
        return celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }
}
