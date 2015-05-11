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
public class Editora {
    
    private String              nome;
    
    private Collection<Livro>   livros;    

    public Double gastoTotal(){
        this.getLivros().stream().forEach((li) -> {
            System.out.println(li.getEditora().getNome());
            System.out.println(li.getCopia().getPreco());
        });
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
