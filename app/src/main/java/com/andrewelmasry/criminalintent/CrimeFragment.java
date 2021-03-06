package com.andrewelmasry.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.util.Date;

/**
 * Created by Andrew on 2/4/16.
 *
 * if you wanted the min sdk version below api 11 you must use the following import:
 * import android.support.v4.app.Fragment
 */
public class CrimeFragment extends Fragment {

    private Crime crime;
    private EditText titleField;
    private Button dateButton;
    private CheckBox solvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        crime= new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        titleField = (EditText)v.findViewById(R.id.crime_title);

        dateButton = (Button)v.findViewById(R.id.crime_date);

        solvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);


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

        Date fragDate = crime.getDate();
        String printedDate = (fragDate.toString());

        DateFormat dateFormat = new DateFormat();


        dateButton.setText(printedDate);
        dateButton.setEnabled(false);


        solvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                crime.setSolved(isChecked);
            }
        });


        return v;

    }//end of onCreateView



}
