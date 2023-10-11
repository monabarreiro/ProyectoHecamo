package com.example.proyectohecamo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.TextureView;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(+R.id.button_busq_cultivos);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView maiz = findViewById(+R.id.maiz);
                maiz.setText(R.string.maiz);

                TextView soja = findViewById(+R.id.soja);
                soja.setText(R.string.soja);

                TextView limon = findViewById(+R.id.limon);
                limon.setText(R.string.limon);

            }






            });



    }


}