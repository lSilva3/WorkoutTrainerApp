package com.example.rafael.workouttrainer.Models;

/**
 * Created by Mario on 06/01/2018.
 */

public class Exercico {
    String nome;
    int nSeries;
    int nReps;

    Plano plano;


    public Exercico(String nome, int nSeries, int nReps) {
        this.nome = nome;
        this.nSeries = nSeries;
        this.nReps = nReps;
    }

    public Exercico() {
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}
    public int getnSeries() {return nSeries;}
    public void setnSeries(int nSeries) {this.nSeries = nSeries;}
    public int getnReps() {return nReps;}
    public void setnReps(int nReps) {this.nReps = nReps;}
    public Plano getPlano() {return plano;}
    public void setPlano(Plano plano) {this.plano = plano;}

    @Override
    public String toString() {
        return "Exercico{" +
                "nome='" + nome + '\'' +
                ", nSeries=" + nSeries +
                ", nReps=" + nReps +
                ", plano=" + plano +
                '}';
    }
}
