package com.andrewelmasry.criminalintent;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Andrew on 2/4/16.
 * To Acheive UI felxibility, you must add your fragment(s) in code
 * CrimeActivity will be hosting CrimeFragment
 *
 *
 */
public class CriminalActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //First create an instsance of FragmentManager and use the me
        FragmentManager fragmentManager = getFragmentManager();

        //create an instance of fragment and use the fragment manager to take in the fragment container
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.add(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }
    }

}
