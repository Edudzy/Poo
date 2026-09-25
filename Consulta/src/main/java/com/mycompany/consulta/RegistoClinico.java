/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consulta;

/**
 *
 * @author alunolab11
 */
public class RegistoClinico {
    int id;
    String data, descricao, laudoAnexo;
    boolean finalizado;

    public RegistoClinico(int id, String data, String descricao, String laudoAnexo, boolean finalizado) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLaudoAnexo() {
        return laudoAnexo;
    }
    
    
}
