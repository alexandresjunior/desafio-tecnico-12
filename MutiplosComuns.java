//14. Os Múltiplos em Comum*
//Dados dois números A (ex: 3) e B (ex: 5), crie um laço de repetição que encontre e 
// imprima os *3 primeiros* múltiplos em comum entre eles 
// (dica: um número cujo módulo da divisão por A e por B seja zero ao mesmo tempo).
import java.util.Scanner;

public class MutiplosComuns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Localizador de Múltiplos em Comum ---");
        System.out.print("Digite o primeiro número (A): ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número (B): ");
        int b = sc.nextInt();
        int contador = 0;
        int numeroAtual = 1;
        System.out.println("\nOs 3 primeiros múltiplos em comum de " + a + " e " + b + " são:");
        while (contador < 3) {
            if (numeroAtual % a == 0 && numeroAtual % b == 0) {
                System.out.println((contador + 1) + "º múltiplo: " + numeroAtual);
                contador++;
            }
            numeroAtual++;
        }
        sc.close();
    }
}