/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consulta;

/**
 *
 * @author alunolab11
 */
public class Consulta {
    String motivo, prescricao, dataRetorno;

    public Consulta(String motivo, String prescricao, String dataRetorno) {
        this.motivo = motivo;
        this.prescricao = prescricao;
        this.dataRetorno = dataRetorno;
    }

    public String getMotivo() {
        return motivo;
    }
    
    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
}
