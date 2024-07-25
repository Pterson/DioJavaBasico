package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }            
        }
        tarefaList.removeAll(tarefasParaRemover);        
    }    

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);    
    }

    public static void main(String[] args) {
        
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("------------------------------------------");
        System.out.println("");

        //Adicionando tarefas
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        //Removendo tarefas
        listaTarefa.removerTarefa("Tarefa 3");

        //Obtendo tarefas
        listaTarefa.obterDescricaoTarefas();

        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("------------------------------------------");
        System.out.println("");
        
        
    }
}