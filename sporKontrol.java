package com.example.kemal.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.R;
public class sporKontrol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spor_kontrol);


    }


    public void animasyon(){
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        ImageView logo=(ImageView) findViewById(R.id.imageView2);
        animation.reset();
        logo.clearAnimation();
        logo.startAnimation(animation);


    }

}
