package com.example.rodrigo.aissystem40;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.rodrigo.aissystem40.R;



public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_login);

        final EditText login = (EditText) findViewById(R.id.login);
        final EditText senha = (EditText) findViewById(R.id.senha);
        Button entrar = (Button) findViewById(R.id.entrar);
        Button esqueceu = (Button) findViewById(R.id.esqueceu);
        Button site = (Button) findViewById(R.id.site);


        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://aissytem.com.br");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);

                startActivity(it);
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logincerto = "jadson";
                String senhacerto = "1234";

                String strlogin = login.getText().toString();
                String strsenha = senha.getText().toString();

                if (strlogin.equals(logincerto) && strsenha.equals(senhacerto)) {
                    Intent TrocaTela = new Intent(LoginActivity.this, Tela_Principal.class);
                    startActivity(TrocaTela);

                    //Toast.makeText(LoginActivity.this, "login com sucesso", Toast.LENGTH_SHORT).show();
                    //setContentView(R.layout.tela_principal);
                } else {
                    Toast.makeText(LoginActivity.this, "login incorreto", Toast.LENGTH_SHORT).show();
                }
            }


        });
        esqueceu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TrocaTela = new Intent(LoginActivity.this, Tela_Esqueceu.class);
                Toast.makeText(LoginActivity.this, "Esqueceu senha", Toast.LENGTH_SHORT).show();
                startActivity(TrocaTela);
            }
        });
    }
}