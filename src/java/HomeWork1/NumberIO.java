package HomeWork1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NumberIO {

    private static Integer[] numbers;

    static void readNumbersMethod(int n){

        Scanner scanner=new Scanner(System.in);
        numbers=new Integer[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Introduceti numarul " + (i + 1) + ": ");

                try {
                    numbers[i] = scanner.nextInt();
                }catch (NoSuchElementException e){
                    System.out.println("Introduceti un numar:");
                    scanner.nextLine();
                    i--;
                }
            }


    }

    static void printObjects(Object[] objects){

        for(Object o:objects){
            System.out.print(o+" ");
        }


    }

    public static void main(String[] args){

        System.out.print("Hello world!");
        System.out.println("Introduceti 6 numere");
        readNumbersMethod(6);
        printObjects(numbers);

    }

}
