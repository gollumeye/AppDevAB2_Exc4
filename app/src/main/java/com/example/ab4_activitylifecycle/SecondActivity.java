package com.example.ab4_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(e -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        Log.d("onCreate2", "activity 2 has been created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("onStart2", "activity 2 has been started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("onResume2", "activity 2 has been resumed");
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("onPause2", "activity 2 has been paused");

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("onRestart2", "activity 2 has been restarted");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("onStop2", "activity 2 has been stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("onDestroy2", "activity 2 has been destroyed");
    }


}
