/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author MAM
 */
public class Nacionalidade {
    
    private String nome;
    
    private Collection<Autor> autores;    

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
     * @return the autores
     */
    public Collection<Autor> getAutores() {
        if (this.autores == null) {
            this.setAutores(new ArrayList<>());
        }                
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(Collection<Autor> autores) {
        this.autores = autores;
    }
    
}
