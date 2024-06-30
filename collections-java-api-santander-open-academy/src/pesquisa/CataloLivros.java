package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CataloLivros {
    private List<Livro>livroList;

    public CataloLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livros : livroList){
                if (livros.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livros);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livros : livroList){
                if (livros.getAnoPublicacao()>=anoInicial && livros.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(livros);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

     public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro livros: livroList){
                if (livros.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livros;
                    break;
                }
            }
        }
        return livroPorTitulo;
     }
}

