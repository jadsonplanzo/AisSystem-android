package com.example.rodrigo.aissystem40;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rodrigo.aissystem40.R;


/**
 * Created by Rodrigo on 05/11/2015.
 */
public class Tela_Esqueceu extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_esqueceu);

        final EditText idres = (EditText) findViewById(R.id.login);
        final EditText email = (EditText) findViewById(R.id.senha);
        Button enviar = (Button) findViewById(R.id.enviar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tela_Esqueceu.this, "EMAIL ENVIADO COM SUCESSO", Toast.LENGTH_SHORT).show();

            }

        });
    }
}

