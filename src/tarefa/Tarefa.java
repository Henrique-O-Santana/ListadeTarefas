package tarefa;

import java.lang.reflect.Array;

public class Tarefa {
    private String tarefas[];

    public void addTarefa(String tarefa){
        for (int i = 0; i <= tarefas.length; i++) {
            if (tarefas[i].isEmpty()){
                tarefas[i] = tarefa;
            }
        }
    }
    public void deleteTarefa(String tarefa){
        for (int i = 0; i <= tarefas.length; i++) {
            if (tarefas[i].isEmpty()){
                tarefas[i] = tarefa;
            }
        }
    }
    public void listTarefa(){
        for (int i = 0; i < tarefas.length; i++) {
            System.out.println("["+i+1+"] "+tarefas[i]);
        }
    }
}
