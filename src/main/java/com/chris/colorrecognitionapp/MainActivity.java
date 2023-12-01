package com.chris.colorrecognitionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AppCompatButton click1 = (AppCompatButton) findViewById(R.id.button1);
        AppCompatButton click2 = (AppCompatButton) findViewById(R.id.button2);
        AppCompatButton click3 = (AppCompatButton) findViewById(R.id.button3);
        AppCompatButton click4 = (AppCompatButton) findViewById(R.id.button4);
        AppCompatButton click5 = (AppCompatButton) findViewById(R.id.button5);
        AppCompatButton click6 = (AppCompatButton) findViewById(R.id.button6);

//    button 1 =red, button 2 = Orange, btt3 = yellow, btt4 = green, btt5 = blue, btt6 = pink

        final MediaPlayer mp1 = MediaPlayer.create(getApplicationContext(), R.raw.red1);
        final MediaPlayer mp2 = MediaPlayer.create(getApplicationContext(), R.raw.orange1);
        final MediaPlayer mp3 = MediaPlayer.create(getApplicationContext(), R.raw.yellow1);
        final MediaPlayer mp4 = MediaPlayer.create(getApplicationContext(), R.raw.green1);
        final MediaPlayer mp5 = MediaPlayer.create(getApplicationContext(), R.raw.blue1);
        final MediaPlayer mp6 = MediaPlayer.create(getApplicationContext(), R.raw.pink2);




        View.OnClickListener elen = (v) -> {
//Basically TOast.makeText is mag didisplay siya ng text after mo pindutin yung button
            switch (v.getId()) {
                case R.id.button1:
                    mp1.start();
                    Toast.makeText(MainActivity.this, "Color Red", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.button2:
                    mp2.start();
                    Toast.makeText(MainActivity.this, "Color Orange", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button3:
                    mp3.start();
                    Toast.makeText(MainActivity.this, "Color Yellow", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button4:
                    mp4.start();
                    Toast.makeText(MainActivity.this, "Color Green", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button5:
                    mp5.start();
                    Toast.makeText(MainActivity.this, "Color Blue", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button6:
                    mp6.start();
                    Toast.makeText(MainActivity.this, "Color Pink", Toast.LENGTH_SHORT).show();
                    break;


            }
        };
        click1.setOnClickListener(elen);
        click2.setOnClickListener(elen);
        click3.setOnClickListener(elen);
        click4.setOnClickListener(elen);
        click5.setOnClickListener(elen);
        click6.setOnClickListener(elen);
    }
    }








