/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public class ContaPoupança extends Conta {

    private double taxaRendimento;

    public ContaPoupança(int numero, String titular,
                         double saldo, double taxaRendimento) {
        super(numero, titular, saldo);

        if (!Double.isFinite(taxaRendimento)
                || taxaRendimento < 0) {
            throw new IllegalArgumentException(
                    "A taxa de rendimento deve ser finita "
                    + "e não negativa.");
        }

        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void debitar(double valor)
            throws ValorInvalidoException,
                   SaldoInsuficienteException {

        if (!Double.isFinite(valor) || valor <= 0) {
            throw new ValorInvalidoException(valor);
        }

        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException(
                    getSaldo(), valor);
        }

        setSaldo(getSaldo() - valor);

        System.out.println("Débito de R$ " + valor
                + " realizado. Saldo: R$ " + getSaldo());
    }

    public void aplicarRendimento()
            throws SaldoNegativoException {

        if (getSaldo() <= 0) {
            throw new SaldoNegativoException(getSaldo());
        }

        double rendimento =
                getSaldo() * (taxaRendimento / 100);

        setSaldo(getSaldo() + rendimento);

        System.out.println("Rendimento de R$ " + rendimento
                + " aplicado. Saldo: R$ " + getSaldo());
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Conta Poupança"
                + " | Taxa de rendimento: "
                + taxaRendimento + "% ao mês");
    }
}

