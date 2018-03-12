package com.example.ashish.applcation_rmansir;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ASHISH on 3/11/2018.
 */

public class Profile_Frag extends Fragment {
    View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.profile_layout, container, false);
        return view;

    }
}
