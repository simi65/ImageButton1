package com.miss.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void firstImageButton(View view) {
        Toast.makeText(getApplicationContext(), "kalian telah memilih image button pertama", Toast
                .LENGTH_LONG).show();
    }

    public void secondImageButton(View view) {
        Toast.makeText(getApplicationContext(), "kalian telah memilih image button kedua", Toast
                .LENGTH_LONG).show();
    }
}
