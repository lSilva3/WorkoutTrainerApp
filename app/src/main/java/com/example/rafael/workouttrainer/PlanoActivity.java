package com.example.rafael.workouttrainer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.rafael.workouttrainer.Models.Exercicio;
import com.example.rafael.workouttrainer.Models.Plano;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class PlanoActivity extends AppCompatActivity implements ValueEventListener {

    // Variaveis
    EditText nomePlano;
    EditText nomeEx;
    Spinner spinnerExSeries;
    Spinner spinnerExReps;
    Button enviarPlano;
    Button addExercicio;

    //Adapter Series
    ArrayAdapter<CharSequence> adapter;
    // Adapter Reps
    ArrayAdapter<CharSequence> adapter2;

    //Array Exercicios
    List<Exercicio> exercicios = new ArrayList<>();

    // Firebase
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference mPlanoRefenrence = firebaseDatabase.getReference();

    // Ver qual o user logado actualmente
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano);

        // Nome Plano e exercicio
        nomePlano = (EditText) findViewById(R.id.editTextNomePlano);
        nomeEx = (EditText) findViewById(R.id.editTextNomeExercicio);


        //Spinners
        spinnerExSeries = (Spinner) findViewById(R.id.spinnerExSeries);
        spinnerExReps = (Spinner) findViewById(R.id.spinnerExReps);

        // Botao enviar plano
        enviarPlano = (Button) findViewById(R.id.buttonEnviarPlano);
        addExercicio = (Button) findViewById(R.id.buttonAddExercicio);

        // Adicionar os valores ao adapter series
        adapter = ArrayAdapter.createFromResource(this,R.array.series,android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Adicionar os valores ao adapter reps
        adapter2 = ArrayAdapter.createFromResource(this,R.array.reps,android.R.layout.simple_spinner_item );
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Adicionar o adapter aos spinners
        spinnerExSeries.setAdapter(adapter);
        spinnerExReps.setAdapter(adapter2);

        // Açao do botao add exercicio
        addExercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Criar um exercicio novo e adicionar ao array exercicios
                Exercicio exercicio = new Exercicio();
                exercicio.setNome(nomeEx.getText().toString());
                exercicio.setnSeries(Integer.parseInt(spinnerExSeries.getSelectedItem().toString()));
                exercicio.setnReps(Integer.parseInt(spinnerExReps.getSelectedItem().toString()));
                exercicios.add(exercicio);

                // Repor os valores dos campos
                nomeEx.setText("");
                spinnerExSeries.setOnItemSelectedListener(null);
                spinnerExReps.setOnItemSelectedListener(null);

                // Aviso de que o exercicio foi adicionado com sucesso
                Context context = getApplicationContext();
                CharSequence text = "Exercicio Adicionado!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        // Açao do botao enviar plano
        enviarPlano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Cria um plano novo e envia para a basse dadados
                Plano plano = new Plano(nomePlano.getText().toString(),exercicios);
                mPlanoRefenrence.child(user.getUid()).child(plano.getNomePlano()).setValue(plano).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        // Aviso de que o exercicio foi adicionado com sucesso
                        Context context = getApplicationContext();
                        CharSequence text = "Plano Enviado!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                    }
                });
            }
        });


        //Quando temos algo selecionado no spinner Series do ex1
        /*spinnerExReps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long ld) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " ->Ex1: Reps", Toast.LENGTH_LONG).show();
            }
            // Quando nao temos nada no spinner (nao acontece nada)
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });*/

    }


    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}



