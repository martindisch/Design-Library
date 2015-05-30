package com.martin.designlibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CollapsingFragment extends Fragment {

    public static CollapsingFragment newInstance() {
        CollapsingFragment fragment = new CollapsingFragment();
        return fragment;
    }

    public CollapsingFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_collapsing, container, false);
        return rootView;
    }


}
