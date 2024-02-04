package exer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class exer3 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> courses = new ArrayList<>();
    private static ArrayList<String> teachers = new ArrayList<>();
    public static void main(String[] args) {


        boolean keep = true;
        while (keep){
            menu();
            String entry = sc.nextLine();
            switch (entry){
                case "0":
                    keep = false;
                    break;
                case "1":
                    list();
                    break;
                case "2":
                    toAdd();
                    break;
                case "3":
                    removerItemLista();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }

    private static String listarPedirIndice() {
        System.out.println("Escoha um dos identificador para excluir");
        list();
        return sc.nextLine();
    }
    private static void removerItemLista(){
        removerItem(listarPedirIndice());
    }
    private static void removerItem(String index) {
        System.out.println("De qual Lista deseja remover o item");
        System.out.println("1 - Cursos 2 - Professores");
        String type = sc.nextLine();
        if (type.equals("1")){
            courses.remove(Integer.parseInt(index));
        }else if (type.equals("2")){
            teachers.remove(Integer.parseInt(index));
        }else {
            System.out.println("Opção inválida");
        }

    }

    private static void toAdd(){
        System.out.println("1 - Add Curso 2 - add Professor");
        String option = sc.nextLine();
        System.out.println("Digite o nome a ser adicionado");
        if(option.equals("1")){
            courses.add(sc.nextLine());
        } else if (option.equals("2")) {
            teachers.add(sc.nextLine());
        }else{
            System.out.println("Digite um valor válido");
        }
    }
    private static void list(){
        System.out.println("\nCursos: ");
        IntStream.range(0,courses.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,courses.get(i)));
        System.out.println("\nProfessores: ");
        IntStream.range(0,teachers.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,teachers.get(i)));
    }
    private static void menu(){
        System.out.println("Bem vindo ao sistema");
        System.out.println("1 - Listar");
        System.out.println("2 - Adicionar");
        System.out.println("3 - Remover");
        System.out.println("0 - Sair");
    }
}
