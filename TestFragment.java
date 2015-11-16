package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Айгуль on 11/15/2015.
 */
public class TestFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
    return inflater.inflate(R.layout.fragment,null);
    }
}
