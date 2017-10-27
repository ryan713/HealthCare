package com.app.ryanbansal.healthcare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raghav on 27-10-2017.
 */

public class ClinicAdapter extends ArrayAdapter<Clinic> {



    public ClinicAdapter(Context context, ArrayList<Clinic> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.clinics_layout, parent, false);
        }

        Clinic currentClinic = getItem(position);

        TextView ClinicNameTextView = (TextView) listItemView.findViewById(R.id.clinicName);
        ClinicNameTextView.setText(currentClinic.getmClinicName());

        TextView distanceTextView = (TextView) listItemView.findViewById(R.id.distance);
        distanceTextView.setText(currentClinic.getmDistance());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.clincImage);
        imageView.setImageResource(currentClinic.getmColorId());

        return listItemView;
    }

}
