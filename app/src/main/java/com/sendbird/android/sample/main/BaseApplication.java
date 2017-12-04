package com.sendbird.android.sample.main;


import android.app.Application;

import com.sendbird.android.SendBird;

public class BaseApplication extends Application {

    private static final String APP_ID = "017F43B1-641C-4306-99EC-6287E1C046BB"; // US-1 Demo
    public static final String VERSION = "3.0.38";

    @Override
    public void onCreate() {
        super.onCreate();
        SendBird.init(APP_ID, getApplicationContext());
    }
}
