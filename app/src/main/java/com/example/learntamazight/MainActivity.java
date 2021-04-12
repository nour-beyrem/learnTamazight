package com.example.learntamazight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button _btnNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnNumbers = (Button) findViewById(R.id.btnNumbers);
        _btnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nb = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(nb);
            }
        });
    }
}