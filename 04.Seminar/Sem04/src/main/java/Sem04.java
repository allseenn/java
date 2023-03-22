package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> data = new ArrayList<>();
        System.out.println("Введите ФИО, возраст, пол: ");
        while (sc.hasNext()) {
            String[] data2 = new String[5];
            String name = sc.nextLine();
            data2 = name.split(" ");
            data.add(data2);
        }
        for (String[] elem:data) {
            for (int i = 0; i < elem.length; i++) {
                if(i == 1 || i == 2){
                    System.out.print(elem[i].charAt(0) + ". ");
                }
                else System.out.print(elem[i]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        Comparator<String[]> comp = Comparator.comparing (el -> el[4].charAt(0));

        comp = comp.thenComparing(el -> Integer.parseInt(el[3]));
        data.sort(comp);
        
        for (String[] elem:data) {
            for (int i = 0; i < elem.length; i++) {
                if(i == 1 || i == 2){
                    System.out.print(elem[i].charAt(0) + ". ");
                }
                else System.out.print(elem[i]+" ");
            }
            System.out.println();
        }
    }
}
