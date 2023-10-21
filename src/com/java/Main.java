package com.java;

public class Main {
    public static void main(String[] args) {
        Conta cc = new Conta("1000", 52.4);
        System.out.println(cc.recuperarSaldo());

        Conta contaCorrente = new Conta();
        Conta contaPoupança = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.setNumero("111");
        contaCorrente.cliente.nome = "Cliente1";
        contaCorrente.cliente.idade = 20;

        contaPoupança.setNumero("222");
        contaPoupança.cliente.nome = "Cliente2";
        contaPoupança.cliente.idade = 25;

        contaInvestimento.setNumero("333");
        contaInvestimento.cliente.nome = "Cliente3";
        contaInvestimento.cliente.idade = 30;

        System.out.println(contaCorrente.getNumero());
        System.out.println(contaPoupança.getNumero());
        System.out.println(contaInvestimento.getNumero());
    }
}