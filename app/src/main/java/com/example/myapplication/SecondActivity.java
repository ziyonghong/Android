package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //不在Activity中显示标题栏，必须在setContentView()之前执行
        setContentView(R.layout.second_layout);
    }
}
