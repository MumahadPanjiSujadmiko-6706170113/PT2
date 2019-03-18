package com.example.android.miwok;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String [] judul = {"Latihan","Laporan","Alarm","Reset"};

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return judul[position];
    }

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new LatihanFragment();
        }else if (position == 1){
            return  new LaporanFragment();
        }else if (position == 2){
            return new AlarmFragment();
        }else{
            return new ResetFragment();
        }
    }

    @Override
    public int getCount() {
        return judul.length;
    }
}
