package main.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //Atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro book : livroList) {
                if(book.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(book);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for (Livro book : livroList) {
                if (book.getAnoPublicacao() >= anoInicial && book.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(book);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for (Livro book : livroList) {
                if (book.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = book;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
    
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);

        System.out.println("");
        System.out.println("--------Pesquisa Por Autor--------");
        System.out.println(catalogoLivros.pesquisarAutor("Autor 4"));
        System.out.println("");

        System.out.println("--------Pesquisa Por Intervalos Anos--------");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println("");
        
        System.out.println("--------Pesquisa Por Titulo--------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println("");
    }


}