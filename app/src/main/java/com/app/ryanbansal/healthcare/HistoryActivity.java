package com.app.ryanbansal.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<History> histories = new ArrayList<>();
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));
        histories.add(new History("LalPath Lab", "21st Oct, 2017"));
        histories.add(new History("Fortis Lab ltd", "15th Oct 2017 "));

        historyadapter myadapter = new historyadapter(this, histories);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(HistoryActivity.this, ReportActivity.class);
                startActivity(intent);
            }
        });
    }
}
