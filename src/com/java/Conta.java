package com.java;

public class Conta {
    private String numero;
    private double saldo;

    public Conta() {

    }

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    Cliente cliente = new Cliente();

    public double recuperarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    //Método público para definir o valor do atriburo privado
    public void setNumero(String numero){
        this.numero = numero;
    }
    //Método público para obter o valor do atributo privado
    public String getNumero() {
        return numero;
    }

}
