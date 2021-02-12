package com.example.haitaomao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityHM extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ImageButton toMain = (ImageButton) findViewById(R.id.backToMain);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                finish();
            }
        });
    }

}