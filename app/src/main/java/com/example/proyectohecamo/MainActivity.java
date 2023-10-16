package com.example.proyectohecamo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.TextureView;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
 Button buttonMaiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMaiz = findViewById(R.id.buttonMaiz);
        buttonMaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
               Intent intent = new Intent(MainActivity.this,Activity2Maiz.class); // aca  van a ir el activity desde la que estoy sliendo ala
                // que quiero ir y creo ademas el activity nuevo
                // inicio la segunda activity
                startActivity(intent);
            }
        });

      //  Button myButton = findViewById(+R.id.buttonMaiz);
      //  myButton.setOnClickListener(new View.OnClickListener() {

          //  @Override
           // public void onClick(View view) {


          //      TextView maiz = findViewById(+R.id.buttonMaiz);
          //      maiz.setText(R.string.maiz);
          //      maiz.setBackgroundColor(+R.color.naranja);
            //    Toast.makeText(getApplicationContext(),getString(R.string.naranja),Toast.LENGTH_LONG);





            }



    //   });



    }


