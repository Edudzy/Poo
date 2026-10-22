/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public class ValorInvalidoException extends Exception {

    private double valorInvalido;

    public ValorInvalidoException(double valorInvalido) {
        super("Valor inválido: R$ " + valorInvalido
                + ". Informe um valor maior que zero.");

        this.valorInvalido = valorInvalido;
    }

    public double getValorInvalido() {
        return valorInvalido;
    }
}
