package com.example.suhu.dbproect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TableManager tableManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add();

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

    private void add() {
        People people = new People();
        people.setName("小米");
        people.setAge(18);
        people.save();

        List<People> list = DataSupport.findAll(People.class);
        String ss = DataSupport.find(People.class,1).toString();


    }
}
