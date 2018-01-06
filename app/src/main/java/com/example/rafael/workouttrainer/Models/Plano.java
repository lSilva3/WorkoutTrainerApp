package com.example.rafael.workouttrainer.Models;

/**
 * Created by Mario on 06/01/2018.
 */

public class Plano {

    String nomePlano;
    String nomeEx1, nomeEx2, nomeEx3, nomeEx4;
    int codEx1, codEx2, codEx3, codEx4;
    int nRepsEx1, nRepesEx2, nRepsEx3, nRepesEx4;
    int nSeriesEx1, nSeriesEx2, nSeriesEx3, nSeriesEx4;

    public Plano( String nomePlano, String nomeEx1, String nomeEx2, String nomeEx3, String nomeEx4, int codEx1, int codEx2, int codEx3, int codEx4, int nRepsEx1, int nRepesEx2, int nRepsEx3, int nRepesEx4, int nSeriesEx1, int nSeriesEx2, int nSeriesEx3, int nSeriesEx4) {
        this.nomePlano = nomePlano;
        this.nomeEx1 = nomeEx1;this.nomeEx2 = nomeEx2;this.nomeEx3 = nomeEx3;this.nomeEx4 = nomeEx4;
        this.codEx1 = codEx1;this.codEx2 = codEx2;this.codEx3 = codEx3;this.codEx4 = codEx4;
        this.nRepsEx1 = nRepsEx1;this.nRepesEx2 = nRepesEx2;this.nRepsEx3 = nRepsEx3;this.nRepesEx4 = nRepesEx4;
        this.nSeriesEx1 = nSeriesEx1;this.nSeriesEx2 = nSeriesEx2;this.nSeriesEx3 = nSeriesEx3;this.nSeriesEx4 = nSeriesEx4;
    }

    public Plano() {
    }

    public String getNomePlano() {return nomePlano;}

    public void setNomePlano(String nomePlano) {this.nomePlano = nomePlano;}

    public String getNomeEx1() {return nomeEx1;}

    public void setNomeEx1(String nomeEx1) {this.nomeEx1 = nomeEx1;}

    public String getNomeEx2() {return nomeEx2;}

    public void setNomeEx2(String nomeEx2) {this.nomeEx2 = nomeEx2;}

    public String getNomeEx3() {return nomeEx3;}

    public void setNomeEx3(String nomeEx3) {this.nomeEx3 = nomeEx3;}

    public String getNomeEx4() {return nomeEx4;}

    public void setNomeEx4(String nomeEx4) {this.nomeEx4 = nomeEx4;}

    public int getCodEx1() {return codEx1;}

    public void setCodEx1(int codEx1) {this.codEx1 = codEx1;}

    public int getCodEx2() {return codEx2;}

    public void setCodEx2(int codEx2) {this.codEx2 = codEx2;}

    public int getCodEx3() {return codEx3;}

    public void setCodEx3(int codEx3) {this.codEx3 = codEx3;}

    public int getCodEx4() {return codEx4;}

    public void setCodEx4(int codEx4) {this.codEx4 = codEx4;}

    public int getnRepsEx1() {return nRepsEx1;}

    public void setnRepsEx1(int nRepsEx1) {this.nRepsEx1 = nRepsEx1;}

    public int getnRepesEx2() {return nRepesEx2;}

    public void setnRepesEx2(int nRepesEx2) {this.nRepesEx2 = nRepesEx2;}

    public int getnRepsEx3() {return nRepsEx3;}

    public void setnRepsEx3(int nRepsEx3) {this.nRepsEx3 = nRepsEx3;}

    public int getnRepesEx4() {return nRepesEx4;}

    public void setnRepesEx4(int nRepesEx4) {this.nRepesEx4 = nRepesEx4;}

    public int getnSeriesEx1() {return nSeriesEx1;}

    public void setnSeriesEx1(int nSeriesEx1) {this.nSeriesEx1 = nSeriesEx1;}

    public int getnSeriesEx2() {return nSeriesEx2;}

    public void setnSeriesEx2(int nSeriesEx2) {this.nSeriesEx2 = nSeriesEx2;}

    public int getnSeriesEx3() {return nSeriesEx3;}

    public void setnSeriesEx3(int nSeriesEx3) {this.nSeriesEx3 = nSeriesEx3;}

    public int getnSeriesEx4() {return nSeriesEx4;}

    public void setnSeriesEx4(int nSeriesEx4) {this.nSeriesEx4 = nSeriesEx4;}



    @Override
    public String toString() {
        return "Plano{" +
                ", nomePlano='" + nomePlano + '\'' +
                ", nomeEx1='" + nomeEx1 + '\'' +
                ", nomeEx2='" + nomeEx2 + '\'' +
                ", nomeEx3='" + nomeEx3 + '\'' +
                ", nomeEx4='" + nomeEx4 + '\'' +
                ", codEx1=" + codEx1 +
                ", codEx2=" + codEx2 +
                ", codEx3=" + codEx3 +
                ", codEx4=" + codEx4 +
                ", nRepsEx1=" + nRepsEx1 +
                ", nRepesEx2=" + nRepesEx2 +
                ", nRepsEx3=" + nRepsEx3 +
                ", nRepesEx4=" + nRepesEx4 +
                ", nSeriesEx1=" + nSeriesEx1 +
                ", nSeriesEx2=" + nSeriesEx2 +
                ", nSeriesEx3=" + nSeriesEx3 +
                ", nSeriesEx4=" + nSeriesEx4 +
                '}';
    }


}
