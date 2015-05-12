/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MAM
 */
public class Editora {
    
    private String              nome;
    
    private Collection<Livro>   livros; 
    
    Double                      custo; 
    
    List<String> editora    = new ArrayList<>();
    List<Double> preco      = new ArrayList<>();
    
    public Double gastoTotal(){
        int tamanhoLista = editora.size();
        for(int i=0; i<tamanhoLista; i++){
            System.out.println("editora "+editora.get(i));
            System.out.println("preço "+preco.get(i));
            System.out.println("*****************************");
        }
        return custo;
    }
    
    @SuppressWarnings("empty-statement")
    public void correrListaEditora(){
       Set<Object> seen = new HashSet<>();
        for (Livro p : this.getLivros()) {
            final Livro thisLivro = p;
            class Wrap {
                @Override
                public int hashCode() { return thisLivro.getEditora().getNome().hashCode(); }
                @Override
                public boolean equals(Object o) {
                    Wrap other = (Wrap)o;
                    return other.wrapped().getEditora().getNome().equals(thisLivro.getEditora().getNome());
                }
                public Livro wrapped() { return thisLivro; }
            };
            Wrap wrap = new Wrap();
            if (seen.add(wrap)) {
                //System.out.println(p.getEditora().getNome() + " nova entrada");
                Double precoL = p.getCopia().getPreco();
                editora.add(p.getEditora().getNome());
                preco.add(precoL);
            } else {
               // System.out.println(p.getEditora().getNome() + " entrada duplicada");
                for(int i=0; i<editora.size(); i++){
                    String nomeEditora = editora.get(i);
                    if(nomeEditora.equals(p.getEditora().getNome())){
                        Double pr = preco.get(i);
                        Double valor = pr+pr;
                        preco.remove(i);
                        preco.add(i,valor);                          
                    }
                }//fim do for
            }
        }//for Livro p
        
        gastoTotal(); 
        
        //http://stackoverflow.com/questions/10755632/finding-duplicate-entries-in-collection

    }//fim correListaEditora
    
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
