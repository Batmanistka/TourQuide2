package com.example.android.tourquide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new NatureFragment();
        } else if (position == 2) {
            return new OthersFragment();
        } else {
            return new FoodFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.monumentsCategory);
        } else if (position == 1) {
            return mContext.getString(R.string.natureCategory);
        } else if (position == 2) {
            return mContext.getString(R.string.otherCategory);
        } else {
            return mContext.getString(R.string.foodCategory);
        }
    }
}