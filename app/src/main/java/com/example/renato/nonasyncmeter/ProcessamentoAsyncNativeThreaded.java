package com.example.renato.nonasyncmeter;

import android.widget.TextView;

import com.example.renato.workload.Workload;

/**
 * Created by Renato on 21/05/2016.
 */
final class ProcessamentoAsyncNativeThreaded implements Runnable {
    private Workload workload;
    private TextView textview;
    public ProcessamentoAsyncNativeThreaded(Workload workload, TextView textview){
        this.workload=workload;
        this.textview=textview;
    }
    public void run(){
        textview.setText("Started!");
        workload.execute();
        textview.setText("Ended!");
    }
}
