package com.example.rafael.workouttrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PlanoActivity extends AppCompatActivity {

    //Spinners Series
    Spinner spinnerEx1Series;
    Spinner spinnerEx2Series;
    Spinner spinnerEx3Series;
    Spinner spinnerEx4Series;

    //Spinners Reps
    Spinner spinnerEx1Reps;
    Spinner spinnerEx2Reps;
    Spinner spinnerEx3Reps;
    Spinner spinnerEx4Reps;

    //Adapter
    ArrayAdapter<CharSequence> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano);

        //Spinners Series
        spinnerEx1Series = (Spinner) findViewById(R.id.spinnerEx1Series);
        spinnerEx2Series = (Spinner) findViewById(R.id.spinnerEx2Series);
        spinnerEx3Series = (Spinner) findViewById(R.id.spinnerEx3Series);
        spinnerEx4Series = (Spinner) findViewById(R.id.spinnerEx4Series);

        //Spinners Reps
        spinnerEx1Reps = (Spinner) findViewById(R.id.spinnerEx1Reps);
        spinnerEx2Reps = (Spinner) findViewById(R.id.spinnerEx2Reps);
        spinnerEx3Reps = (Spinner) findViewById(R.id.spinnerEx3Reps);
        spinnerEx4Reps = (Spinner) findViewById(R.id.spinnerEx4Reps);

        adapter = ArrayAdapter.createFromResource(this,R.array.numeros,android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Adicionar o adapter aos spinners
        spinnerEx1Series.setAdapter(adapter);
        spinnerEx2Series.setAdapter(adapter);
        spinnerEx3Series.setAdapter(adapter);
        spinnerEx4Series.setAdapter(adapter);
        spinnerEx1Reps.setAdapter(adapter);
        spinnerEx2Reps.setAdapter(adapter);
        spinnerEx3Reps.setAdapter(adapter);
        spinnerEx4Reps.setAdapter(adapter);


        //Quando temos algo selecionado no spinner Series do ex1
       spinnerEx1Series.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long ld) {
               Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " ->Ex1: series", Toast.LENGTH_LONG).show();
           }
           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {
           }
       });

        //Quando temos algo selecionado no spinner Series do ex1
        spinnerEx1Reps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long ld) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " ->Ex1: Reps", Toast.LENGTH_LONG).show();
            }
            // Quando nao temos nada no spinner (nao acontece nada)
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }


}



