package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello3 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello3";
    private static int count3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello3);
        count3++;
        Log.d(TAG, "onCreate execute" + " 这是栈内第" + count3 + "个Hello3");
        setTitle("Hello3");
        settupButtons();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart" + " 这是栈内第" + count3 + "个Hello3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause" + " 这是栈内第" + count3 + "个Hello3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume" + " 这是栈内第" + count3 + "个Hello3");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume" + " 这是栈内第" + count3 + "个Hello3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop" + " 这是栈内第" + count3 + "个Hello3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy" + " 这是栈内第" + count3 + "个Hello3");
        count3--;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.bt1) {
            intent = new Intent(this, HelloWorldActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.bt2) {
            intent = new Intent(this, Hello2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.bt3) {
            intent = new Intent(this, Hello3.class);
            startActivity(intent);
        }
    }

    private void settupButtons() {
        Button b;

        b = (Button) findViewById(R.id.bt1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.bt2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.bt3);
        b.setOnClickListener(this);


    }
}
