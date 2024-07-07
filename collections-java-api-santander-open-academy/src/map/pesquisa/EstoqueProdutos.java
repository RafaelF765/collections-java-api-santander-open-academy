package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome,quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double calcularEstoque(){
        double totalEstoque =0;

        if(!estoqueProdutos.isEmpty()){
            for(Produto produto :estoqueProdutos.values()){
                totalEstoque += produto.getQuantiddade()* produto.getPreco();
            }
        }
        return totalEstoque;
    }

    public Produto obterMaisCaro(){
        Produto maisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto produto : estoqueProdutos.values()){
                if(produto.getPreco() > maiorPreco){
                    maisCaro = produto;
                }
            }
        }
        return maisCaro;
    }

    public Produto obterMaisBarato(){
        Produto maisBarato = null;
        double menorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto produto : estoqueProdutos.values()){
                if(produto.getPreco() < menorPreco){
                    maisBarato = produto;
                }
            }
        }
        return maisBarato;
    }



}
