/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo110926part2;

/**
 *
 * @author alunolab11
 */
public class Quadrado {
    double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    public double calcularArea(){
        double area = 0;
        area = lado * lado;
        return area;
    }
}
