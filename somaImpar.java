import java.util.Scanner;

public class somaImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares de 1 até " + N + " é: " + soma);

        scanner.close();
    }
}