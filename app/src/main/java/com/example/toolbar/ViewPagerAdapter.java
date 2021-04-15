package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
      //  Fragment fragment=null;
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
              return new Fragment2();
            case 2:
               return new Fragment3();
        }
        return new Fragment1();
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        String title=null;
        if(position==0){
            title="Fragment 1";
        }
        if(position==1){
            title="Fragment 2";
        }
        if(position==2){
            title="Fragment 3";
        }
        return title;
    }
}
