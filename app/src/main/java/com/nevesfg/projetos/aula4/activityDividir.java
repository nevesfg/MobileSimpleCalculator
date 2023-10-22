package com.nevesfg.projetos.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityDividir extends AppCompatActivity {



    EditText edtOneDiv, edtTwoDiv;

    TextView edtTextView3;
    Button edtDividir, edtBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        edtOneDiv = findViewById(R.id.textOneDiv);
        edtTwoDiv = findViewById(R.id.textTwoDiv);

        edtTextView3 = findViewById(R.id.textView3);

        edtDividir = findViewById(R.id.btnDivisao);
        edtBack = findViewById(R.id.backbutton);

        edtDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Criar variavel string e armazenar o texto convertido para string nela
                String valor1 = edtOneDiv.getText().toString();
                String valor2 = edtTwoDiv.getText().toString();

//                converter o texto adicionado na variavel e transformar em inteiro
                float number = Integer.parseInt(valor1);
                float number2 = Integer.parseInt(valor2);

                float resultado = (number / number2);


//                Acao de click como notificação popup
//                Toast.makeText(activitySoma.this, resultado , Toast.LENGTH_SHORT).show();
                edtTextView3.setText(String.valueOf("Resultado: " + resultado));

//                Intent redirecionar = new Intent(MainActivity.this, activitySoma.class);
//                startActivity(redirecionar);
            }
        });

        edtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirecionar = new Intent(activityDividir.this,  MainActivity.class );
                startActivity(redirecionar);
            }
        });
    }
}