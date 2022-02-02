package com.kirin.caixadeseleo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox boxVerde;
    private CheckBox boxBranco;
    private CheckBox boxVermelho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoResultado  = findViewById(R.id.textResultado);

        //CheckBox
        boxVerde        = findViewById(R.id.checkVerde);
        boxBranco       = findViewById(R.id.checkBranco);
        boxVermelho     = findViewById(R.id.checkVermelho);

    }

    public void checkbox (){

        String texto = "";
       if (boxVerde.isChecked()){
           //String corSelecionada = boxVerde.getText().toString();
           //texto = corSelecionada;
           texto = "Verde selecionado - ";
        }

        if (boxBranco.isChecked()){
            //String corSelecionada = boxBranco.getText().toString();
            //texto =  texto  + corSelecionada;
           texto = texto + "Branco selecionado - ";
        }

        if (boxVermelho.isChecked()){
            //String corSelecionada = boxVermelho.getText().toString();
            //texto =  texto  + corSelecionada;
            texto = texto + "Vermelho selecionado - ";
        }
       textoResultado.setText(texto);

    }

    public void enviar (View view){

        checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText("nome: " + nome + "Email: " + email + "Cor: " + verde + "Cor: " + branco + "Cor: " + vermelho );
         */
    }

    public void limpar (View view){
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");

    }



}