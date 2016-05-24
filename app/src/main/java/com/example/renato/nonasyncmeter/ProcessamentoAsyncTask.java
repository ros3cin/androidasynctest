package com.example.renato.nonasyncmeter;

import android.widget.TextView;

import com.example.renato.workload.Workload;

import org.w3c.dom.Text;

/**
 * Created by Renato on 23/05/2016.
 */
public class ProcessamentoAsyncTask implements Processamento {
    private TextView textView;
    private Workload workload;
    public ProcessamentoAsyncTask(TextView textView, Workload worload){
        this.textView=textView;
        this.workload=worload;
    }

    public void execute(){
        (new MyAsyncTask(textView,workload)).execute();
    }
}
