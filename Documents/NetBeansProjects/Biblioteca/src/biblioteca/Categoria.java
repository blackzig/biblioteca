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
public class Categoria {
    
    private Long                codigo;
    private String              descricao;
    
    private Collection<Livro>   livros;    

    Double                      custo=0.0; 
    
    public Double gastoTotal(){
        String categoria = this.getDescricao();
        for(Livro li: this.getLivros()){
            if(li.getCategoria().getDescricao().equals(categoria)){
                custo+=li.getCopia().getPreco();
            }
        }
        
        return custo;    
    }
    
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
