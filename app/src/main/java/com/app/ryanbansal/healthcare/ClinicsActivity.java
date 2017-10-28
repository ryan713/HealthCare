package com.app.ryanbansal.healthcare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ClinicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics);


        ArrayList<Clinic> clinics = new ArrayList<Clinic>();

        clinics.add(new Clinic(R.drawable.clinic, "Fortis","1.1kms"));
        clinics.add(new Clinic(R.drawable.clinic, " Maximus Path Lab", "1.8kms"));
        clinics.add(new Clinic(R.drawable.clinic, "Dr.Doda's Lab", "3.2kms"));
        clinics.add(new Clinic(R.drawable.clinic, "Dr.Lal Path Lab", "5.6kms"));


        ClinicAdapter adapter = new ClinicAdapter(this, clinics);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);

    }
}
