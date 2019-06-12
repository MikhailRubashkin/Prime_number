import java.util.Scanner;

//Имеется целое число, определить является ли это число простым

public class Main {



    static int var = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        checkIsItANaturalNumber(n);
    }

    private static void checkIsItANaturalNumber(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }

    private static void printIsItNaturalNumber(int var, int n) {
        if (var == n) {
            System.out.println(n + " Число простое.");
        } else {
            System.out.println(n + " Число не является простым.");
        }
    }
}