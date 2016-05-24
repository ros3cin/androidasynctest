package com.example.renato.nonasyncmeter;

import android.app.Activity;
import android.widget.TextView;

import com.example.renato.workload.Workload;

import org.w3c.dom.Text;

/**
 * Created by Renato on 23/05/2016.
 */
public class ProcessamentoJavaThread implements Processamento {
    TextView textView;
    Workload workload;
    Activity refActivity;
    public ProcessamentoJavaThread(TextView textView, Workload workload, Activity refActivity){
        this.textView=textView;
        this.workload=workload;
        this.refActivity=refActivity;
    }

    public void execute(){
        (new Thread(new MyJavaThread(textView,workload,refActivity))).start();
    }
}
