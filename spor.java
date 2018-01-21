package com.example.kemal.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class spor extends AppCompatActivity implements SensorEventListener{

    TextView adim;
    int atilanAdimSayisi=1850;
    Button btn;
    Button kontrol;
    EditText adimSayisi;
    SensorManager sensorManager;
    int a=10;

    boolean running=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spor);

        adimSayisi=(EditText)findViewById(R.id.editText);
        adim=(TextView) findViewById(R.id.textView2);

        btn=(Button) findViewById(R.id.button);
        kontrol=(Button)findViewById(R.id.button8);
        sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adim.setText("0");
            }
        });


        kontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if (adim.getText() == atilanAdimSayisi) {
                    Toast.makeText(getApplicationContext(), "Adım Sayısı tamamlandı.", Toast.LENGTH_LONG).show();
                //}

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        running=true;
        Sensor countSensor= sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor !=null){
            sensorManager.registerListener(this,countSensor,SensorManager.SENSOR_DELAY_UI);

        }else{
            Toast.makeText(this,"Bir problem var Kontrol edin!!!",Toast.LENGTH_SHORT).show();
        }



    }
    @Override
    protected void onPause() {
        super.onPause();

        running=false;
        //sensorManager.unregisterListener(this);

    }

    @Override
    public void onSensorChanged(SensorEvent event){

        if(running){

            adim.setText(String.valueOf(event.values[0]));
        }
    }

    public void onAccuracyChanged(Sensor sensor,int accuracy){

    }





}