package com.example.renato.nonasyncmeter;

import android.app.Activity;
import android.widget.TextView;

import com.example.renato.workload.Workload;

/**
 * Created by Renato on 21/05/2016.
 */
final class MyJavaThread implements Runnable {
    private Activity refActivity;
    private Workload workload;
    private TextView textview;
    public MyJavaThread(TextView textview, Workload workload, Activity refActivity){
        this.workload=workload;
        this.textview=textview;
        this.refActivity=refActivity;
    }

    private void runOnUiThread(Runnable action){
        refActivity.runOnUiThread(action);
    }

    public void run(){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textview.setText("Started!");
            }
        });
        workload.execute();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textview.setText("Ended!");
            }
        });
    }
}
