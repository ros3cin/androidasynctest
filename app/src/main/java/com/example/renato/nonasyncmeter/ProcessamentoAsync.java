package com.example.renato.nonasyncmeter;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by Renato on 17/05/2016.
 */
public class ProcessamentoAsync extends AsyncTask<Integer, Integer, Integer> {
    TextView textoasync;
    public ProcessamentoAsync(TextView textoasync){
        this.textoasync = textoasync;
    }

    @Override
    protected void onPreExecute(){
        textoasync.setText("Started!");
    }

    @Override
    protected Integer doInBackground(Integer... params) {
        long a = 1;
        for(long i = 0; i < 100000000L; i++){
            a=(i*a)%7;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Integer result){
        textoasync.setText("Ended!");
    }
}
