/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author MAM
 */
public class Mae {
    
    private String nome;
    private String endereco;
    private String telefone;
    private Date dataNascimento;
    
    private Collection<Bebe> bebes;

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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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
