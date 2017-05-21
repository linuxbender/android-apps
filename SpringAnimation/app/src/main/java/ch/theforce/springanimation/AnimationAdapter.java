package ch.theforce.springanimation;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AnimationAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public AnimationAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new TranslationFragment();
                break;
            case 1:
                fragment = new RotationFragment();
                break;
            case 2:
                fragment = new ScaleFragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence charSequence = null;
        switch (position) {
            case 0:
                charSequence = mContext.getString(R.string.translation);
                break;
            case 1:
                charSequence = mContext.getString(R.string.rotation);
                break;
            case 2:
                charSequence = mContext.getString(R.string.scale);
                break;
            default:
                charSequence = null;
        }
        return charSequence;
    }
}
