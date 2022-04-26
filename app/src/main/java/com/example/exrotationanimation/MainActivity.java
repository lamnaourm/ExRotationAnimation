package com.example.exrotationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.img1);
        e1 = findViewById(R.id.depart);
        e2 = findViewById(R.id.arrivee);
    }

    public void rotate(View view) {

        int angleDepart = Integer.valueOf(e1.getText().toString());
        int angleArrivee = Integer.valueOf(e2.getText().toString());

        RotateAnimation anim = new RotateAnimation(angleDepart,angleArrivee,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        anim.setDuration(3000);
        anim.setFillAfter(true);
        image.startAnimation(anim);
    }
}