package com.nevesfg.projetos.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityMenos extends AppCompatActivity {

    EditText edtOne, edtTwo;

    TextView edtTextView3;
    Button edtSubtrair, edtBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menos);

        edtOne = findViewById(R.id.textOneSub);
        edtTwo = findViewById(R.id.textTwoSub);

        edtTextView3 = findViewById(R.id.textView3);

        edtSubtrair = findViewById(R.id.btnMenos);
        edtBack = findViewById(R.id.backbutton);

        edtSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Criar variavel string e armazenar o texto convertido para string nela
                String valor1 = edtOne.getText().toString();
                String valor2 = edtTwo.getText().toString();

//                converter o texto adicionado na variavel e transformar em inteiro
                int number = Integer.parseInt(valor1);
                int number2 = Integer.parseInt(valor2);

                int resultado = number - number2;


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
                Intent redirecionar = new Intent(activityMenos.this,  MainActivity.class );
                startActivity(redirecionar);
            }
        });
    }
}