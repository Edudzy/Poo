/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;


import java.util.Arrays;
import java.util.List;


/**
 *
 * @author alunolab11
 */
public class ReinoAnimal {

    public static void separador(String titulo) {
        System.out.println();
        System.out.println("========================================");
        System.out.println(" " + titulo);
        System.out.println("========================================");
    }

    public static void main(String[] args) {

        // 1. Instanciação dos animais

        Aguia aguia = new Aguia("Águia-real", 6.5, 2.3);

        Golfinho golfinho = new Golfinho(
            "Golfinho-nariz-de-garrafa",
            200.0,
            "Tursiops truncatus"
        );

        Leão leao = new Leão(
            "Leão-africano",
            190.0,
            "Rei da Savana"
        );

        Pato pato = new Pato("Pato-real", 1.5);

        Sapo sapo = new Sapo(
            "Sapo-cururu",
            0.8,
            "Neurotóxico"
        );

        // 2. Lista de animais

        List<Animal> animais = Arrays.asList(
            aguia, golfinho, leao, pato, sapo
        );

        // 3. Exibição das fichas

        separador("FICHAS DOS ANIMAIS");

        for (Animal animal : animais) {
            animal.exibirFicha();
            System.out.println("--------------------");
        }

        // 4. Polimorfismo: emissão de sons

        separador("SONS DOS ANIMAIS");

        for (Animal animal : animais) {
            System.out.print(animal.getNome() + ": ");
            animal.emitirSom();
        }

        // 5. Polimorfismo: alimentação

        separador("ALIMENTAÇÃO DOS ANIMAIS");

        for (Animal animal : animais) {
            System.out.print(animal.getNome() + ": ");
            animal.alimentar();
        }

        // 6. Polimorfismo com a interface Voar

        separador("CAPACIDADE DE VOAR");

        List<Voar> voadores = Arrays.asList(aguia, pato);

        for (Voar voador : voadores) {
            voador.decolar();
            voador.voar("Vale Verde");
            voador.pousar();
            System.out.println("--------------------");
        }

        // 7. Polimorfismo com a interface Nadar

        separador("CAPACIDADE DE NADAR");

        List<Nadar> nadadores = Arrays.asList(
            golfinho, pato, sapo
        );

        for (Nadar nadador : nadadores) {
            nadador.nadar("Lago Azul");
            nadador.mergulhar(5);
            nadador.emergir();
            System.out.println("--------------------");
        }

        // 8. Polimorfismo com a interface Andar

        separador("CAPACIDADE DE ANDAR");

        List<Andar> terrestres = Arrays.asList(
            leao, pato, sapo
        );

        for (Andar terrestre : terrestres) {
            terrestre.andar(5);
            terrestre.correr(30);
            terrestre.parar();
            System.out.println("--------------------");
        }

        // 9. Verificação de capacidades com instanceof

        separador("MAPA DE CAPACIDADES");

        System.out.printf(
            "%-25s | %-8s | %-8s | %-8s%n",
            "Animal", "Voa", "Nada", "Anda"
        );

        System.out.println(
            "------------------------------------------------------"
        );

        for (Animal animal : animais) {

            boolean voa = animal instanceof Voar;
            boolean nada = animal instanceof Nadar;
            boolean anda = animal instanceof Andar;

            System.out.printf(
                "%-25s | %-8s | %-8s | %-8s%n",
                animal.getNome(),
                voa ? "Sim" : "Não",
                nada ? "Sim" : "Não",
                anda ? "Sim" : "Não"
            );
        }

        
    }
}