package com.andrewelmasry.criminalintent;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Andrew on 2/4/16.
 * To Acheive UI felxibility, you must add your fragment(s) in code
 * CrimeActivity will be hosting CrimeFragment
 *
 *
 */
public class CriminalActivity extends FragmentActivity {

    Fragment fragment;

    private static final String TAG = "FirstScreen";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

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

    public void onAttachFragment() {
        super.onAttachFragment(fragment);
        Log.i(TAG, "onAttachedCalled");
        Toast toast = Toast.makeText(this,fragment.toString(), Toast.LENGTH_LONG);

    }

}
