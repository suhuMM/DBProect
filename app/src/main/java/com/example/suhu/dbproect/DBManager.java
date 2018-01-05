package com.example.suhu.dbproect;

import android.database.sqlite.SQLiteDatabase;

/**
 * @author suhu
 * @data 2017/9/12.
 * @description
 * http://blog.csdn.net/xu_song/article/details/49658195
 */

public class DBManager {
    private static DBManager manager;
    private DBHelper dbHelper;
    private SQLiteDatabase db;

    private DBManager(){
        dbHelper = DBHelper.getInstance(SoftwareApp.getInstance());
        if (db == null){
            db = dbHelper.getWritableDatabase();
        }
    }

    public static synchronized DBManager getInstance(){
        if (manager == null){
            manager = new DBManager();
        }
        return manager;
    }

    public SQLiteDatabase getDataBase(){
        return db;
    }


}
