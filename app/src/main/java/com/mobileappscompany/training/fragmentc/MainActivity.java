package com.mobileappscompany.training.fragmentc;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    F1 f1;
    F2 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) return;


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


            f1 = new F1();
            f2 = new F2();


        ft.add(R.id.forF1, f1);
        ft.add(R.id.forF2, f2);

        ft.commit();

    }

    public void send22(String s){
        f2.setMyET(s);
    }

}
