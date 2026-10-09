/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alunolab11
 */
public class Leão extends Animal implements Andar {

    private String alcunha;

    public Leão(String nome, double peso, String alcunha) {
        super(nome, peso, "Savana africana");
        this.alcunha = alcunha;
    }

    public String getAlcunha() {
        return alcunha;
    }

    @Override
    public void emitirSom() {
        System.out.println("ROAAARRR");
    }

    @Override
    public void alimentar() {
        System.out.println(
            "O leão participa da caçada em grupo e consome a presa."
        );
    }

    @Override
    public void andar(int velocidade) {
        System.out.println(
            "O leão caminha pela savana a " + velocidade + " km/h."
        );
    }

    @Override
    public void correr(int velocidade) {
        System.out.println(
            "O leão dispara em perseguição a "
            + velocidade + " km/h."
        );
    }

    @Override
    public void parar() {
        System.out.println(
            "O leão para, espreita e observa a presa ao longe."
        );
    }
}
