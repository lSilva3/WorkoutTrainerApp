package com.example.rafael.workouttrainer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rafael.workouttrainer.Models.Plano;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PlanoActivity extends AppCompatActivity implements ValueEventListener {

    // Nome plano
    EditText nomePlano;

    // Nome Exercicio
    EditText nomeEx1;
    EditText nomeEx2;
    EditText nomeEx3;
    EditText nomeEx4;

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

    // Botao enviar Plano
    Button enviarPlano;

    //Adapter
    ArrayAdapter<CharSequence> adapter;

    // Firebase
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference mPlanoRefenrence = firebaseDatabase.getReference();
    DatabaseReference detalheplano = mPlanoRefenrence.child("Plano");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano);

        // Nome Plano
        nomePlano = (EditText) findViewById(R.id.editTextNomePlano);

        // Nome exercicios
        nomeEx1 = (EditText) findViewById(R.id.editTextNomeEx1);
        nomeEx2 = (EditText) findViewById(R.id.editTextNomeEx2);
        nomeEx3 = (EditText) findViewById(R.id.editTextNomeEx3);
        nomeEx4 = (EditText) findViewById(R.id.editTextNomeEx4);

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

        // Botao enviar plano
        enviarPlano = (Button) findViewById(R.id.buttonEnviarPlano);

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


        enviarPlano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Plano plano = new Plano();

                // Receber os dados inseridos no formulario do plano
                plano.setNomePlano(nomePlano.getText().toString());



                // Mensagem de aviso com os detalhes do plano
                Context context = getApplicationContext();
                CharSequence text = plano.toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                //Teste para escrver na base de dados
                detalheplano.setValue(plano);

            }
        });

        //Quando temos algo selecionado no spinner Series do ex1
    /*   spinnerEx1Series.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long ld) {
               Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " ->Ex1: series", Toast.LENGTH_LONG).show();
           }
           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {
           }
       });*/

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


    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}



