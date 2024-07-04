package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato>agendaContato;

    public AgendaContatos() {
        this.agendaContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        this.agendaContato.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(agendaContato);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato>contatoPorNome = new HashSet<>();
        for (Contato contato : agendaContato){
            if (contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato  contato: agendaContato){
            if(contato.getNome().equalsIgnoreCase(nome)){
               contato.setNumero(numero);
               contatoAtualizado = contato;
               break;

            }
        }
        return contatoAtualizado;
    }

}
