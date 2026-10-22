/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(
                1001, "Ana Lima", 1000.0, 500.0);

        ContaPoupança cp = new ContaPoupança(
                2001, "Bruno Costa", 800.0, 0.5);

        // Operação 1: débito na conta corrente
        System.out.println("==========================================");
        System.out.println("  DÉBITO CONTA CORRENTE - R$ 2000.00");
        System.out.println("==========================================");

        try {
            cc.debitar(2000.0);

        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());

        } catch (LimiteExcedidoException e) {
            System.out.println("ERRO: " + e.getMessage());

        } finally {
            System.out.println("Saldo atual da conta "
                    + cc.getNumero() + ": R$ " + cc.getSaldo());
        }

        // Operação 2: débito na conta poupança
        System.out.println("\n==========================================");
        System.out.println("  DÉBITO CONTA POUPANÇA - R$ 1500.00");
        System.out.println("==========================================");

        try {
    cc.debitar(2000.0);

    } catch (ValorInvalidoException e) {
    System.out.println("ERRO: " + e.getMessage());

    } catch (LimiteExcedidoException e) {
    System.out.println("ERRO: " + e.getMessage());

    } finally {
    System.out.println("Saldo atual: R$ " + cc.getSaldo());
    }

        // Operação 3: crédito inválido na conta corrente
        System.out.println("\n==========================================");
        System.out.println("  CRÉDITO CONTA CORRENTE - R$ -300.00");
        System.out.println("==========================================");

        try {
            cc.creditar(-300.0);

        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());

        } finally {
            System.out.println("Saldo atual da conta "
                    + cc.getNumero() + ": R$ " + cc.getSaldo());
        }

        // Operação 4: rendimento da conta poupança
        System.out.println("\n==========================================");
        System.out.println("  RENDIMENTO CONTA POUPANÇA");
        System.out.println("==========================================");

        try {
            cp.aplicarRendimento();

        } catch (SaldoNegativoException e) {
            System.out.println("ERRO: " + e.getMessage());

        } finally {
            System.out.println("Saldo atual da conta "
                    + cp.getNumero() + ": R$ " + cp.getSaldo());
        }

        // Exibição final das contas
        System.out.println();
        System.out.println(cc);
        System.out.println(cp);
    }
}
