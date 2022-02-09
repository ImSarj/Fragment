package com.example.fragmentassignment;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        Button nextpageButton = (Button) v.findViewById(R.id.btn1);
        nextpageButton.setOnClickListener((View.OnClickListener) getActivity());
        return v;
    }

        }
