package exer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class exer2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> teachers = new ArrayList<>();


        boolean keep = true;
        while (keep){
            menu();
            String entry = sc.nextLine();
            switch (entry){
                case "0":
                    keep = false;
                    break;
                case "1":
                    list(courses,teachers);
                    break;
                case "2":
                    toAdd(courses,teachers);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }

    private static void toAdd(List<String> courses, List<String> teachers){
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
    private static void list(List<String> courses, List<String> teachers){
        System.out.println("\nCursos: ");
        IntStream.range(0,courses.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,courses.get(i)));
        System.out.println("\nProfessores: ");
        IntStream.range(0,teachers.size()).forEach(i -> System.out.printf("Id: %d nome: %s \n",i,teachers.get(i)));
    }
    private static void menu(){
        System.out.println("Bem vindo ao sistema");
        System.out.println("1 - Listar");
        System.out.println("2 - Adicionar");
        System.out.println("0 - Sair");
    }
}
