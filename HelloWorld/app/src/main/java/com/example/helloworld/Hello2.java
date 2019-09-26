package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello2 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello2";
    private static int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        count2++;
        Log.d(TAG, "onCreate execute" + " 这是栈内第" + count2 + "个Hello2");
        setTitle("Hello2");
        settupButtons();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart" + " 这是栈内第" + count2 + "个Hello2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause" + " 这是栈内第" + count2 + "个Hello2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume" + " 这是栈内第" + count2 + "个Hello2");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume" + " 这是栈内第" + count2 + "个Hello2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop" + " 这是栈内第" + count2 + "个Hello2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy" + " 这是栈内第" + count2 + "个Hello2");
        count2--;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.button1) {
            intent = new Intent(this, Hello1.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button2) {
            intent = new Intent(this, Hello2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.button3) {
            intent = new Intent(this, Hello3.class);
            startActivity(intent);
        }
    }

    private void settupButtons() {
        Button b;
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);  //this是本类的实例对象，它是实现Listener的监听
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(this);
    }
}
