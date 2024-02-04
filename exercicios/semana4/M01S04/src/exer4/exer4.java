package exer4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class exer4 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> courses = new ArrayList<>();
    private static String selectedList;
    private static ArrayList<String> teachers = new ArrayList<>();
    private static ArrayList<String> completedCourses = new ArrayList<>();
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
                case "4":
                    markCompleted();
                    break;
                case "5":
                    list();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }

    private static void markCompleted() {
        String index = listarPedirIndice();
        completedCourses.add(courses.get(Integer.parseInt(index)));
        removerItem(index);
    }

    private static String listarPedirIndice() {
        list();
        System.out.println("Escoha um dos identificadores");
        return sc.nextLine();
    }
    private static void removerItemLista(){
        removerItem(listarPedirIndice());
    }
    private static void removerItem(String index) {
        if (selectedList.equals("cursos")){
            courses.remove(Integer.parseInt(index));
        }else if (selectedList.equals("teachers")){
            teachers.remove(Integer.parseInt(index));
        } else if (selectedList.equals("completedCourse")) {

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
        System.out.println("1 - Cursos 2 - professores 3 - concluídos");
        String option = sc.nextLine();
        if (option.equals("1")){
            selectedList = "cursos";
            IntStream.range(0,courses.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,courses.get(i)));
        } else if (option.equals("2")) {
            selectedList = "teachers";
            IntStream.range(0,teachers.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,teachers.get(i)));
        }else if (option.equals("3")) {
            selectedList = "completedCourse";
            IntStream.range(0,completedCourses.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,completedCourses.get(i)));
        }else {
            System.out.println("Opção inválida");
        }
    }
    private static void menu(){
        System.out.println("Bem vindo ao sistema");
        System.out.println("1 - Listar");
        System.out.println("2 - Adicionar");
        System.out.println("3 - Remover");
        System.out.println("4 - Marcar como conluído");
        System.out.println("5 - Listar concluídos");
        System.out.println("0 - Sair");
    }
}
