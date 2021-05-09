package com.joffrey.plusoumoinsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    TextView nombre;
    EditText nombreS;
    Button valider;

    public void reload() {

        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();

        overridePendingTransition(0, 0);
        startActivity(intent);
    }

    private boolean verifCondition (int nombre1, int nombre2){
        boolean valeur = false;
        if (nombre1 == nombre2) {
            valeur = true;
        }
        return valeur;
    }

    private void LancerProg() {
        int nbre = parseInt(nombreS.getText().toString());
        int nbre2 = 3;
        boolean verif = verifCondition(nbre, nbre2);

        if (verif == true) {
            nombre.setText(getResources().getString(R.string.gagner));
            valider.setText(getResources().getString(R.string.reset));

            valider.setOnClickListener(v->reload());
        }
        else{
            nombre.setText(getResources().getString(R.string.mauvaise_valeur));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        nombreS = findViewById(R.id.nombreS);
        valider = findViewById(R.id.valider);

        valider.setOnClickListener(v -> LancerProg());

    }
}
