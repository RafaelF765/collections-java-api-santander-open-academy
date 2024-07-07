package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    public void exibirContato(){
        System.out.println(agendaContatos);
    }

    public void removerContato(String nome){
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }
    public Integer pesquisaPorNome(String nome){
        Integer porNome = null;
        if (!agendaContatos.isEmpty()){
            porNome = agendaContatos.get(nome);
        }
        return porNome;
    }
}
