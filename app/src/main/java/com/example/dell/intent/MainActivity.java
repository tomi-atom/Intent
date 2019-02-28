package com.example.dell.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pindah; //deklarasikan button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah = findViewById(R.id.pindah); //inisialisai variabel button

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah  = new Intent(MainActivity.this,Activity2.class);
                startActivity(pindah);
            }
        });
    }
}
