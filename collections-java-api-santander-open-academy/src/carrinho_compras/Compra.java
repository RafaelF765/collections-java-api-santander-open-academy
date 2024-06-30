package carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Item> compras;

    public Compra() {
        this.compras = new ArrayList<>();
    }

    public void adicinarProduto(String produto, double preco,  int quantidade){
        this.compras.add(new Item(new Produto(produto, preco), quantidade));
    }

    public void obterlistaCompras(){
        for (Item itens: compras){
            System.out.println(itens.getProduto());
        }
    }

    public double obterSubTotal(){
        double subtotal = 0;
        for (Item itens : compras){
            subtotal += itens.somaTotal();
        }
        return subtotal;
    }
}
