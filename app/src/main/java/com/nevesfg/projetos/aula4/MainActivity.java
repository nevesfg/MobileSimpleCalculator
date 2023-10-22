package com.nevesfg.projetos.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button initMulti, initMais, initMenos, initDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMais = findViewById(R.id.btnMais);
        initMenos = findViewById(R.id.btnMenos);
        initDividir = findViewById(R.id.btnDividir);
        initMulti = findViewById(R.id.btnMultiplicando);

        initMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Acao de click
//                Toast.makeText(MainActivity.this, edtEmail.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent redirecionar = new Intent(MainActivity.this, activitySoma.class);
                startActivity(redirecionar);
            }
        });

        initMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Acao de click
//                Toast.makeText(MainActivity.this, edtEmail.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent redirecionar = new Intent(MainActivity.this, activityMenos.class);
                startActivity(redirecionar);
            }
        });

        initMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Acao de click
//                Toast.makeText(MainActivity.this, edtEmail.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent redirecionar = new Intent(MainActivity.this, activityMultiplicar.class);
                startActivity(redirecionar);
            }
        });

        initDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Acao de click
//                Toast.makeText(MainActivity.this, edtEmail.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent redirecionar = new Intent(MainActivity.this, activityDividir.class);
                startActivity(redirecionar);
            }
        });



    }
}