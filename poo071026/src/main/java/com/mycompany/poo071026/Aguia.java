/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo071026;

/**
 *
 * @author alunolab11
 */
public class Aguia extends Animal implements Voar {

    private double envergadura;

    public Aguia(String nome, double peso, String habitat, double envergadura) {
        super(nome, peso, habitat);
        this.envergadura = envergadura;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    @Override
    public void emitirSom() {
        System.out.println("KREEE KREEE");
    }

    @Override
    public void alimentar() {
        System.out.println("A águia captura peixe com as garras em voo rasante.");
    }

    @Override
    public void decolar() {
        System.out.println("A águia abre as asas e decola das rochas.");
    }

    @Override
    public void voar(String destino) {
        System.out.println("A águia plana em direção a " + destino + ".");
    }

    @Override
    public void pousar() {
        System.out.println("A águia fecha as asas e pousa no topo da montanha.");
    }
}
    

