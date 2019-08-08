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

public class FalasActivityTank extends AppCompatActivity {

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
        viewPager.setAdapter(new AdapterTank(fragmentManager));
    }
}


class AdapterTank extends FragmentStatePagerAdapter {

    public AdapterTank(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int p) {
        Fragment fragment = null;
        if(p==0){
            fragment = new FalasDvaFragment();
        }
        if(p==1){
            fragment = new FalasReinhardtFragment();
        }
        if(p==2){
            fragment = new FalasRoadhogFragment();
        }
        if(p==3){
            fragment = new FalasWinstonFragment();
        }
        if(p==4){
            fragment = new FalasZaryaFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "D.Va";
        }
        if(position==1){
            return "Reinhardt";
        }
        if(position==2){
            return "Roadhog";
        }
        if(position==3){
            return "Winston";
        }
        if(position==4){
            return "Zarya";
        }
        return null;
    }
}