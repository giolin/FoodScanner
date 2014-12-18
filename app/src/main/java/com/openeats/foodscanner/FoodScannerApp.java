package com.openeats.foodscanner;

import android.app.Application;

import com.openeats.foodscanner.misc.PackageFood;
import com.parse.Parse;
import com.parse.ParseObject;

public class FoodScannerApp extends Application {

    public static final String PARSE_APP_ID = "LYgF4zbPCfF180XuqfhFNSDOw1V4t2tEqjwnOCue";
    public static final String PARSE_CLIENT_KEY = "vn3QCYovnjYBKGjF2BXp419938YdLqHwiIFmrqCQ";

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(PackageFood.class);
        Parse.initialize(this, PARSE_APP_ID, PARSE_CLIENT_KEY);
    }

}
