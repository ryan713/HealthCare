package com.app.ryanbansal.healthcare;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by RyanBansal on 10/27/17.
 */

public class historyadapter extends ArrayAdapter<History> {

    public historyadapter(@NonNull Context context, @NonNull ArrayList<History> histories ) {
        super(context, 0, histories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.report, parent, false);

        TextView textView1 = (TextView) convertView.findViewById(R.id.name);
        textView1.setText(getItem(position).getName());

        TextView textView2 = (TextView) convertView.findViewById(R.id.date);
        textView2.setText(getItem(position).getDate());

        return convertView;
    }

}