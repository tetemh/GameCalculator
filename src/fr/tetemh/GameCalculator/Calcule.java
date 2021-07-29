package fr.tetemh.GameCalculator;

import java.util.Scanner;

public class Calcule {

    private static int cal;

    public static void main(String[] args){
        try(Scanner scaner = new Scanner(System.in)){
            int cal1 = (int) (Math.random() * 151);
            int cal2 = (int) (Math.random() * 151);
            System.out.print("Veuiller choisire un opérateur -> ");
            String ope = scaner.nextLine();

            switch (ope) {
                case "+": {
                    cal = cal1 + cal2;
                    break;
                }
                case "-": {
                    cal = cal1 - cal2;
                    break;
                }
                case "*": {
                    cal = cal1 * cal2;
                    break;
                }
                case "/": {
                    cal = cal1 / cal2;
                    break;
                }
                default:
                    return;
            }

            System.out.println("--- Calule vite ---");
            System.out.println(cal1 + ope + cal2);
            String rep = scaner.nextLine();
            System.out.println("La réponse est -> " + cal);
        }

    }

}
