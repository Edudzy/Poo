/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo021026;

/**
 *
 * @author alunolab11
 */
public abstract class Animal {
    public String nome;
    public double peso;
    public String habitat;

    public Animal(String nome, double peso, String habitat) {
        this.nome = nome;
        this.peso = peso;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", peso=" + peso + ", habitat=" + habitat + '}';
    }
    
    
}
