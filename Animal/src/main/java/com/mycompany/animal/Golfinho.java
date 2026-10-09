/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alunolab11
 */
public class Golfinho extends Animal implements Nadar {

    private String especie;

    public Golfinho(String nome, double peso, String especie) {
        super(nome, peso, "Oceanos e mares");
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public void emitirSom() {
        System.out.println(
            "CLIC CLIC CLIC - utilizando a ecolocalização."
        );
    }

    @Override
    public void alimentar() {
        System.out.println(
            "Utiliza a ecolocalização para localizar e engolir peixes."
        );
    }

    @Override
    public void nadar(String local) {
        System.out.println(
            "O golfinho nada velozmente em " + local + "."
        );
    }

    @Override
    public void mergulhar(int profundidade) {
        System.out.println(
            "O golfinho mergulha a " + profundidade + " metros."
        );
    }

    @Override
    public void emergir() {
        System.out.println(
            "O golfinho salta acima da superfície ao emergir."
        );
    }
}