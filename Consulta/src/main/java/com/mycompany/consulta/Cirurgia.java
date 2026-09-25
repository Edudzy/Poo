/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consulta;

/**
 *
 * @author alunolab11
 */
public class Cirurgia {
    int duracao;
    String sala, anestesia;
    String equipe, medicamentos;

    public Cirurgia(int duracao, String sala, String anestesia, String equipe, String medicamentos) {
        this.duracao = duracao;
        this.sala = sala;
        this.anestesia = anestesia;
        this.equipe = equipe;
        this.medicamentos = medicamentos;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public String getSala() {
        return sala;
    }
    
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
}    
    
    
    
    


