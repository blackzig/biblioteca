/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MAM
 */
public class Autor {
    
    private String                      nome;
    
    private Collection<Livro>           livros;
    
    private Map<Long, Nacionalidade>    nacionalidades;    

    public void setNacionalidade(String nac, Long codigoLivro){
        Nacionalidade n1 = new Nacionalidade();
        n1.setNome(nac);  
        nacionalidades = new HashMap<>();
        nacionalidades.put(codigoLivro, n1);
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
     * @return the livros
     */
    public Collection<Livro> getLivros() {
        if (this.livros == null) {
            this.setLivros(new ArrayList<>());
        }              
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void setLivros(Collection<Livro> livros) {
        this.livros = livros;
    }

}
