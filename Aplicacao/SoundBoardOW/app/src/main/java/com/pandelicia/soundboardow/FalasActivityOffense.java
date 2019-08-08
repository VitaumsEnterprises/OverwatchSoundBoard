package com.pandelicia.soundboardow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class FalasActivityOffense extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falas);
        //SupportActionBar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout_falas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AdView mAdView = (AdView) findViewById(R.id.adViewFalas);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("50F23534EF96D55353404DBF602B64DC")
                .build();
        mAdView.loadAd(adRequest);

        viewPager = (ViewPager) findViewById(R.id.pager_falas);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new AdapterOffense(fragmentManager));
    }

}

class AdapterOffense extends FragmentStatePagerAdapter {

    public AdapterOffense(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int p) {
        Fragment fragment = null;
        if(p==0){
            fragment = new FalasGenjiFragment();
        }
        if(p==1){
            fragment = new FalasMcCreeFragment();
        }
        if(p==2){
            fragment = new FalasPharahFragment();
        }
        if(p==3){
            fragment = new FalasReaperFragment();
        }
        if(p==4){
            fragment = new FalasSoldierFragment();
        }
        if(p==5){
            fragment = new FalasTracerFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Genji";
        }
        if(position==1){
            return "McCree";
        }
        if(position==2){
            return "Pharah";
        }
        if(position==3){
            return "Reaper";
        }
        if(position==4){
            return "Soldado:76";
        }
        if(position==5){
            return "Tracer";
        }
        return null;
    }
}