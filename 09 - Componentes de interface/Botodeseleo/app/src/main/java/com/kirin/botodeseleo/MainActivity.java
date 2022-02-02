package com.kirin.botodeseleo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    //CheckBox
    private CheckBox boxVerde;
    private CheckBox boxBranco;
    private CheckBox boxVermelho;

    //RadioButton
    private RadioButton sexoMasculino;
    private RadioButton sexoFeminino;

    private RadioGroup opcaoSexo;

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

        //RadioButton
        sexoMasculino   = findViewById(R.id.radioButtonMasculino);
        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        opcaoSexo       = findViewById(R.id.radioGroupSexo);

        radiobutton();
    }

    public void radiobutton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButtonMasculino){
                textoResultado.setText("Masculino");
                } else if (checkedId == R.id.radioButtonFeminino){
                    textoResultado.setText("Feminino");
                }
            }
        });

        /*
        if (sexoMasculino.isChecked()){
            textoResultado.setText("Masculino");
        }else if (sexoFeminino.isChecked()){
            textoResultado.setText("Feminino");
        }
         */
    }

    public void enviar (View view){

        //radiobutton();
        //checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText("nome: " + nome + "Email: " + email + "Cor: " + verde + "Cor: " + branco + "Cor: " + vermelho );
         */
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

    public void limpar (View view){
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");

    }



}