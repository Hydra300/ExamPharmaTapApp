package com.example.exam;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class main extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);

        ImageView imgOne = findViewById(R.id.imageView1);
        ImageView imgTwo = findViewById(R.id.imageView2);
        ImageView imgThree = findViewById(R.id.imageView3);
        ImageView imgFour = findViewById(R.id.imageView4);
        ImageView imgFive = findViewById(R.id.imageView5);
        ImageView imgSix = findViewById(R.id.imageView6);

        imgOne.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, profile.class);
                startActivity(intent);
            }
        });
        imgTwo.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, settings.class);
                startActivity(intent);
            }
        });
        imgThree.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, mask.class);
                startActivity(intent);
            }
        });
        imgFour.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, syringe.class);
                startActivity(intent);
            }
        });
        imgFive.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, syringe.class);
                startActivity(intent);
            }
        });
        imgSix.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, syringe.class);
                startActivity(intent);
            }
        });

    }
}