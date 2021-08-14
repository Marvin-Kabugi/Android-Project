package com.mjk.gpstracking;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static MyApplication singleton;
    private List<Location> myLocationList;

    public List<Location> getMyLocationList() {
        return myLocationList;
    }

    public void setMyLocationList(List<Location> myLocationList) {
        this.myLocationList = myLocationList;
    }

    public static MyApplication getInstance(){
        return singleton;
    }

    public void onCreate(){
        super.onCreate();
        singleton = this;
        myLocationList = new ArrayList<>();
    }
}
