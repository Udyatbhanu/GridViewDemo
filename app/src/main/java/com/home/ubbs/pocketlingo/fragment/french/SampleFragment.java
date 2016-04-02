package com.home.ubbs.pocketlingo.fragment.french;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.home.ubbs.pocketlingo.R;
import com.home.ubbs.pocketlingo.fragment.BaseFragment;
import com.home.ubbs.pocketlingo.view.CustomGridBaseAdapter;

/**
 * Created by udyatbhanu-mac on 4/1/16.
 */

public class SampleFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_base, container, false);
        GridView gridview = (GridView)view.findViewById(R.id.gridview);
        gridview.setAdapter(new CustomGridBaseAdapter(container.getContext()));



        return view;
    }

}
