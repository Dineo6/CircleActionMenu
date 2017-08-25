package com.example.codetribe.circleactionmenu;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class TabActivity extends AppCompatActivity
{
    private  static final String TAG = "TabActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    private String category_selected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        Log.d(TAG,"onCreate : Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        //Set up the viewPager with the section adapter
        mViewPager = (ViewPager)findViewById(R.id.container);
        setViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        Intent intent = getIntent();
        category_selected = intent.getStringExtra(MainActivity.CATEGORY_SELECTED);
        setTitle(category_selected);

    }

    private void setViewPager(ViewPager viewPager)
    {
      SectionsPageAdapter mAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mAdapter.addFragment(new Guest_houseFragment(),"GuestHouse");
        mAdapter.addFragment(new Hotel_Fragment(),"Hotel");
        mAdapter.addFragment(new Motel_Fragment(),"Motel");
        mAdapter.addFragment(new BB_Fragment(),"B&B");
        viewPager.setAdapter(mAdapter);
    }



}
