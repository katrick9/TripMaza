package com.example.krishna.tripmaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.krishna.tripmaza.R.id.places;

public class PackagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);


        TextView four = (TextView) findViewById(R.id.onet);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourIt = new Intent(PackagesActivity.this,CheakoutActivity.class);
                startActivity(fourIt);
            }
        });

        ImageView fourI = (ImageView) findViewById(R.id.onei);
        fourI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourIi = new Intent(PackagesActivity.this,CheakoutActivity.class);
                startActivity(fourIi);
            }
        });

        TextView seven = (TextView) findViewById(R.id.twot);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sevenIt = new Intent(PackagesActivity.this,CheakoutActivity.class);
                startActivity(sevenIt);
            }
        });

        ImageView sevenT = (ImageView) findViewById(R.id.twoi);
        sevenT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sevenIi = new Intent(PackagesActivity.this,CheakoutActivity.class);
                startActivity(sevenIi);
            }
        });

        TextView nine = (TextView) findViewById(R.id.threet);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nineIt = new Intent(PackagesActivity.this,CheakoutActivity.class);
                startActivity(nineIt);
            }
        });

        ImageView nineI = (ImageView) findViewById(R.id.threei);
        nineI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nineIi = new Intent(PackagesActivity.this,CheakoutActivity.class);
                startActivity(nineIi);
            }
        });

    }
}
