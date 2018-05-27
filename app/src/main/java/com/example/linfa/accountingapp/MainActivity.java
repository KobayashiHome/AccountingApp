package com.example.linfa.accountingapp;
/**
 * @date 2018/5/24
 * @author skylinelin
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecordBean recordBean = new RecordBean();
        //Toast.makeText(MainActivity.this,DateUtil.getFormattedTime(recordBean.timeStamp),Toast.LENGTH_SHORT).show();
    }
}
