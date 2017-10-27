//package com.app.ryanbansal.healthcare;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        TextView textView1 = (TextView) findViewById(R.id.reminder);
//        TextView textView2 = (TextView) findViewById(R.id.date);
//
//        Button history = (Button) findViewById(R.id.history);
//        Button clinics = (Button) findViewById(R.id.clinic);
//        Button doctor = (Button) findViewById(R.id.doctor);
//
//        history.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, HistoryActivity.class);
//                startActivity(i);
//            }
//        });
//
//        clinics.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, ClinicsActivity.class);
//                startActivity(i);
//            }
//        });
//
//        doctor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, DoctorActivity.class);
//                startActivity(i);
//            }
//        });
//    }
//}
