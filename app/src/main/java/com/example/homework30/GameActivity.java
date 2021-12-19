package com.example.homework30;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView iImage;
    Button btn1 , btn2 , btn3;
    Button btOne ,btnTwo , btnThree;
    boolean isMessi , isRonaldo, isNeymar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialization();
        listeners();
    }



    private void initialization() {
        iImage = findViewById(R.id.im_image);
        btOne = findViewById( R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById( R.id.btn_three);
        btn1 = findViewById( R.id.btn_1);
        btn2 = findViewById( R.id.btn_2);
        btn3 = findViewById( R.id.btn_3);


    }
    public void changeImage ( View View){
        switch ( View.getId()){
            case R.id.btn_1:
                iImage.setImageResource(R.drawable.messi);
                isMessi = true;
                isNeymar = false;
                isRonaldo = false;
                break;
            case R.id.btn_2:
                iImage.setImageResource(R.drawable.neymar);
                isMessi = false;
                isNeymar = true;
                isRonaldo = false;
                break;
            case R.id.btn_3:
                iImage.setImageResource(R.drawable.ronaldo);
                isMessi = false;
                isNeymar = false;
                isRonaldo = true;

        }

    }
    private void listeners(){
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v
            ){
                if (isMessi){
                    Toast.makeText(GameActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v
            ){
                if (isNeymar){
                    Toast.makeText(GameActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v
            ){
                if (isRonaldo){
                    Toast.makeText(GameActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();

                }
                }
        });

        }
    }




