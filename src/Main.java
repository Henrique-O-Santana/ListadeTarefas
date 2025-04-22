import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int opc;
        do{
            System.out.println("[1] Listar tarefas");
            System.out.println("[2] Adicionar nova tarefa");
            System.out.println("[3] Excluir tarefas");
            System.out.println("[0] Sair");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    if (tarefas.isEmpty()){
                        System.out.println("Não há nenhuma tarefa cadastrada");
                    }
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("["+(i+1)+"] " + tarefas.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Qual tarefa deseja adicionar?");
                    tarefas.add(sc.next());
                    break;
                case 3:
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("["+(i+1)+ "] " + tarefas.get(i));
                    }
                    System.out.println("Qual tarefa deseja remover?");
                    tarefas.remove(sc.nextInt()-1);
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Digite um numero valido");
                    break;
            }
        }while (opc!=0);
    }
}