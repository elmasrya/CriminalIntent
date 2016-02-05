package com.andrewelmasry.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;

/**
 * Created by Andrew on 2/5/16.
 */
public class CrimeListFragment extends ListFragment {

    private ArrayList<Crime> listCrimes;
    CrimeLab crimeLab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.title_activity_crime);
        crimeLab = CrimeLab.get(getActivity());
        listCrimes = crimeLab.getCrimes();
    }
}
