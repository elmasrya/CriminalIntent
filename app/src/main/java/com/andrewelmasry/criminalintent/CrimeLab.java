package com.andrewelmasry.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Andrew on 2/5/16.
 */
public class CrimeLab {

    private ArrayList<Crime> listCrimes;

    private static CrimeLab crimeLab;
    private Context context;

    private CrimeLab(Context context){
        this.context = context;
        listCrimes =  new ArrayList<Crime>();

        for (int i=0; i<100; i++) {
            Crime c =  new Crime();
            c.setTitle("Crime # " + i );
            c.setSolved(i%2==0);
            listCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c) {
        if (crimeLab == null) {
            crimeLab = new CrimeLab(c.getApplicationContext());
        }

        return crimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return listCrimes;
    }

    public Crime getCrime(UUID id){
        for (Crime c : listCrimes) {
            if(c.getId().equals(id))
                return c;
        }
        return null;
    }

}
