package com.fullstackoasis.videoviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Use https://developer.android.com/guide/topics/media-apps/media-apps-overview#compat-library
 *
 * Uses video from https://archive.org/details/SlowMotionFlame
 * "Slow Motion Flame
 * by Sharuban"
 * Under license https://creativecommons.org/licenses/by/3.0/us/
 */
public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private static String TAG = MainActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = findViewById(R.id.textView);
        v.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.d(TAG, "onTouch called");
        // Start a new Activity
        // https://developer.android.com/training/basics/firstapp/starting-activity
        Intent intent = new Intent(this, VideoViewActivity.class);
        startActivity(intent);
        return false;
    }
}

