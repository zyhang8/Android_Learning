package com.example.thinkpad.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class ActivityLifeCycleActivity extends AppCompatActivity {
    private static String TAG = "LIFECYCLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "(1) onCreate()");
        Button button = (Button)findViewById(R.id.btn_finish);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    public void onStart()
    {
        super.onStart();
        // 输出日志
        Log.d(TAG, "-------onStart------");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        // 输出日志
        Log.d(TAG, "-------onRestart------");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        // 输出日志
        Log.d(TAG, "-------onResume------");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        // 输出日志
        Log.d(TAG, "-------onPause------");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        // 输出日志
        Log.d(TAG, "-------onStop------");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        // 输出日志
        Log.d(TAG, "-------onDestroy------");
    }
}
