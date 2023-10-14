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

        TextView maiz = findViewById(R.id.buttonMaiz);
        maiz.setText(R.string.maiz);


        //TODO cuidado, los ID de los componentes se agregan con el formato R.id.nombredelcomponente
        TextView soja = findViewById(R.id.buttonSoja);
        soja.setText(R.string.soja);


        TextView limon = findViewById(R.id.limon);
        limon.setText(R.string.limon);
    }
}