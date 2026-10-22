/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String titular,
                         double saldo, double limite) {
        super(numero, titular, saldo);

        if (!Double.isFinite(limite) || limite < 0) {
            throw new IllegalArgumentException(
                    "O limite deve ser finito e não negativo.");
        }

        this.limite = limite;
    }

    @Override
    public void debitar(double valor)
        throws ValorInvalidoException,
               LimiteExcedidoException {

    if (valor <= 0) {
        throw new ValorInvalidoException(valor);
    }

    if (valor > getSaldo() + limite) {
        throw new LimiteExcedidoException(
                getSaldo(), limite, valor);
    }

    setSaldo(getSaldo() - valor);

    System.out.println("Débito de R$ " + valor
            + " realizado. Saldo: R$ " + getSaldo());
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Conta Corrente"
                + " | Limite cheque especial: R$ " + limite);
    }
}
