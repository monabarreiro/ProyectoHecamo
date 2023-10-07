package com.example.proyectohecamo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(+R.id.button);
    }
        public void onClick(View view) {

            TextView helloWorldtext = findViewById(+R.id.helloWorldtext);
            helloWorldtext.setText(R.string.Cultivos);
            helloWorldtext.setBackgroundColor(+R.color.green);
        }





}