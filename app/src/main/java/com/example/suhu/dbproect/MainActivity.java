package com.example.suhu.dbproect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TableManager tableManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableManager = new TableManager();
        SportModel model = new SportModel();
        model.setTime("2018-1-5");
        model.setLongitude_latitude("116,37");
        //插入数据
        tableManager.insert(TabConfig.Sport.TAB_NAME,model);
        //查询所有数据
        tableManager.queryAll(TabConfig.Sport.TAB_NAME,SportModel.class);
        //按照条件查询
        tableManager.query(TabConfig.Sport.TAB_NAME,SportModel.class,TabConfig.Sport.TIME,"2018-1-5");

    }
}
