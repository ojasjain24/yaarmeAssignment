package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homePage=new HomeFragment();
                return homePage;

            case 1:
                AboutFragment aboutFragment=new AboutFragment();
                return aboutFragment;

            case 2:
                JobsFragment jobsFragment=new JobsFragment();
                return jobsFragment;

            case 3:
                PeopleFragment peopleFragment=new PeopleFragment();
                return peopleFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "home";
            case 1:
                return "about";
            case 2:
                return "jobs";
            case 3:
                return "people";
            default:
                return null;
        }
    }

}
