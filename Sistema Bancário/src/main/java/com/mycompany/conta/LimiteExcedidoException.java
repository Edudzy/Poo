/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public class LimiteExcedidoException extends Exception {

    private double saldoAtual;
    private double limite;
    private double valorSolicitado;

    public LimiteExcedidoException(
            double saldoAtual,
        double limite,
        double valorSolicitado) {

    super("Limite excedido. Saldo: R$ " + saldoAtual
            + " | Limite: R$ " + limite
            + " | Solicitado: R$ " + valorSolicitado);


        this.saldoAtual = saldoAtual;
        this.limite = limite;
        this.valorSolicitado = valorSolicitado;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getLimite() {
        return limite;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }
}