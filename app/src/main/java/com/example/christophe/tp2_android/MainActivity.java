package com.example.christophe.tp2_android;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.app.SearchManager;
import android.widget.EditText;

public class MainActivity extends Activity {

    Activity lecontext;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lecontext = this;
        final EditText textchampsaisie = (EditText) findViewById(R.id.text);
        Button btaction = (Button) findViewById(R.id.btecrire);
        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent defineIntent = new Intent(lecontext, Activite2.class);
                Bundle objetbundle = new Bundle();
                objetbundle.putString("passInfo", textchampsaisie.getText().toString());
                defineIntent.putExtras(objetbundle);
                lecontext.startActivity(defineIntent);
            }
        });
    }
}

