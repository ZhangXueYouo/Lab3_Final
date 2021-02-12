package com.example.haitaomao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityPF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_f);

        ImageButton toMain = (ImageButton) findViewById(R.id.back);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vie) {
                finish();
            }
        });
    }
}