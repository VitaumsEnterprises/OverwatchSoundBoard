package com.pandelicia.soundboardow;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SupremosActivity extends AppCompatActivity {
    MediaPlayer mp = null;
    boolean longclicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supremos);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout_supremos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        AdView mAdView = (AdView) findViewById(R.id.adViewSupremos);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("50F23534EF96D55353404DBF602B64DC")
                .build();
        mAdView.loadAd(adRequest);

        //Ana
        ImageButton btn_ana = (ImageButton) findViewById(R.id.btn_sup_ana);
        btn_ana.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Ana/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Ana/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_ana, path + File.separator + ("Ana_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Ana/"+("Ana_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_ana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_ana);
                    mp.start();
                }
            }
        });
        //Bastion
        ImageButton btn_bastion = (ImageButton) findViewById(R.id.btn_sup_bastion);
        btn_bastion.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Bastion/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Bastion/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_bastion, path + File.separator + ("Bastion_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Bastion/"+("Bastion_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_bastion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_bastion);
                    mp.start();
                }
            }
        });
        //D.Va
        ImageButton btn_dva = (ImageButton) findViewById(R.id.btn_sup_dva);
        btn_dva.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Dva/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Dva/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_dva, path + File.separator + ("Dva_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Dva/"+("Dva_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_dva);
                    mp.start();
                }
            }
        });
        //Genji
        ImageButton btn_genji = (ImageButton) findViewById(R.id.btn_sup_genji);
        btn_genji.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Genji/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Genji/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_genji, path + File.separator + ("Genji_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Genji/"+("Genji_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_genji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_genji);
                    mp.start();
                }
            }
        });
        //Hanzo
        ImageButton btn_hanzo = (ImageButton) findViewById(R.id.btn_sup_hanzo);
        btn_hanzo.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Hanzo/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Hanzo/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_hanzo, path + File.separator + ("Hanzo_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Hanzo/"+("Hanzo_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_hanzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_hanzo);
                    mp.start();
                }
            }
        });
        //Junkrat
        ImageButton btn_junkrat = (ImageButton) findViewById(R.id.btn_sup_junkrat);
        btn_junkrat.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Junkrat/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Junkrat/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_junkrat, path + File.separator + ("Junkrat_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Junkrat/"+("Junkrat_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_junkrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_junkrat);
                    mp.start();
                }
            }
        });
        //Lúcio
        ImageButton btn_lucio = (ImageButton) findViewById(R.id.btn_sup_lucio);
        btn_lucio.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Lucio/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Lucio/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_lucio, path + File.separator + ("Lucio_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Lucio/"+("Lucio_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_lucio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_lucio);
                    mp.start();
                }
            }
        });
        //McCree
        ImageButton btn_mccree = (ImageButton) findViewById(R.id.btn_sup_mccree);
        btn_mccree.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/McCree/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/McCree/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_mccree, path + File.separator + ("McCree_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/McCree/"+("McCree_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_mccree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_mccree);
                    mp.start();
                }
            }
        });
        //Mei
        ImageButton btn_mei = (ImageButton) findViewById(R.id.btn_sup_mei);
        btn_mei.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Mei/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Mei/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_mei, path + File.separator + ("Mei_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Mei/"+("Mei_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_mei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_mei);
                    mp.start();
                }
            }
        });
        //Mercy
        ImageButton btn_mercy = (ImageButton) findViewById(R.id.btn_sup_mercy);
        btn_mercy.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Mercy/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Mercy/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_mercy, path + File.separator + ("Mercy_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Mercy/"+("Mercy_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_mercy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_mercy);
                    mp.start();
                }
            }
        });
        //Pharah
        ImageButton btn_pharah = (ImageButton) findViewById(R.id.btn_sup_pharah);
        btn_pharah.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Pharah/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Pharah/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_pharah, path + File.separator + ("Pharah_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Pharah/"+("Pharah_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_pharah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_pharah);
                    mp.start();
                }
            }
        });
        //Reaper
        ImageButton btn_reaper = (ImageButton) findViewById(R.id.btn_sup_reaper);
        btn_reaper.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Reaper/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Reaper/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_reaper, path + File.separator + ("Reaper_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Reaper/"+("Reaper_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_reaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_reaper);
                    mp.start();
                }
            }
        });
        //Reinhardt
        ImageButton btn_reinhardt = (ImageButton) findViewById(R.id.btn_sup_reinhardt);
        btn_reinhardt.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Reinhardt/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Reinhardt/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_reinhardt, path + File.separator + ("Reinhardt_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Reinhardt/"+("Reinhardt_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_reinhardt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_reinhardt);
                    mp.start();
                }
            }
        });
        //Roadhog
        ImageButton btn_roadhog = (ImageButton) findViewById(R.id.btn_sup_roadhog);
        btn_roadhog.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Roadhog/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Roadhog/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_roadhog, path + File.separator + ("Roadhog_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Roadhog/"+("Roadhog_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_roadhog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_roadhog);
                    mp.start();
                }
            }
        });
        //Soldier 76
        ImageButton btn_soldier = (ImageButton) findViewById(R.id.btn_sup_soldier);
        btn_soldier.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Soldado76/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Soldado76/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_soldado, path + File.separator + ("Soldado76_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Soldado76/"+("Soldado76_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_soldier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_soldado);
                    mp.start();
                }
            }
        });
        //Symetra
        ImageButton btn_symetra = (ImageButton) findViewById(R.id.btn_sup_symetra);
        btn_symetra.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Symmetra/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Symmetra/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_symetra, path + File.separator + ("Symmetra_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Symmetra/"+("Symmetra_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_symetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_symetra);
                    mp.start();
                }
            }
        });
        //Torbjorn
        ImageButton btn_torbjorn = (ImageButton) findViewById(R.id.btn_sup_torbjorn);
        btn_torbjorn.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Torbjorn/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Torbjorn/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_torbjorn, path + File.separator + ("Torbjorn_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Torbjorn/"+("Torbjorn_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_torbjorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_torbjorn);
                    mp.start();
                }
            }
        });
        //Tracer
        ImageButton btn_tracer = (ImageButton) findViewById(R.id.btn_sup_tracer);
        btn_tracer.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Tracer/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Tracer/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_tracer, path + File.separator + ("Tracer_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Tracer/"+("Tracer_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_tracer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_tracer);
                    mp.start();
                }
            }
        });
        //Widowmaker
        ImageButton btn_widow = (ImageButton) findViewById(R.id.btn_sup_widow);
        btn_widow.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Widow/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Widow/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_widow, path + File.separator + ("Widow_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Widow/"+("Widow_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_widow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_widow);
                    mp.start();
                }
            }
        });
        //Winston
        ImageButton btn_winston = (ImageButton) findViewById(R.id.btn_sup_winston);
        btn_winston.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Winston/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Winston/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_winston, path + File.separator + ("Winston_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Winston/"+("Winston_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_winston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_winston);
                    mp.start();
                }
            }
        });
        //Zarya
        ImageButton btn_zarya= (ImageButton) findViewById(R.id.btn_sup_zarya);
        btn_zarya.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Zarya/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Zarya/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_zarya, path + File.separator + ("Zarya_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Zarya/"+("Zarya_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_zarya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_zarya);
                    mp.start();
                }
            }
        });
        //Zenyatta
        ImageButton btn_zenyatta = (ImageButton) findViewById(R.id.btn_sup_zenyatta);
        btn_zenyatta.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Zenyatta/");
                if(!folder.exists()) {
                    folder.mkdirs();
                }
                String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Zenyatta/";
                File dir = new File(path);
                try {
                    if (dir.mkdirs() || dir.isDirectory()) {
                        CopyRAWtoSDCard(R.raw.ult_zenyatta, path + File.separator + ("Zenyatta_Ult.mp3"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("audio/mp3");
                shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                        +"/SonsOverwatch/Zenyatta/"+("Zenyatta_Ult.mp3")));
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

                longclicked=true;
                return false;
            }
        });
        btn_zenyatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(longclicked) {
                    longclicked=false;
                }else{
                    stopPlayng();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ult_zenyatta);
                    mp.start();
                }
            }
        });

    }
    private void stopPlayng(){
        if (mp!=null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    private void CopyRAWtoSDCard(int id, String path) throws IOException {
        InputStream in = getResources().openRawResource(id);
        FileOutputStream out = new FileOutputStream(path);
        byte[] buff = new byte[1024];
        int read;

        try {
            while ((read = in.read(buff)) > 0) {
                out.write(buff, 0, read);
            }
        } finally {
            in.close();
            out.close();
        }
    }
}
