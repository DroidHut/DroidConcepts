package com.example.shivani.androidconcepts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class FActivityOverview extends Fragment {
    
  

    public FActivityOverview() {
        // Required empty public constructor
    }
    
    public static FActivityOverview newInstance(String param1, String param2) {
        FActivityOverview fragment = new FActivityOverview();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_activity_overview, container, false);
    }

   
}
