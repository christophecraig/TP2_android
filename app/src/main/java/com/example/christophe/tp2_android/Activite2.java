package com.example.christophe.tp2_android;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.app.SearchManager;

public class Activite2 extends Activity implements View.OnClickListener {
    private Button mButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        //mButton = (Button) findViewById(R.id.button);
        //mButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view == mButton) {

        }
    }

}
