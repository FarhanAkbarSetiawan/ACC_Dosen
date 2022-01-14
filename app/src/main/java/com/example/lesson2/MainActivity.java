package com.example.lesson2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvsoal;
    TextView tvhasil;
    Button btnganjil;
    Button btngenap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvsoal = findViewById(R.id.show_count);
        tvhasil = findViewById(R.id.hasil);
        btnganjil = findViewById(R.id.button_count);
        btngenap = findViewById(R.id.button_ganjil);


        Random myRandom = new Random();
        int num = myRandom.nextInt(101);//0 - 100
        tvsoal.setText(""+num);

        
        btnganjil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 2 == 0)
                    tvhasil.setText("Point Anda -5");
                else
                    tvhasil.setText("Point anda +5");
            }
        });

       
        btngenap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 2 == 0)
                    tvhasil.setText("Point Anda +5");
                else
                    tvhasil.setText("Point Anda -5");
            }
        });
    }
}