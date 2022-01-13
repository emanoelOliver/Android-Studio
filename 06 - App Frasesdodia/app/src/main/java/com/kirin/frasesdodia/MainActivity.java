package com.kirin.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Não importa a cor do céu. Quem faz o dia bonito é você.",
                "Enquanto o dia semeia sonhos, a noite rega a esperança.",
                "Quanto mais agradecemos, mais coisas boas acontecem.",
                "Não coloque limites em seus sonhos, coloque fé.",
                "A vida me ensinou que chorar alivia, mas sorrir torna tudo mais bonito.",
                "As melhores coisas da vida não são coisas.",
                "Nem tudo na vida são flores, mas quando for, regue.",
                "Nada é em vão. Se não é bênção, é lição.",
                "Assim como a lua, a vida tem fases.",
                "Nunca desista daquilo que te faz sorrir.",
        };
        int numero = new Random().nextInt(10); // 0 1 2 3 4 5 6 7 8 9

        TextView texto = findViewById(R.id.TextResultado);
        texto.setText(frases[numero]);

    }

}