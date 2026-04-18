//Desafio 11 O previsor de ano Bissexto
import java.util.Scanner;
public class Previsor_anobissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano = 0;
        int anos_encontrados = 0;
        System.out.print("Digite o Ano:");
        ano = scanner.nextInt();

        while (anos_encontrados < 5) {
            ano++;
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println("Ano bissexto: " + ano);
                anos_encontrados++;
            }
        }

        scanner.close();
    }
}