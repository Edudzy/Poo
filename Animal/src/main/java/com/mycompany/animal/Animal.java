/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author alunolab11
 */
public abstract class Animal {

    private String nome;
    private double peso;
    private String habitat;

    public Animal(String nome, double peso, String habitat) {
        this.nome = nome;
        this.peso = peso;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.println("Habitat: " + habitat);
    }

    public abstract void emitirSom();

    public abstract void alimentar();
}