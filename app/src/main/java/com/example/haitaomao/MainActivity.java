package com.example.haitaomao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button HM = (Button)findViewById(R.id.HM);
        Button JB = (Button)findViewById(R.id.JB);
        Button PF = (Button)findViewById(R.id.PF);


        HM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityHM.class);
                startActivity(intent);
            }
        });


        JB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityJB.class);
                startActivity(intent);
            }
        });

        PF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityPF.class);
                startActivity(intent);
            }
        });

    }

}