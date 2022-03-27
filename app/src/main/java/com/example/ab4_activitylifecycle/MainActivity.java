package com.example.ab4_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);

        button1.setOnClickListener(e -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });



        Log.d("onCreate1", "activity 1 has been created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("onStart1", "activity 1 has been started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("onResume1", "activity 1 has been resumed");
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("onPause1", "activity 1 has been paused");

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("onRestart1", "activity 1 has been restarted");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("onStop1", "activity 1 has been stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("onDestroy1", "activity 1 has been destroyed");
    }







}