package com.ryantsai.friendlylauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ryantsai on 7/6/13.
 */
public class RootFragment extends Fragment {

    public static final String EXTRA_ROOT_PAGEINDEX = "com.ryantsai.friendlylauncher.extra_root_pageindex";
private TextView mBaseTextView;
private int currentPageIndex;

    public static RootFragment newInstance(int pageIndex) {
        Bundle args = new Bundle();
       // args.putSerializable(EXTRA_ROOT_PAGEINDEX, pageIndex);
        args.putInt(EXTRA_ROOT_PAGEINDEX, pageIndex);
        RootFragment fragment = new RootFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        currentPageIndex =  getArguments().getInt(EXTRA_ROOT_PAGEINDEX);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_root, container, false);

        mBaseTextView = (TextView) v.findViewById(R.id.baseTextView);
        mBaseTextView.setText(String.valueOf(currentPageIndex));
        return v;
    }
}
