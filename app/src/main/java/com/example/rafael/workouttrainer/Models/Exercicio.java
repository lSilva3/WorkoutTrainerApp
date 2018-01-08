package com.example.rafael.workouttrainer.Models;

/**
 * Created by Mario on 06/01/2018.
 */

public class Exercicio {
    String nome;
    String nSeries;
    String nReps;




    public Exercicio(String nome, String nSeries, String nReps) {
        this.nome = nome;
        this.nSeries = nSeries;
        this.nReps = nReps;

    }

    public Exercicio() {
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}
    public String getnSeries() {return nSeries;}
    public void setnSeries(String nSeries) {this.nSeries = nSeries;}
    public String getnReps() {return nReps;}
    public void setnReps(String nReps) {this.nReps = nReps;}

    @Override
    public String toString() {
        return "Exercicio{" +
                "nome='" + nome + '\'' +
                ", nSeries=" + nSeries +
                ", nReps=" + nReps +
                '}';
    }
}
