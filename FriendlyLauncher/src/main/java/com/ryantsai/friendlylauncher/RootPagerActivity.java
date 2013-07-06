package com.ryantsai.friendlylauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by ryantsai on 7/6/13.
 */
public class RootPagerActivity extends FragmentActivity {
    private ViewPager mViewPager;
    private static int mPageCount = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);

        FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int i) {
                return RootFragment.newInstance(i);
            }

            @Override
            public int getCount() {
                return mPageCount;
            }
        });

        mViewPager.setCurrentItem(mPageCount / 2);
    }
}
