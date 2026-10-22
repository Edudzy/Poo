/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public abstract class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException(
                    "O saldo inicial não pode ser negativo.");
        }

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void creditar(double valor)
            throws ValorInvalidoException {

        if (!Double.isFinite(valor) || valor <= 0) {
            throw new ValorInvalidoException(valor);
        }

        saldo += valor;

        System.out.println("Crédito de R$ " + valor
                + " realizado. Saldo: R$ " + saldo);
    }

    public void debitar(double valor)
        throws ValorInvalidoException,
               SaldoInsuficienteException,
               LimiteExcedidoException {

    if (valor <= 0) {
        throw new ValorInvalidoException(valor);
    }

    if (valor > saldo) {
        throw new SaldoInsuficienteException(saldo, valor);
    }

    saldo -= valor;

    System.out.println("Débito de R$ " + valor
            + " realizado. Saldo: R$ " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (!Double.isFinite(saldo) || saldo < 0) {
            throw new IllegalArgumentException(
                    "O saldo deve ser finito e não negativo.");
        }

        this.saldo = saldo;
    }

    public abstract void exibirTipo();

    @Override
    public String toString() {
        return "Conta " + numero
                + " | Titular: " + titular
                + " | Saldo: R$ " + saldo;
    }
}