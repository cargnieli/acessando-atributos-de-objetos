package com.local.java;

public class FolhaPagamento {

    double calcularSalario(int horaNormais, int horasExtras, double valorHoraNormal, double valorHoraExra) {

        double vaHorasNormais = horaNormais * valorHoraNormal;
        double valorHorasExtras = horasExtras * valorHoraExra;

        return  vaHorasNormais + valorHorasExtras;


    }
}
