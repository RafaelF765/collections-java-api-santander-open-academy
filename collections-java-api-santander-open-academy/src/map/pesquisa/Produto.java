package map.pesquisa;

public class Produto {
    private String nome;
    private int quantiddade;
    private double preco;

    public Produto(String nome, int quantiddade, double preco) {
        this.nome = nome;
        this.quantiddade = quantiddade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantiddade=" + quantiddade +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getQuantiddade() {
        return quantiddade;
    }

    public double getPreco() {
        return preco;
    }
}
