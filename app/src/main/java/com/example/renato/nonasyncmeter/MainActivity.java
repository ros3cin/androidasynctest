package com.example.renato.nonasyncmeter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button botaoNonAsync = (Button)findViewById(R.id.nonasyncbtn);
        botaoNonAsync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textoNonAsync = (TextView) findViewById(R.id.statusnonasync);
                textoNonAsync.setText("Started!");
                long a = 1;
                for (long i = 0; i < 100000000L; i++) {
                    a = (i * a) % 7;
                }
                textoNonAsync.setText("Ended!");
            }
        });

        Button botaoAsync = (Button)findViewById(R.id.asyncbtn);
        final TextView textoAsync = (TextView)findViewById(R.id.statusasync);
        botaoAsync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ProcessamentoAsync(textoAsync).execute();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
