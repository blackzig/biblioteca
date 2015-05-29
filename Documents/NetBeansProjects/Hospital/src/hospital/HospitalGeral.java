/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author MAM
 */
public class HospitalGeral {
 
    private String nome;
    
    Double         custo=0.0;    
    
    private Collection<Medico>  medicos;     
    
    private Collection<Bebe>    bebes;       
    
    public Double faturamento(){
        
        for(Medico me: this.getMedicos()){
            String CRM = me.getCRM();
            Double custoA = valorPartoEspecialidade(CRM);  
            custo+=custoA;
        }
        return custo;   
    }
    
    public Double valorPartoEspecialidade(String $CRM){
                
        Double valorTotalParto=0.0;
       
        for(Bebe be: this.getBebes()){ 
   
            if(be.getMedico().getCRM().equals($CRM)){
                
                Long duracaoParto       = be.getParto().getDuracaoHoras();
                Double valorHoraMedico  = be.getMedico().getValorHora();
                Double valorParto       =  valorHoraMedico*duracaoParto;
                
                if(be.getParto().getComplicado().equals(TRUE)){
                    Double valorPartoComplicado = (valorParto*20)/100;                 
                    valorTotalParto             = valorParto+valorPartoComplicado;
                }
                else{
                    valorTotalParto             = valorParto;                    
                }
                System.out.println("-----------------------------------------------------------");
            }
        }
        return valorTotalParto;
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


}
