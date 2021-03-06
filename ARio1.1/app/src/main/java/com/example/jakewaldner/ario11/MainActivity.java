package com.example.jakewaldner.ario11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //transition to cameraview
        Button goToCodesListButton = (Button) this.findViewById(R.id.gotocamera_button2);
        goToCodesListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CameraViewActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        //transition to mario scene
        Button openMarioButton = (Button) this.findViewById(R.id.open_mario_button);
        openMarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MarioActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        //Intent i = new Intent(MainActivity.this, CameraViewActivity.class);
        //MainActivity.this.startActivity(i);
    }

}
