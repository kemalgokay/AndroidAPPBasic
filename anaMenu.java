package com.example.kemal.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class anaMenu extends AppCompatActivity {

    ImageButton play;
    ImageButton hakkinda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_menu);

        play=(ImageButton)findViewById(R.id.play);
        hakkinda=(ImageButton)findViewById(R.id.about);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getBaseContext(),ikinciEkran.class);
                startActivity(i);


            }
        });

        hakkinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),hakkinda.class);
                startActivity(i);
            }
        });
    }
}
