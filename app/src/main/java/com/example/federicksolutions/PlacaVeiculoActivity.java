package com.example.federicksolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlacaVeiculoActivity extends AppCompatActivity {

    private EditText txtPlacaVeiculo;
    private Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placa_veiculo);

        txtPlacaVeiculo = (EditText) findViewById(R.id.txtPlacaVeiculo);
        btOk = (Button) findViewById(R.id.btOk);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String PlacaVeiculo = txtPlacaVeiculo.getText().toString();

                if(!PlacaVeiculo.equals("")){
                    if(!PlacaVeiculo.equals("ejp0105")){
                        Toast.makeText(PlacaVeiculoActivity.this, "Veículo Encontrado!!", Toast.LENGTH_LONG).show();


                    }else{
                        Toast.makeText(PlacaVeiculoActivity.this, "Veículo Não Encontrado!!", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
    public void TelaMenu(View view){
        setContentView(R.layout.activity_menu);
    }
}
