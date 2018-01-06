package com.example.rafael.workouttrainer.Models;

/**
 * Created by Mario on 06/01/2018.
 */

public class Plano {

    // Variaveis
    String nomePlano;

    // Construtor
    public Plano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public Plano() {
    }

    public String getNomePlano() {return nomePlano;}

    public void setNomePlano(String nomePlano) {this.nomePlano = nomePlano;}


    @Override
    public String toString() {
        return "Plano{" +
                ", nomePlano='" + nomePlano + '\'' +
                '}';
    }


}
