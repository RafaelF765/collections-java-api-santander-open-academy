import list.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");

        System.out.println(tarefas.obterNumeroTotalTarefas());
        tarefas.obterDescricaoTarefas();
        tarefas.removerTarefa("tarefa 1");
        System.out.println(tarefas.obterNumeroTotalTarefas());
        tarefas.obterDescricaoTarefas();
    }
}