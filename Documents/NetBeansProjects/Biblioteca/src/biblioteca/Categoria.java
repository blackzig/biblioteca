/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author MAM
 */
public class Categoria {
    
    private Long                codigo;
    private String              descricao;
    
    private Collection<Livro>   livros;    

    Double                      custo; 
    
    List<String> categoria      = new ArrayList<>();
    List<Double> preco          = new ArrayList<>();
    
    public Double gastoTotal(){
        int tamanhoLista = categoria.size();
        for(int i=0; i<tamanhoLista; i++){
            System.out.println("Categoria: "+categoria.get(i));
            System.out.println("Preço: "+preco.get(i));
            System.out.println("*****************************");
        }
        return custo;
    }
    
    @SuppressWarnings("empty-statement")
    public void separarPorCategoria(){
       Set<Object> seen = new HashSet<>();
        for (Livro p : this.getLivros()) {
            final Livro thisLivro = p;
            class Wrap {
                @Override
                public int hashCode() { return thisLivro.getCategoria().getDescricao().hashCode(); }
                @Override
                public boolean equals(Object o) {
                    Wrap other = (Wrap)o;
                    return other.wrapped().getCategoria().getDescricao().equals(thisLivro.getCategoria().getDescricao());
                }
                public Livro wrapped() { return thisLivro; }
            };
            Wrap wrap = new Wrap();
            if (seen.add(wrap)) {
                //System.out.println(p.getCategoria().getDescricao() + " nova entrada");
                Double precoL = p.getCopia().getPreco();
                categoria.add(p.getCategoria().getDescricao());
                preco.add(precoL);
            } else {
                //System.out.println(p.getCategoria().getDescricao() + " entrada duplicada");
                for(int i=0; i<categoria.size(); i++){
                    String nomeCategoria = categoria.get(i);
                    if(nomeCategoria.equals(p.getCategoria().getDescricao())){
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
