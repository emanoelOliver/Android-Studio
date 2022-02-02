package com.kirin.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoGasolina;
    private TextInputEditText editPrecoAlcool;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoGasolina   = findViewById(R.id.editPrecoGasolina);
        editPrecoAlcool     = findViewById(R.id.editPrecoAlcool);

        textResultado       = findViewById(R.id.textResultado);


    }

    public void calcularPreco(View view){
        //Recuperar os valores digitados
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //Validar os campos digitados
       boolean camposValidados = validarCampos(precoAlcool, precoGasolina);

       if (camposValidados){

           //Convertendo String para números
           Double valorAlcool = Double.parseDouble(precoAlcool);
           Double valorGasolina = Double.parseDouble(precoGasolina);

           /* Fazer cálculo de menor preço
            * Se (valorAlcool / valorGasolina) >= 0.7 é melhor utilizar gasolina
            * Senão é melhor utilizar álcool
            */

           Double resultado = valorAlcool / valorGasolina;
           if ( resultado >= 0.7){
               textResultado.setText("Melhor utilizar Gasolina");
           }else {
               textResultado.setText("Melhor utilizar Alcool");
           }

       }else {
           textResultado.setText("Preencha os preços primeiro !");
       }
    }

    public Boolean validarCampos(String pAlcool, String pGasolina){
        boolean camposValidados = true;


        if(pAlcool == null || pAlcool.equals("")){
            camposValidados = false;

        }else if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;

        }

        return camposValidados;
    }

}