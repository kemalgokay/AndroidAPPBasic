package com.example.kemal.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.R;
public class sonuc extends AppCompatActivity {


    TextView puan;
    Button puanKaydet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        puan=(TextView)findViewById(R.id.puan);
        puanKaydet=(Button)findViewById(R.id.puanKaydet);






    }
}
