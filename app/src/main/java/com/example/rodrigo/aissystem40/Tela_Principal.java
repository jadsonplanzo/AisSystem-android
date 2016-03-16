package com.example.rodrigo.aissystem40;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rodrigo.aissystem40.R;



public class Tela_Principal  extends Activity {

    Button freq, obs, bole, sair;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tela_principal);

        freq = (Button) findViewById(R.id.freq);
        obs = (Button) findViewById(R.id.obs);
        bole = (Button) findViewById(R.id.bole);
        sair = (Button) findViewById(R.id.sair);


        freq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TrocaTela = new Intent(Tela_Principal.this, Tela_Freq.class);
                startActivity(TrocaTela);

                Toast.makeText(Tela_Principal.this, "Frequencia", Toast.LENGTH_SHORT).show();

                //setContentView(R.layout.tela_principal);

            }


        });

        obs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TrocaTela = new Intent(Tela_Principal.this, com.example.rodrigo.aissystem40.Tela_Observacoes.class);
                startActivity(TrocaTela);

                Toast.makeText(Tela_Principal.this, "Observações", Toast.LENGTH_SHORT).show();

            }
        });

        bole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TrocaTela = new Intent(Tela_Principal.this, Tela_Boletim.class);
                startActivity(TrocaTela);
                Toast.makeText(Tela_Principal.this, "Boletim", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
