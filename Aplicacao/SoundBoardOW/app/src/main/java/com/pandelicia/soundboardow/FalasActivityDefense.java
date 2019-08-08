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

public class FalasActivityDefense extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falas);
        //SupportActionBar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout_falas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //NavigationDrawer

        AdView mAdView = (AdView) findViewById(R.id.adViewFalas);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("50F23534EF96D55353404DBF602B64DC")
                .build();
        mAdView.loadAd(adRequest);

        viewPager = (ViewPager) findViewById(R.id.pager_falas);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new AdapterDefense(fragmentManager));
    }
}

class AdapterDefense extends FragmentStatePagerAdapter {

    public AdapterDefense(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int p) {
        Fragment fragment = null;
        if(p==0){
            fragment = new FalasBastionFragment();
        }
        if(p==1){
            fragment = new FalasHanzoFragment();
        }
        if(p==2){
            fragment = new FalasJunkratFragment();
        }
        if(p==3){
            fragment = new FalasMeiFragment();
        }
        if(p==4){
            fragment = new FalasTorbjornFragment();
        }
        if(p==5){
            fragment = new FalasWidowFragment();
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
            return "Bastion";
        }
        if(position==1){
            return "Hanzo";
        }
        if(position==2){
            return "Junkrat";
        }
        if(position==3){
            return "Mei";
        }
        if(position==4){
            return "Torbjörn";
        }
        if(position==5){
            return "Widowmaker";
        }
        return null;
    }
}