package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa>tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
    List<Tarefa>tafarefasRemover = new ArrayList<>();
    for (Tarefa tarefas: tarefaList){
        if (tarefas.getDescricao().equalsIgnoreCase(descricao)){
            tafarefasRemover.add(tarefas);
        }
    }
       tarefaList.removeAll(tafarefasRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
       for (Tarefa tarefas: tarefaList){
           System.out.println(tarefas.getDescricao());
       }
    }
}
