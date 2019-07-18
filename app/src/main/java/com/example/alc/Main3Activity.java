package com.example.alc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    ImageView pic;
    TextView name, track, country, phone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        pic = findViewById(R.id.imageView3);
        name = findViewById(R.id.name);
        track = findViewById(R.id.track);
        country = findViewById(R.id.country);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
    }
}
