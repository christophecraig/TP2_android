package com.example.christophe.tp2_android;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.app.SearchManager;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button mButton;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        if(view == mButton){

     /* Nous sommes maintenant sûr que la vue ayant été cliquée est le bouton
     * de notre interface. Il suffit donc de créer un nouvel Intent pour démarrer
     * la seconde activité.
     */
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,"iPhone XR" ); // query contains search string
            startActivity(intent);
        }
    }
}

