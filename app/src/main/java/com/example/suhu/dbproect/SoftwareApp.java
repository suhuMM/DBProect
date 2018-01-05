package com.example.suhu.dbproect;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * @author: 苏虎
 * @email: suhu0824@gmail.com
 * @data: 2018/1/51022
 * @description:
 */

public class SoftwareApp extends LitePalApplication{
    private static SoftwareApp softwareApp;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        softwareApp = this;
    }

    public static SoftwareApp getInstance(){
        return softwareApp;
    }
}
