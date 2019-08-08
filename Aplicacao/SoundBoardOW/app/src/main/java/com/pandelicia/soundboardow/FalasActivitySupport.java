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

public class FalasActivitySupport extends AppCompatActivity {

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
        viewPager.setAdapter(new AdapterSupport(fragmentManager));
    }
}
class AdapterSupport extends FragmentStatePagerAdapter {

    public AdapterSupport(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int p) {
        Fragment fragment = null;
        if(p==0){
            fragment = new FalasAnaFragment();
        }
        if(p==1){
            fragment = new FalasLucioFragment();
        }
        if(p==2){
            fragment = new FalasMercyFragment();
        }
        if(p==3){
            fragment = new FalasSymetraFragment();
        }
        if(p==4){
            fragment = new FalasZenyattaFragment();
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
            return "Ana";
        }
        if(position==1){
            return "Lúcio";
        }
        if(position==2){
            return "Mercy";
        }
        if(position==3){
            return "Symmetra";
        }
        if(position==4){
            return "Zenyatta";
        }
        return null;
    }
}

