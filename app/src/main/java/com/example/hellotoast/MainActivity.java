package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // Déclaration d'une variable pour stocker la valeur du compteur
    private int count = 0;

    // Référence vers le composant TextView
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // lie le XML au code

        // Liaison des composants XML avec le code Java
        textCount = findViewById(R.id.count);
        Button buttonToast = findViewById(R.id.btn1);
        Button buttonCount = findViewById(R.id.btn2);

        // Lorsque l'utilisateur clique sur "Afficher un message"
        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Welcome to our app! We're glad you're here. !", Toast.LENGTH_SHORT).show();
        });

        // Lorsque l'utilisateur clique sur "Incrémenter le compteur"
        buttonCount.setOnClickListener(v -> {
            count++; // ajoute 1
            textCount.setText(String.valueOf(count)); // affiche la nouvelle valeur
        });
    }
}