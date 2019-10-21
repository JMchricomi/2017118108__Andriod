package com.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello1 extends AppCompatActivity
        implements View.OnClickListener {


    private static final String TAG = "HelloWorldActivity";  //TAG是一个对象引用
    private static int count1 = 0;
    private static int objCount = 0;
    private int mObjCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        count1++;
        Log.d(TAG, "onCreate execute" + " 这是栈内第" + count1 + "个Hello1");
        setTitle("Hello1");
        settupButtons();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart" + " 这是栈内第" + count1 + "个Hello1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause" + " 这是栈内第" + count1 + "个Hello1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume" + " 这是栈内第" + count1 + "个Hello1");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume" + " 这是栈内第" + count1 + "个Hello1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop" + " 这是栈内第" + count1 + "个Hello1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy" + " 这是栈内第" + count1 + "个Hello1");
        count1--;
    }

    @Override       //捕捉谁谁谁被点击了
    public void onClick(View v) { //v是触发被点击的

        if (v.getId() == R.id.button1) {
            //Intent intent1 = new Intent(Hello1.this, Hello1.class);
            /*Intent intent1 = new Intent(Intent.ACTION_GET_RESTRICTION_ENTRIES);
            startActivity(intent1);*/
            Uri uri = Uri.parse("geo:38.899533,-77.036476");
            Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent1);
        }
        if (v.getId() == R.id.button2) {
            //Intent intent2 = new Intent(this, Hello2.class);
            Intent intent2 = new Intent(Intent.ACTION_DIAL);
            intent2.setData(Uri.parse("tel:10086"));
            startActivity(intent2);
        }
        //点击跳转去韩师官网（网页链接跳转）
        if (v.getId() == R.id.button3) {
            //String string1 = "com.example.helloworld.ACTION";
            //intent = new Intent(this, Hello3.class);
            //intent = new Intent();
            //intent.setAction(string1);
            Intent intent3 = new Intent(Intent.ACTION_VIEW); //静态类
            intent3.setData(Uri.parse("http://www.hstc.edu.cn"));
            startActivity(intent3);
        }
    }

    private void settupButtons() {
        Button b;    //声明一个Button的对象

        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);  //this是本类的实例对象，它是实现Listener的监听
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(this);
    }
}
