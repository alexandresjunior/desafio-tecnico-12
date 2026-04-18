/*7. O Rastreador de Primo*
Dado um número N, crie um laço que verifique se ele é um número primo 
(ou seja, se ele é divisível apenas por 1 e por ele mesmo). Imprima "É primo" ou "Não é primo". */

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        int numero = sc.nextInt();

        if (num1(numero)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

        sc.close();
    }

    public static boolean num1(int numero) {
        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }

        return true;
    }
}