/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consulta;

/**
 *
 * @author alunolab11
 */
public class Exame{
    String tipo, resultado, imagemAnexo, laboratorio;

    public Exame(String tipo, String resultado, String imagemAnexo, String laboratorio) {
        this.tipo = tipo;
        this.resultado = resultado;
        this.imagemAnexo = imagemAnexo;
        this.laboratorio = laboratorio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
