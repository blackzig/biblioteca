/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author MAM
 */
public class Livro {
    private String  ISBN;
    private String  titulo;
    private Long    ano;
    
    private Copia       copia;
    private Editora     editora;
    private Categoria   categoria;
    private Autor       autor;
    
    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ano
     */
    public Long getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Long ano) {
        this.ano = ano;
    }

    /**
     * @return the copia
     */
    public Copia getCopia() {
        return copia;
    }

    /**
     * @param copia the copia to set
     */
    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    /**
     * @return the editora
     */
    public Editora getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
}
