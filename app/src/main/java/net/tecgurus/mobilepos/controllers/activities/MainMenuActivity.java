package net.tecgurus.mobilepos.controllers.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;

import net.tecgurus.mobilepos.R;


public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final Button btnClientes= findViewById(R.id.btnClientes);
        final Button btnConsultaPedidos=findViewById(R.id.btnConsultaPedidos);
        final Button btnConsultaFacturas= findViewById(R.id.btnConsultaFacturas);

        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnConsultaPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnConsultaFacturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


            }
        }



