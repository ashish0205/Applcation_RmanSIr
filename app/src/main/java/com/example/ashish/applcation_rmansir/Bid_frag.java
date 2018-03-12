package com.example.ashish.applcation_rmansir;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ASHISH on 3/11/2018.
 */

public class Bid_frag  extends Fragment{
    View view;
    ListView lstvw;
    String[] web = {
            "Samsug Galaxy A8+",
            "boAt Stone 200",
    } ;
    Integer[] imageId = {
            R.drawable.samsung,
            R.drawable.boat,


    };
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.bid_layout, container, false);
        lstvw=(ListView) view.findViewById(R.id.list_item_bid);
        BidList bid=new BidList(getActivity(),web,imageId);
        lstvw.setAdapter(bid);


        return view;

    }
}
