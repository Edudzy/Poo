/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo040926part2;

/**
 *
 * @author alunolab11
 */
public class Pizza extends Produto{
    private String tamanho;
    private int diametro;
    private List<String> ingredientes;

    public Pizza() {
        super();
    }

    public Pizza(String tamanho, int diametro, List<String> ingredientes, int codigo, String nome, double valor) {
        super(codigo, nome, valor);
        this.tamanho = tamanho;
        this.diametro = diametro;
        this.ingredientes = ingredientes;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public <any> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(<any> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Pizza{" + "tamanho=" + tamanho + ", diametro=" + diametro + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
