package com.thepesudoartistclan.unibox;

import java.util.Timer;
import java.util.TimerTask;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //For audio playbacks
    MediaPlayer audioplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise info button
        Button info = (Button) findViewById(R.id.infobutton);
        //Initialise sound buttons
        Button push1 = (Button) findViewById(R.id.button1);
        Button push2 = (Button) findViewById(R.id.button2);
        Button push3 = (Button) findViewById(R.id.button3);
        Button push4 = (Button) findViewById(R.id.button4);
        Button push5 = (Button) findViewById(R.id.button5);
        Button push6 = (Button) findViewById(R.id.button6);
        Button push7 = (Button) findViewById(R.id.button7);
        Button push8 = (Button) findViewById(R.id.button8);
        Button push9 = (Button) findViewById(R.id.button9);
        Button push10 = (Button) findViewById(R.id.button10);
        Button push11 = (Button) findViewById(R.id.button11);
        Button push12 = (Button) findViewById(R.id.button12);
        Button push13 = (Button) findViewById(R.id.button13);
        Button push14 = (Button) findViewById(R.id.button14);
        Button push15 = (Button) findViewById(R.id.button15);
        Button push16 = (Button) findViewById(R.id.button16);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("\"유니\" 또는 \"UNI\"는 ST MEDiA 사에서 개발한 보컬로이드 라이브러리입니다. 캐릭터플래닛 웹사이트에서 지금 구매하실 수 있습니다. \n\n" +
                        "이 앱은 여러분들이 유니의 목소리로 미리 만들어진 소리를 가지고 놀 수 있도록 해줍니다. 개발자가 과제하기 싫어서 만들었습니다. \n\n" +
                        "Developed by Producer.P \nApp icon illustrated by 오징어").setTitle("Information");
                builder.show();
            }
        });

        //Sound button 1 Click Action
        push1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Play selected audio file from RAW directory
                audioplay=MediaPlayer.create(getApplicationContext(),R.raw.emotionaldamage);
                audioplay.start();

                //Change button image to active button
                push1.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push1.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });

        //Sound button 2 Click Action
        push2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Play selected audio file from RAW directory
                audioplay=MediaPlayer.create(getApplicationContext(),R.raw.emotionaldamage);
                audioplay.start();

                //Change button image to active button
                push2.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push2.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push3.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push3.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push4.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push4.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push5.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push5.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push6.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push6.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push7.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push7.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push8.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push8.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push9.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push9.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Change button image to active button
                push10.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push10.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                push11.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push11.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                push12.setBackgroundResource(R.drawable.roundedbutton_active);

                //Return to inactive button after 100ms
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push12.setBackgroundResource(R.drawable.roundedbutton);
                    }
                }, 100);
            }
        });
        push13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        push14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        push15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        push16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}