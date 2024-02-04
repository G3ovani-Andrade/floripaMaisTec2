package exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> teachers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        while (keep){
            System.out.println("Digite o nome do curso/professor ou 0 para Sair");
            String entry = sc.nextLine();
            if(entry.equals("0")) keep = false;
            else{
                System.out.println("1 - Add Curso 2 - add Professor");
                String option = sc.nextLine();
                if(option.equals("1")){
                    addCourse(entry,courses);
                } else if (option.equals("2")) {
                    addTeacher(entry,teachers);
                }else{
                    System.out.println("Digite um valor válido");
                }
            }
        }
        System.out.println("Cursos");
        list(courses);
        System.out.println("Professores");
        list(teachers);
    }

    private static void addCourse(String courseName, List<String> list){
        list.add(courseName);
    }
    private static void addTeacher(String teacherName, List<String> list){
        list.add(teacherName);
    }
    private static void list(List<String> list){
        list.forEach(System.out::println);
    }
}
