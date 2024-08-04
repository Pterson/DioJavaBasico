package main.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private static Set<Produto> produtoSet;

public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
}
    
public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {

    produtoSet.add(new Produto(codigo, nome, preco, quantidade));
}    

public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
}

public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
}

public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    System.out.println("");
    System.out.println("--------------------------------------------------------------------");
    cadastroProdutos.adicionarProduto(1, "Produto 5", 15d, 5);
    cadastroProdutos.adicionarProduto(2, "Produto 0", 20d, 10);
    cadastroProdutos.adicionarProduto(1, "Produto 3", 10d, 2);
    cadastroProdutos.adicionarProduto(9, "Produto 9", 2d, 2);
    
    System.out.println(CadastroProdutos.produtoSet);

    System.out.println("");
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    System.out.println("");
    System.out.println(cadastroProdutos.exibirProdutosPorNome());
    System.out.println("--------------------------------------------------------------------");
    System.out.println("");
}
    
}
