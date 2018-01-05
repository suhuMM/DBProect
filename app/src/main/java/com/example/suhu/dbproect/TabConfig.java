package com.example.suhu.dbproect;

/**
 * @author suhu
 * @data 2017/9/12.
 * @description 数据库基本信息类
 */

public class TabConfig {
    public static final String DB_NAME = "tiger.db";

    public static class Sport{
        public static final String TAB_NAME = "sport";
        public static final String TIME = "time";
        public static final String LONGITUDE_LATITUDE = "longitude_latitude";
    }

    public static class Friend{
        public static final String TAB_NAME = "friend";
        public static final String USER_ID = "userId";
        public static final String NAME = "name";
        public static final String TOKEN = "token";
        public static final String URL = "url";

    }






}
