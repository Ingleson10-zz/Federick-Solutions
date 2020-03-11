package com.example.federicksolutions;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.zip.DataFormatException;

public class MenuActivity extends AppCompatActivity {

    private EditText Destino;
    private EditText DataInicio;
    private EditText PlacaVeiculo;
    private EditText CPF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Destino = findViewById(R.id.txtDestino);
        DataInicio = findViewById(R.id.txtDataInicio);
        PlacaVeiculo = findViewById(R.id.txtPlacaVeiculo2);
        CPF = findViewById(R.id.txtCPFMotorista);



        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    public void Salvar(View view){

        Viajens viajens = new Viajens();

        viajens.setDestino(Destino.getText().toString());
        viajens.setPlacaVeiculo(PlacaVeiculo.getText().toString());
        viajens.setCPF(CPF.getText().toString());



    }

}
