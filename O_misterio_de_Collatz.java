//Dado um número inicial N (ex: 10). Crie um laço while que imprima a sequência de 
// Collatz até que N vire 1. A regra é: se N for par, divida por 2; se N for ímpar,
//  multiplique por 3 e some 1.

import java.util.Scanner;

public class O_misterio_de_Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        while (numero != 1) {
            if (numero % 2 == 0) {
                int calculo1 = numero/2;
                numero = calculo1;
            }else if (numero % 2 == 1) {
                int calculo2 = (numero * 3) +1;
                numero = calculo2;
            }
            System.out.println(numero);
        }

        scanner.close();
    }
}
