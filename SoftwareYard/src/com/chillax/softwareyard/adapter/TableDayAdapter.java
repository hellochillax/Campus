package com.chillax.softwareyard.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chillax.softwareyard.fragment.TableItemFragment;

import java.util.ArrayList;
import java.util.List;

public class TableDayAdapter extends FragmentPagerAdapter {

    private String[] days = new String[]{"星期一", "星期二", "星期三", "星期四", "星期五",
            "星期六", "星期日"};
    private List<TableItemFragment> fraglist;

    public TableDayAdapter(FragmentManager fm, Context context) {
        super(fm);
        fraglist = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            TableItemFragment bf = new TableItemFragment(context, i);
            fraglist.add(bf);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return days[position];
    }

    @Override
    public Fragment getItem(int arg0) {
        return fraglist.get(arg0);
    }

    @Override
    public int getCount() {
        return days.length;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data, int index) {
        fraglist.get(index).onActivityResult(requestCode, resultCode, data);
    }

    public void refresh() {
        for (TableItemFragment tf : fraglist) {
			tf.refrush();
        }
    }
}