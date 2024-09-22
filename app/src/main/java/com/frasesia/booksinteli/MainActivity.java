package com.frasesia.booksinteli;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Invert",
                "Nenhum problema pode ser resolvido no mesmo nível de consciência que o criou.",
                "Never Give Up!",
                "Viva nos seus termos.",
                "Não trabalhe pelo dinheiro.",
                "O quanto você ganha é proporcional ao quanto você ajuda os outros",
                "Siga seu própio caminho",
                "Nunca pare de aprender"
        };

        int x = new Random().nextInt(8);

        TextView texto = findViewById(R.id.fraseGerada);
        texto.setText( frases[x] );
    }
}