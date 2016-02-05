package com.andrewelmasry.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Andrew on 2/4/16.
 * To Acheive UI felxibility, you must add your fragment(s) in code
 * CrimeActivity will be hosting CrimeFragment
 *
 *
 */
public class CrimeActivity extends FragmentActivity {

    Fragment fragment;

    private static final String TAG = "FirstScreen";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //First create an instsance of FragmentManager and use the me
        FragmentManager fragmentManager = getSupportFragmentManager();

        //create an instance of fragment and use the fragment manager to take in the fragment container
        fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if (fragment == null) {


            fragment = new CrimeFragment();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.add(R.id.fragment_container, fragment);

            fragmentTransaction.commit();
        }
    }


}
