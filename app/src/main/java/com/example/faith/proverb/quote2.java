package com.example.faith.proverb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by faith on 4/2/2015.
 */
public class quote2 extends ActionBarActivity {
    Button button;
    final Context next = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote2);
        //button//
        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(next, quote2.class);
                startActivity(nextPage);
            }
        });

    }
}