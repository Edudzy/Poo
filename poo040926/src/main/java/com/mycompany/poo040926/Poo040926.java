/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo040926;

/**
 *
 * @author alunolab11
 */
public class Poo040926 {

    public static void main(String[] args) {
        Curso c1 = new Curso("CC3N", "Ciencia da comuputação");
        Aluno a1 = new Aluno("Fulano",2024093028,c1);
        
        System.out.println("O aluno " + a1.getNome()+ 
                "com matricula: "+ a1.getMatricula() + 
                "Mais o curso: "+ a1.getCurso().getNome());
    }
}

