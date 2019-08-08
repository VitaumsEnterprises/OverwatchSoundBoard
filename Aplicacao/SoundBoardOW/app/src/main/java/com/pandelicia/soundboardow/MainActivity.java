package com.pandelicia.soundboardow;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File folder = new File(Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/");
        DeleteRecursive(folder);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("50F23534EF96D55353404DBF602B64DC")
                .build();
        mAdView.loadAd(adRequest);

        //Atividade FalasChooseActivity
        final Intent intent_falas = new Intent(MainActivity.this, FalasChooseActivity.class);
        final ImageButton btn_falas = (ImageButton) findViewById(R.id.button_falas);
        btn_falas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(intent_falas);
            }
        });
        //Atividade SupremosActivity
        final Intent intent_supremos = new Intent(MainActivity.this, SupremosActivity.class);
        final ImageButton btn_supremos = (ImageButton) findViewById(R.id.button_supremos);
        btn_supremos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(intent_supremos);
            }
        });
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "fsdfsd", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    */
    public static void DeleteRecursive(File file)
    {
        if (file.isDirectory())
        {
            for (File child : file.listFiles())
            {
                DeleteRecursive(child);
            }
        }
        file.delete();
    }
}