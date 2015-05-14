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
    
    private HospitalGeral   hospital;
    private Unidade         unidade;
    private BebePrematuro   bebePrematuro;
    private Medico          medico;
    
    private Collection<Bebe> bebes;      
    
    public Double faturamento(){
        System.out.println("this "+this.getNome());
        for(Bebe b: this.getBebes()){
            Double custo = b.getMedico().getValorHora();
            System.out.println("Custo "+custo);
        }
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
     * @return the hospital
     */
    public HospitalGeral getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(HospitalGeral hospital) {
        this.hospital = hospital;
    }

    /**
     * @return the unidade
     */
    public Unidade getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the bebePrematuro
     */
    public BebePrematuro getBebePrematuro() {
        return bebePrematuro;
    }

    /**
     * @param bebePrematuro the bebePrematuro to set
     */
    public void setBebePrematuro(BebePrematuro bebePrematuro) {
        this.bebePrematuro = bebePrematuro;
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
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
