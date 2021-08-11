package com.local.java;

public class Principal2 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.anoDeFabricacao = 2012;
        carro.cor = "Vermelho";
        carro.modelo = "Onix";
        carro.fabricante = "General Motors";

        Carro carro1 = new Carro();
        carro1.anoDeFabricacao = 2021;
        carro1.cor = "Preto";
        carro1.modelo = "Punto";
        carro1.fabricante = "Fiat";


        System.out.println("\nCarro do fabricante " +  carro.fabricante +  ", da marca " + carro.modelo + ", da cor " + carro.cor + ", do ano de fabricação "
                + carro.anoDeFabricacao + " foi vendido com sucesso!");

        System.out.println("\nO outro carro do fabricante " + carro1.fabricante + ", da marca " + carro1.modelo + ", da cor " + carro1.cor + ", do ano de frabricação "
                + carro1.anoDeFabricacao + " foi vendido com sucesso!");
    }
}
