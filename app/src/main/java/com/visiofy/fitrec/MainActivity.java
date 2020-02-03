package com.visiofy.fitrec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            //TimeUnit.SECONDS.sleep(5);
            Intent i = new Intent(MainActivity.this, activity_home.class);
            startActivity(i);
        }
        catch(Exception ex){

        }


    }
}
