/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo090926;

/**
 *
 * @author alunolab11
 */
public class Poo090926 {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        FormaPagamento pix = new PagamentoPix(100);
        FormaPagamento cartao = new PagamentoCartao(100);
        FormaPagamento boleto = new PagamentoBoleto(100);

        checkout.finalizarCompra(pix);
        checkout.finalizarCompra(cartao);
        checkout.finalizarCompra(boleto);
    }
}
