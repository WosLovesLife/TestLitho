package com.wosloveslife.testlitho;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Created by zhangh on 2017/9/6.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        SoLoader.init(this, false);
    }
}
