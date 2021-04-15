package com.example.toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class FragmentActivity extends AppCompatActivity {
private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        setSupportActionBar(toolbar);

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//toolbar.setTitle("WhatsApp");
        initWidgets();

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        setViewPager();
        setTabLayout();

    }

    private void initWidgets() {
        viewPager=findViewById(R.id.ViewPage);
        tabLayout=findViewById(R.id.TabLayout);
        toolbar=findViewById(R.id.toolbar_F);
        Fragment1 fragment1=new Fragment1();
    }

    private void setTabLayout() {
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(Color.BLUE,Color.GREEN);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setViewPager() {
        viewPager.setAdapter(viewPagerAdapter);
    }

}