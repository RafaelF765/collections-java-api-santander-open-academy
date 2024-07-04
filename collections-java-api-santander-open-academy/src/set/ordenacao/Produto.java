package set.ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto( long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
