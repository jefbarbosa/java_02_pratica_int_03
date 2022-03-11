package com.meli;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        PraticaExcecoes praticaExcecoes = new PraticaExcecoes(0, 300);

        try {
            System.out.println(praticaExcecoes.getA()/ praticaExcecoes.getB());
            System.out.println(praticaExcecoes.getB()/ praticaExcecoes.getA());
        } catch (ArithmeticException e) {
            // System.out.println("Ocorreu um erro de aritmética nula");
            throw new IllegalAccessException("Não pode ser dividiido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
