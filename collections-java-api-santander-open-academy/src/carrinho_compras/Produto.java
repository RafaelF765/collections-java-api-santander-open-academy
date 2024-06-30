package carrinho_compras;

public class Produto {
    private String descrircao;
    private double preco;

    public Produto(String descrircao, double preco) {
        this.descrircao = descrircao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descrircao='" + descrircao + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getDescrircao() {
        return descrircao;
    }

    public double getPreco() {
        return preco;
    }

}
