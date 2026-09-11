/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo110926;

/**
 *
 * @author alunolab11
 */

public class Poo110926 {

    public static void main(String[] args) {       
        FormaPagamento p1 = new FormaPagamento("Notebook", 3500.00);
        FormaPagamento p2 = new PagamentoPix("Smartphone", 2000.00);
        FormaPagamento p3 = new PagamentoCartao("Iphone", 5000.00);
        FormaPagamento p4 = new PagamentoBoleto("Lego", 3000.00);

        System.out.println(p1.getNome() + " - Preco final: R$ " + p1.getPrecoFinal());
        System.out.println(p2.getNome() + " - Preco final: R$ " + p2.getPrecoFinal());
        System.out.println(p3.getNome() + " - Preco final: R$ " + p3.getPrecoFinal());
        System.out.println(p4.getNome() + " - Preco final: R$ " + p4.getPrecoFinal());
    }
}

