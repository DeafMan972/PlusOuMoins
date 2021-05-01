package com.joffrey.plusoumoinsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nombre;
    EditText nombreS;
    Button valider;

    private void relierValeurRes(TextView txt, EditText edt, Button vd) {
        nombre = findViewById(R.id.nombre);
        nombreS = findViewById(R.id.nombreS);
        valider = findViewById(R.id.valider);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relierValeurRes(this.nombre, this.nombreS, this.valider);
        valider.setOnClickListener(v -> {
            LancerProg();
        });
    }
    private void LancerProg() {

        int nbre = Integer.parseInt(nombre.getText().toString());
        Pom pom = new Pom(nbre);
        pom.LancerProgramme();
        final boolean getRes = pom.isReponse();
        if (getRes == false) {
            if (pom.getNombre() > pom.getNombre2()) {
                nombre.setText(getString(R.string.plus));
            } else if (pom.getNombre2() > pom.getNombre()) {
                nombre.setText(getString(R.string.moins));
            } else {
                nombre.setText(getString(R.string.gagner));
                valider.setText(getString(R.string.reset));
                if (valider.isPressed()) {
                    LancerProg();
                }
            }
        }
    }
}