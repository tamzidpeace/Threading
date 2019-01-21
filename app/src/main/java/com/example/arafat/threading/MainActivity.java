package com.example.arafat.threading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view) {
        ExmapleThread exmapleThread = new ExmapleThread(20);
        exmapleThread.start();
    }

    class ExmapleThread extends Thread {

        int turn;
        public ExmapleThread(int turn) {
            this.turn =turn;
        }


        @Override
        public void run() {
            for (int i = 0; i < turn; i++) {
                try {
                    Thread.sleep(2000);
                    Log.d(TAG, "startThread: " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
