package com.anway.reformed_tab_layout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int noOfAdapters;

    public PagerAdapter(FragmentManager fm, int numAdapters) {
        super(fm);
        this.noOfAdapters = numAdapters;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                personal personal = new personal();
                return personal;
            case 1:
                contact contact = new contact();
                return contact;
            case 2:
                payment payment = new payment();
                return payment;
            case 3:
                social social = new social();
                return social;
            case 4:
                account account = new account();
                return account;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfAdapters;
    }
}
