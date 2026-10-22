/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public class SaldoInsuficienteException extends Exception {

    private double saldoDisponivel;
    private double valorSolicitado;

    public SaldoInsuficienteException(
            double saldoDisponivel, double valorSolicitado) {

        super("Saldo insuficiente. Disponível: R$ "
                + saldoDisponivel
                + " | Solicitado: R$ " + valorSolicitado);

        this.saldoDisponivel = saldoDisponivel;
        this.valorSolicitado = valorSolicitado;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }
}
