package net.tecgurus.mobilepos.controllers.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import net.tecgurus.mobilepos.R;


public class ClientesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        final EditText editTextBuscar = findViewById(R.id.edtBuscar);
        final ListView ListviewClientes= findViewById(R.id.lstvClientes);
        final Button btnSearch= findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                final String search= editTextBuscar.getText().toString().trim();

                if (search.compareTo("")==0){
                    return;
                }



            }
        });


    }

}
