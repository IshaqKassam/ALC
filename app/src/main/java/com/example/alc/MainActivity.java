package com.example.alc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnone, btntwo;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnone = findViewById(R.id.btn1);
        btntwo = findViewById(R.id.btn2);
        textView = findViewById(R.id.textView);


        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                finish();
            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
