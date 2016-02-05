package com.andrewelmasry.criminalintent;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Andrew on 2/4/16.
 *
 * if you wanted the min sdk version below api 11 you must use the following import:
 * import android.support.v4.app.Fragment
 */
public class CrimeFragment extends Fragment {

    private Crime crime;
    private EditText titleField;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        crime= new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        titleField = (EditText)v.findViewById(R.id.crime_title);

        titleField.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                crime.setTitle(crime.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //blank
            }
        });


        return v;
    }
}
