package com.example.suhu.dbproect;

import android.app.Application;

/**
 * @author: 苏虎
 * @email: suhu0824@gmail.com
 * @data: 2018/1/51022
 * @description:
 */

public class SoftwareApp extends Application{
    private static SoftwareApp softwareApp;

    @Override
    public void onCreate() {
        super.onCreate();
        softwareApp = this;
    }

    public static SoftwareApp getInstance(){
        return softwareApp;
    }
}
