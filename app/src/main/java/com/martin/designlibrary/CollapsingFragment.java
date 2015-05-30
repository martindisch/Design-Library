package com.martin.designlibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CollapsingFragment extends Fragment {

    private RecyclerView mList;

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
        mList = (RecyclerView) rootView.findViewById(R.id.rvContents);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mList.setLayoutManager(layoutManager);
        mList.setHasFixedSize(true);
        mList.setAdapter(new ListAdapter());
        return rootView;
    }


}