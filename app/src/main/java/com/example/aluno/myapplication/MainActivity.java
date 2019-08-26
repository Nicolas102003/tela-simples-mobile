package com.example.aluno.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnQueAbreTelaComLinearLayoutVertical;
    private Button btnQueAbreTelaComLinearLayoutHorizontal;
    private Button btnQueAbreTelaPassandoDadosPraEla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQueAbreTelaComLinearLayoutVertical = (Button) findViewById(R.id.btnAbreLinearLayoutVertcal);
        btnQueAbreTelaComLinearLayoutHorizontal = (Button) findViewById(R.id.btnAbreLinearLayoutHorizontal);

        btnQueAbreTelaPassandoDadosPraEla = (Button) findViewById(R.id.btnQueAbreTelaPassandoDadosPraEla);

        btnQueAbreTelaComLinearLayoutVertical.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaComLinearLayoutVertical.class);
                startActivity(intent);
            }
        });
        btnQueAbreTelaComLinearLayoutHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaComLinearLayoutHorizontal.class);
                startActivity(intent);
            }
        });

        btnQueAbreTelaPassandoDadosPraEla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
                Toast.makeText(MainActivity.this, "Vamos passar pra outra activity : " + editTextNome.getText(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, TelaRecebeDados.class);
                intent.putExtra("nome", editTextNome.getText().toString());
                startActivity(intent);
            }
        });


    }

 }

