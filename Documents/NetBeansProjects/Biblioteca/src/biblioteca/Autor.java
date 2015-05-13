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
public class Autor {
    
    private String                      nome;
    
    private Collection<Livro>           livros;
    
    private Map<Long, Nacionalidade>    nacionalidades;    
    
    Double                              custo; 
    
    List<String> autor    = new ArrayList<>();
    List<Double> preco      = new ArrayList<>();
    
    public Double gastoTotal(){
        int tamanhoLista = autor.size();
        for(int i=0; i<tamanhoLista; i++){
            System.out.println("Autor: "+autor.get(i));
            System.out.println("Preço: "+preco.get(i));
            System.out.println("*****************************");
        }
        return custo;
    }
    
    @SuppressWarnings("empty-statement")
    public void separarPorAutor(){
       Set<Object> seen = new HashSet<>();
        for (Livro p : this.getLivros()) {
            final Livro thisLivro = p;
            class Wrap {
                @Override
                public int hashCode() { return thisLivro.getAutor().getNome().hashCode(); }
                @Override
                public boolean equals(Object o) {
                    Wrap other = (Wrap)o;
                    return other.wrapped().getAutor().getNome().equals(thisLivro.getAutor().getNome());
                }
                public Livro wrapped() { return thisLivro; }
            };
            Wrap wrap = new Wrap();
            if (seen.add(wrap)) {
                //System.out.println(p.getEditora().getNome() + " nova entrada");
                Double precoL = p.getCopia().getPreco();
                autor.add(p.getAutor().getNome());
                preco.add(precoL);
            } else {
               // System.out.println(p.getEditora().getNome() + " entrada duplicada");
                for(int i=0; i<autor.size(); i++){
                    String nomeAutor = autor.get(i);
                    if(nomeAutor.equals(p.getAutor().getNome())){
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

    }//fim separarPorEditora    

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
