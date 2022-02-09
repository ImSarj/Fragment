package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager frm = getSupportFragmentManager();
                FragmentTransaction frt=frm.beginTransaction();
                frt.add(R.id.wrapper, new FirstFragment());
                frt.addToBackStack(null);
                frt.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager frm2 =getSupportFragmentManager();
                FragmentTransaction frt2=frm2.beginTransaction();
                frt2.add(R.id.wrapper, new SecondFragment());
                frt2.addToBackStack(null);
                frt2.commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager frm3=getSupportFragmentManager();
                FragmentTransaction frt3=frm3.beginTransaction();
                frt3.add(R.id.wrapper, new ThirdFragment());
                frt3.addToBackStack(null);
                frt3.commit();
            }
        });
    }
}