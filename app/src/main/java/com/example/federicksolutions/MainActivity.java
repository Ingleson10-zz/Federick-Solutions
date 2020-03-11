package com.example.federicksolutions;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNomeMotorista;
    private EditText txtSenha;
    private Button btEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNomeMotorista = (EditText) findViewById(R.id.txtNomeMotorista);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btEntrar = (Button) findViewById(R.id.btEntrar);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String Motorista = txtNomeMotorista.getText().toString();
                String Senha = txtSenha.getText().toString();

                if (!Motorista.equals("") && !Senha.equals("")) {
                    if (!Motorista.equals("erik") && !Senha.equals("1234")) {
                        if(!Motorista.isEmpty()){
                            if(!Senha.isEmpty()){

                            }else {
                                Toast.makeText(MainActivity.this, "Preencha o Campo Senha", Toast.LENGTH_SHORT).show();
                            }

                        }else {
                            Toast.makeText(MainActivity.this, "Preecha o Campo Motorista", Toast.LENGTH_SHORT).show();
                        }

                    } else {
                        Toast.makeText(MainActivity.this, "Login Efetuado com Sucesso!!!", Toast.LENGTH_SHORT).show();
                    }


                } else {
                    Toast.makeText(MainActivity.this, "Login Não Encontrado", Toast.LENGTH_SHORT).show();
                }
                setContentView(R.layout.activity_placa_veiculo);
            }

        });
    }
}

