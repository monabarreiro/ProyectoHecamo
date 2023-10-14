package com.example.proyectohecamo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.TextureView;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(+R.id.buttonMaiz);
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                TextView maiz = findViewById(+R.id.buttonMaiz);
                maiz.setText(R.string.maiz);
                maiz.setBackgroundColor(+R.color.naranja);
                Toast.makeText(getApplicationContext(),getString(R.string.naranja),Toast.LENGTH_LONG);





            }






            });



    }


}