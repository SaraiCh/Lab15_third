package com.example.lab15_third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView btnaqp, btnlima, btncusco;
    TextView txtnombre,txtfaren;
    TextView txtinfo,txttemp ;
    List<String> ciudad_lista;
    List<Integer> temperatura_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnaqp = findViewById(R.id.firstciudad);
        btnlima = findViewById(R.id.secondciudad);
        btncusco = findViewById(R.id.thirdciudad);
        txtnombre = findViewById(R.id.ciudad_name);
        txtfaren = findViewById(R.id.farenheit);
        txtinfo = findViewById(R.id.ciudad);
        txttemp = findViewById(R.id.temperatura);
        ciudad_lista = new ArrayList<>();
        temperatura_lista = new ArrayList<>();
        ciudad_lista.add("Arequipa");
        ciudad_lista.add("Lima");
        ciudad_lista.add("Cuzco");
        temperatura_lista.add(18);
        temperatura_lista.add(17);
        temperatura_lista.add(19);
    }

    public void Temp_Arequipa(View view) {
        txtinfo.setText("CIUDAD");
        txttemp.setText("TEMPERATURA");
        int celsius = temperatura_lista.get(0);
        double result = (celsius * 9/5) + 32;
        txtnombre.setText(ciudad_lista.get(0));
        txtfaren.setText(Double.toString(result));
    }

    public void Temp_Lima(View view) {
        txtinfo.setText("CIUDAD");
        txttemp.setText("TEMPERATURA");
        int celsius = temperatura_lista.get(1);
        double result2 = (celsius * 9/5) + 32;
        txtnombre.setText(ciudad_lista.get(1));
        txtfaren.setText(Double.toString(result2));
    }

    public void Tempo_Cuzco(View view) {
        txtinfo.setText("CIUDAD");
        txttemp.setText("TEMPERATURA");
        int celsius = temperatura_lista.get(2);
        double result3 = (celsius * 9/5) + 32;
        txtnombre.setText(ciudad_lista.get(2));
        txtfaren.setText(Double.toString(result3));
    }
}