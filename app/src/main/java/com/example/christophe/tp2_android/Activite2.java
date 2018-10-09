package com.example.christophe.tp2_android;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.app.SearchManager;

public class Activite2 extends Activity implements View.OnClickListener {

    Activity lecontext;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        lecontext = this;
        lecontext.setTitle("fenetre 2");
        final EditText textchampsaisie = (EditText) findViewById(R.id.text);
        Bundle objetbundle = this.getIntent().getExtras();
        String InfoPasse = objetbundle.getString("passInfo");
        textchampsaisie.setText(InfoPasse);
    }

    public void onClick(View view) {

    }

}
