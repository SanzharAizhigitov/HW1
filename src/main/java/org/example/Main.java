
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String manyWords;
        final int num = 3;
        String word = "anyValue";
        manyWords = num + word;
        System.out.println(manyWords +"|"+num +"|"+ word);

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.printf("Name: %s  \n", name);
        in.close();
        if (num > 0){
            System.out.println("Вы сохранили положительное число.");
        }
        if (num < 0){
            System.out.println("Вы сохранили отрицательное число.");
        }
        else {
            System.out.println("Вы сохранили ноль.");
        }
    }
}