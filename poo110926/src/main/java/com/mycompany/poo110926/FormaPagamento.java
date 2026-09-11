/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo110926;

/**
 *
 * @author alunolab11
 */
public class FormaPagamento {
    private String nome;
    protected double valor;

    public FormaPagamento(String nome, double preco) {       
        this.nome = nome;
        this.valor = preco;
    }

    // Método que pode ser sobrescrito
    public double getPrecoFinal() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
