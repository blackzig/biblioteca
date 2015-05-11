/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MAM
 */
public class Biblioteca {

    private static Map<Long, Livro>         livros;
    private static Map<Long, Categoria>     categorias;
    private static Map<Long, Editora>       editoras;
    private static Map<Long, Copia>         copias;
    private static Map<Long, Autor>         autores;
    
    public static void main(String[] args) {
        try {
            //livro 1
            Copia c1 = new Copia();
            c1.setCodigo(1L);
            c1.setPreco(45.90);
            copias = new HashMap<>();
            copias.put(c1.getCodigo(), c1);

            Editora e1 = new Editora();
            e1.setNome("Elsevier Acadêmico");
            editoras = new HashMap<>();
            editoras.put(c1.getCodigo(), e1);

            Categoria cat1 = new Categoria();
            cat1.setCodigo(1L);
            cat1.setDescricao("Informática");
            categorias = new HashMap<>();
            categorias.put(c1.getCodigo(), cat1);

            Autor a1 = new Autor();
            a1.setNome("Kechi Hirama");
            Long codigoLivro = c1.getCodigo();
            a1.setNacionalidade("Japonês",codigoLivro);
            autores = new HashMap<>();
            autores.put(c1.getCodigo(), a1);

            Livro l1 = new Livro();
            l1.setISBN("978-8535248821");
            l1.setTitulo("Engenharia de Software");
            l1.setAno(2011L);
            l1.setEditora(e1);
            l1.setCopia(c1);
            l1.setCategoria(cat1);
            l1.setAutor(a1);
            e1.getLivros().add(l1);
            c1.getLivros().add(l1);
            cat1.getLivros().add(l1);
            a1.getLivros().add(l1);
            livros = new HashMap<>();
            livros.put(c1.getCodigo(), l1);
            
            e1.gastoTotal();
//******************************************************************************
            //livro 2
            Copia c2 = new Copia();
            c2.setCodigo(2L);
            c2.setPreco(28.41);
            copias = new HashMap<>();
            copias.put(c2.getCodigo(), c2);

            Editora e2 = new Editora();
            e2.setNome("Sextante");
            editoras = new HashMap<>();
            editoras.put(c2.getCodigo(), e2);

            Categoria cat2 = new Categoria();
            cat2.setCodigo(2L);
            cat2.setDescricao("AutoAjuda");
            categorias = new HashMap<>();
            categorias.put(c2.getCodigo(), cat2);

            Autor a2 = new Autor();
            a2.setNome("Johanna Basford");
            Long codigoLivro2 = c2.getCodigo();
            a2.setNacionalidade("Inglesa",codigoLivro2);
            autores = new HashMap<>();
            autores.put(c2.getCodigo(), a2);

            Livro l2 = new Livro();
            l2.setISBN("978-8543101637");
            l2.setTitulo("Jardim Secreto. Livro de Colorir e Caça ao Tesouro Antiestresse");
            l2.setAno(2014L);
            l2.setEditora(e2);
            l2.setCopia(c2);
            l2.setCategoria(cat2);
            l2.setAutor(a2);
            e2.getLivros().add(l2);
            c2.getLivros().add(l2);
            cat2.getLivros().add(l2);
            a2.getLivros().add(l2);
            livros = new HashMap<>();
            livros.put(c2.getCodigo(), l2);
            
            e2.gastoTotal();
            
        } catch (Exception e) {
            System.out.println("erro main "+e.getMessage());
        }
    }
  
}//fim
