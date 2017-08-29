package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random ran = new Random();

        final ImageView bal= (ImageView) findViewById(R.id.ball);

        final int[] num = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        Button ball = (Button) findViewById(R.id.roll);


        ball.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                bal.setImageResource(num[ran.nextInt(4)]);
            }
        });


    }
}
