package com.example.rodrigo.aissystem40;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.net.Uri;

import com.example.rodrigo.aissystem40.R;

/**
 * Created by Rodrigo on 05/11/2015.
 */
public class Tela_Observacoes extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_observacoes);



        Button atendimento = (Button) findViewById(R.id.atendimento);
        atendimento.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Uri uri = Uri.parse("tel: 71988897294");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);

            }
        });

    }
}
