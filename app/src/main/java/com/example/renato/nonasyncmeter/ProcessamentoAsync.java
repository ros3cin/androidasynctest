package com.example.renato.nonasyncmeter;

import android.os.AsyncTask;
import android.widget.TextView;

import com.example.renato.workload.Workload;

/**
 * Created by Renato on 17/05/2016.
 */
final class ProcessamentoAsync extends AsyncTask<Integer, Integer, Integer> {
    private TextView textoasync;
    private Workload workload;
    public ProcessamentoAsync(TextView textoasync, Workload workload){
        this.textoasync = textoasync;
        this.workload = workload;
    }

    @Override
    protected void onPreExecute(){
        textoasync.setText("Started!");
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        workload.execute();
        return null;
    }

    @Override
    protected void onPostExecute(Integer result){
        textoasync.setText("Ended!");
    }
}
