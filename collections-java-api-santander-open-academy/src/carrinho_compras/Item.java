package carrinho_compras;

public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double somaTotal(){
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
