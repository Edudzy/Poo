/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo040926part2;

/**
 *
 * @author alunolab11
 */
public class Bebida extends Produto{
    private int quantidadeEstoque;

    public Bebida(int codigo, String nome, double valor, int quantidadeEstoque) {
        super(codigo, nome, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void darEntrada(int quantidade){
        if(quantidade>0){
            this.quantidadeEstoque += quantidade;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    void darBaixa(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque){
            this.quantidadeEstoque -= quantidade;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "Bebida{" + "quantidadeEstoque=" + quantidadeEstoque + '}';
    }
    
    
}
