package edu.western.cs.starfinder_character_sheet.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import edu.western.cs.starfinder_character_sheet.Fragments.SkillFragment;

public class SwipeAdapter extends FragmentPagerAdapter{
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment skillFragment = new SkillFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("count",i+1);
        skillFragment.setArguments(bundle);
        return skillFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
