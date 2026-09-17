/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo160926;

/**
 *
 * @author alunolab11
 */
public class Círculo extends Figura{
    double raio;
    public Círculo(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        double area = 0;
        area = 3.14 * raio * raio;
        return area;
    }
}
