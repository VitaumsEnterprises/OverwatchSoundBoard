package com.pandelicia.soundboardow;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.ImageButton;


/**
 * Created by Vitor on 18/09/2016.
 */
public class FalasChooseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_falas);
        //SupportActionBar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout_falas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Intent OFENSIVO
        final Intent intent_falas_offense = new Intent(FalasChooseActivity.this, com.pandelicia.soundboardow.FalasActivityOffense.class);
        ImageButton btn_offense = (ImageButton) findViewById(R.id.ibOffensive);
        btn_offense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FalasChooseActivity.this.startActivity(intent_falas_offense);
            }
        });
        //Intent DEFENSIVO
        final Intent intent_falas_defense = new Intent(FalasChooseActivity.this, com.pandelicia.soundboardow.FalasActivityDefense.class);
        ImageButton btn_defense = (ImageButton) findViewById(R.id.ibDefensive);
        btn_defense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FalasChooseActivity.this.startActivity(intent_falas_defense);
            }
        });
        //Intent TANQUE
        final Intent intent_falas_tank = new Intent(FalasChooseActivity.this, com.pandelicia.soundboardow.FalasActivityTank.class);
        ImageButton btn_tank = (ImageButton) findViewById(R.id.ibTank);
        btn_tank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FalasChooseActivity.this.startActivity(intent_falas_tank);
            }
        });
        //Intent SUPORTE
        final Intent intent_falas_support = new Intent(FalasChooseActivity.this, com.pandelicia.soundboardow.FalasActivitySupport.class);
        ImageButton btn_support = (ImageButton) findViewById(R.id.ibSupport);
        btn_support.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FalasChooseActivity.this.startActivity(intent_falas_support);
            }
        });

    }
}
