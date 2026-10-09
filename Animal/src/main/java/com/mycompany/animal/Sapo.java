/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alunolab11
 */
public class Sapo extends Animal implements Nadar, Andar {

    private String tipoVeneno;

    public Sapo(String nome, double peso, String tipoVeneno) {
        super(nome, peso, "Florestas e regiões úmidas");
        this.tipoVeneno = tipoVeneno;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    @Override
    public void emitirSom() {
        System.out.println("COAX COAX COAX");
    }

    @Override
    public void alimentar() {
        System.out.println(
            "O sapo dispara a língua para capturar insetos no ar."
        );
    }

    // Interface Nadar

    @Override
    public void nadar(String local) {
        System.out.println(
            "O sapo nada com as patas traseiras em " + local + "."
        );
    }

    @Override
    public void mergulhar(int profundidade) {
        System.out.println(
            "O sapo mergulha a " + profundidade
            + " metros para se esconder."
        );
    }

    @Override
    public void emergir() {
        System.out.println(
            "O sapo emerge e salta para uma pedra próxima."
        );
    }

    // Interface Andar

    @Override
    public void andar(int velocidade) {
        System.out.println(
            "O sapo salta lentamente pela floresta a "
            + velocidade + " km/h."
        );
    }

    @Override
    public void correr(int velocidade) {
        System.out.println(
            "O sapo, que possui veneno do tipo "
            + tipoVeneno
            + ", foge saltando rapidamente a "
            + velocidade + " km/h."
        );
    }

    @Override
    public void parar() {
        System.out.println(
            "O sapo para imóvel e se camufla entre as folhas."
        );
    }
}
