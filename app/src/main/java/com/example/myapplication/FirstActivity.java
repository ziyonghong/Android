package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //不在Activity中显示标题栏，必须在setContentView()之前执行
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

               // Toast.makeText(FirstActivity.this, "You clicked Button 1",
                //        Toast.LENGTH_SHORT).show();

                //显示Intent启动另一个Activity
             //   Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
              //  startActivity(intent);

                //调用系统浏览器
                Intent intent=new Intent(Intent.ACTION_VIEW); //系统内置的动作
                intent.setData(Uri.parse("http://baidu.com"));
                startActivity(intent);
            }
        });
    }
}
