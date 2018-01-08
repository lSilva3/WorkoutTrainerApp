package com.example.rafael.workouttrainer.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario on 06/01/2018.
 */

public class Plano {

    // Variaveis
    //String id;
    String nomePlano;
    List<Exercicio> exercicios = new ArrayList<>();

    // Construtor




    public Plano(String nomePlano, List<Exercicio> exercicios) {
        this.nomePlano = nomePlano;
        this.exercicios = exercicios;
    }
    public Plano( List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Plano() {
    }



    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    @Override
    public String toString() {
        return "Plano{" +
                "nomePlano='" + nomePlano + '\'' +
                ", exercicios=" + exercicios +
                '}';
    }
}
