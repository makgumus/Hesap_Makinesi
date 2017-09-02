package com.example.mmakg.hesap_makinesi;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, ViewPager.OnPageChangeListener, TabLayout.OnTabSelectedListener {

    private SwipeRefreshLayout swipeRefreshLayout = null;
    private TabLayout tabLayout = null;
    private ViewPager vpFragments = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        vpFragments = (ViewPager) findViewById(R.id.viewPager);
        initEvent();
    }

    private void initEvent() {
        swipeRefreshLayout.setOnRefreshListener(this);
        tabLayout.setupWithViewPager(vpFragments);
        tabLayout.addOnTabSelectedListener(this);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        DecimalCalculateFragment decimalCalculateFragment = new DecimalCalculateFragment();
        HexadecimalCalculateFragment hexadecimalCalculateFragment = new HexadecimalCalculateFragment();
        viewPagerAdapter.addFragment(decimalCalculateFragment, "Standart Hesap");
        viewPagerAdapter.addFragment(hexadecimalCalculateFragment, "Hexadecimal Hesap");

        vpFragments.setAdapter(viewPagerAdapter);
        vpFragments.addOnPageChangeListener(this);
        vpFragments.setCurrentItem(0);
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}