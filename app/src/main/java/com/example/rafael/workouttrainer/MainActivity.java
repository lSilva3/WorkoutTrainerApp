package com.example.rafael.workouttrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addPlan;
    Button Alimentacao;
    Button Chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addPlan = (Button)findViewById(R.id.buttonPlano);
        addPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlanoActivity.class);
                startActivity(intent);
            }

        });


        Alimentacao = (Button)findViewById(R.id.buttonAlimentacao);
        Alimentacao .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AddCliente.class);
                startActivity(intent);
            }

        });

        Chat = (Button)findViewById(R.id.buttonChat);
        Chat .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ChatActivity.class);
                startActivity(intent);
            }

        });
    }

}
