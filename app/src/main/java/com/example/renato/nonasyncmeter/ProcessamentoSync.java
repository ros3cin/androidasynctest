package com.example.renato.nonasyncmeter;

import android.widget.TextView;

import com.example.renato.workload.Workload;

import org.w3c.dom.Text;

/**
 * Created by Renato on 23/05/2016.
 */
public class ProcessamentoSync implements Processamento {
    private TextView textView;
    private Workload workload;

    public ProcessamentoSync(TextView textView, Workload workload){
        this.textView=textView;
        this.workload=workload;
    }

    public void execute(){
        textView.setText("Started!");
        workload.execute();
        textView.setText("Ended!");
    }
}
