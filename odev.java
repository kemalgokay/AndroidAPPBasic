package com.example.kemal.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.R;
public class odev extends AppCompatActivity {


    Button ileri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odev);

        ileri=(Button)findViewById(R.id.ileriOdev);


        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), odevKontrol.class);

                startActivity(i);
            }
        });
    }
}
