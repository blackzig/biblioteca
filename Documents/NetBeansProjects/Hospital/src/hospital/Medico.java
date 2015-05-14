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
public class Medico {
 
    private String CRM;
    private String nome;
    private String celular;
    private Double valorHora;
    
    private Collection<Bebe> bebes;    
    private Collection<Especialidade> especialidades; 
       
    public void setarListaBebeParaEspecialidade(){
        Especialidade e = new Especialidade();
        e.setBebes(this.getBebes());

        for(Especialidade e1: this.getEspecialidades()){
          //  System.out.println("es "+e1.getNome());
            e.setNome(e1.getNome());
            e.faturamento();
        }
    }
    
    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
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
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the valorHora
     */
    public Double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the bebes
     */
    public Collection<Bebe> getBebes() {
        if (this.bebes == null) {
            this.setBebes(new ArrayList<>());
        }        
        return bebes;
    }

    /**
     * @param bebes the bebes to set
     */
    public void setBebes(Collection<Bebe> bebes) {
        this.bebes = bebes;
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
