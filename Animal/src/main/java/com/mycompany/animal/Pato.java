/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alunolab11
 */
public class Pato extends Animal implements Voar, Nadar, Andar {

    public Pato(String nome, double peso) {
        super(nome, peso, "Lagos, lagoas e margens aquáticas");
    }

    @Override
    public void emitirSom() {
        System.out.println("QUACK QUACK QUACK");
    }

    @Override
    public void alimentar() {
        System.out.println(
            "Filtra a água com o bico em busca de algas e insetos."
        );
    }

    // Interface Voar

    @Override
    public void decolar() {
        System.out.println(
            "O pato bate as asas e decola da superfície da água."
        );
    }

    @Override
    public void voar(String destino) {
        System.out.println(
            "O pato voa em formação migratória rumo a "
            + destino + "."
        );
    }

    @Override
    public void pousar() {
        System.out.println(
            "O pato desce e desliza sobre a superfície do lago."
        );
    }

    // Interface Nadar

    @Override
    public void nadar(String local) {
        System.out.println(
            "O pato nada tranquilamente em " + local + "."
        );
    }

    @Override
    public void mergulhar(int profundidade) {
        System.out.println(
            "O pato mergulha superficialmente a "
            + profundidade + " metros."
        );
    }

    @Override
    public void emergir() {
        System.out.println(
            "O pato emerge sacudindo as penas."
        );
    }

    // Interface Andar

    @Override
    public void andar(int velocidade) {
        System.out.println(
            "O pato caminha bambolejando pela margem a "
            + velocidade + " km/h."
        );
    }

    @Override
    public void correr(int velocidade) {
        System.out.println(
            "O pato corre batendo as asas a "
            + velocidade + " km/h."
        );
    }

    @Override
    public void parar() {
        System.out.println(
            "O pato para na beira do lago e sacode as penas."
        );
    }
}
