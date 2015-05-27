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
public class Especialidade {
  
    private String nome; 
    
    Double         custo=0.0;
    
    private Collection<Medico> medicos;    
    
    public Double faturamento(){
        String especialidade = this.getNome();
        for(Medico me: this.getMedicos()){
            if(me.getEspecialidade().getNome().equals(especialidade)){
                custo+=me.getValorHora();
            }
        }
        return custo;         
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
     * @return the medicos
     */
    public Collection<Medico> getMedicos() {
        if (this.medicos == null) {
            this.setMedicos(new ArrayList<>());
        }               
        return medicos;
    }

    /**
     * @param medicos the medicos to set
     */
    public void setMedicos(Collection<Medico> medicos) {
        this.medicos = medicos;
    }
    
}
