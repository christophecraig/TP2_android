package com.example.christophe.tp2_android;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
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
        final int act1ID = 1;
        final EditText textchampsaisie = (EditText) findViewById(R.id.text);
        Button btaction = (Button) findViewById(R.id.btecrire);
        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent defineIntent = new Intent(lecontext, Activite2.class);
                Bundle objetbundle = new Bundle();
                objetbundle.putString("passInfo", textchampsaisie.getText().toString());
                defineIntent.putExtras(objetbundle);
                lecontext.startActivityForResult(defineIntent, act1ID);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("LE DATA ------", data.getExtras().toString());
        super.onActivityResult(requestCode, resultCode, data);
        EditText textReturned = (EditText) findViewById(R.id.text);
        textReturned.setText(data.getStringExtra("leData"));
    }
}

