package com.example.user.splashanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvw=(ImageView) findViewById(R.id.smilyyy);
        ((AnimationDrawable)imgvw.getBackground()).start();


        Thread background =new Thread()
        {
            public void run()
            {
                try
                {

                    sleep(3000);


                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                finally
                {
                    Intent i=new Intent(MainActivity.this,page.class);
                    startActivity(i);
                }

            }
        };
    background.start();

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}


