/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author MAM
 */
public class HospitalGeral {
 
    private String nome;
    
    private Collection<Especialidade> especialidades;       
    
    public Double faturamento(){
        return 0.0;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especialidades
     */
    public Collection<Especialidade> getEspecialidades() {
        if (this.especialidades == null) {
            this.setEspecialidades(new ArrayList<>());
        }        
        return especialidades;
    }

    /**
     * @param especialidades the especialidades to set
     */
    public void setEspecialidades(Collection<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
    
}
