package set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return numero == contato.numero && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
