package com.example.kemal.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.R;
public class ikinciEkran extends AppCompatActivity {



    Button home;
    Button music;
    Button homework;
    Button spor;
    Button respo;
    Button genel;
    Button speech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_ekran);

        home=(Button) findViewById(R.id.ana);
        music=(Button) findViewById(R.id.music);
        homework=(Button)findViewById(R.id.homework);
        spor=(Button)findViewById(R.id.spor);
        respo=(Button)findViewById(R.id.respo);
        genel=(Button)findViewById(R.id.genel);
        speech=(Button)findViewById(R.id.speech);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getBaseContext(), yatak.class);

                startActivity(i);


            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), music.class);

                startActivity(i);
            }
        });



        homework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), odev.class);

                startActivity(i);
            }
        });





        spor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), spor.class);

                startActivity(i);
            }
        });




        respo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Maps.class);

                startActivity(i);
            }
        });



        genel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), genel.class);

                startActivity(i);
            }
        });


        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Speech.class);
                startActivity(i);
            }
        });
    }
}
