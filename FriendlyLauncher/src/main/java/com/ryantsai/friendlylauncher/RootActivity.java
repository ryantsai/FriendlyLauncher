package com.ryantsai.friendlylauncher;

import android.support.v4.app.Fragment;

public class RootActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return RootFragment.newInstance(0);
    }
}
