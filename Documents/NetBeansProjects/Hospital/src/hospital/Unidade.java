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
public class Unidade {
    
    private Long codigo;
    private String nome;

    private Collection<Medico> medicos;     
    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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
