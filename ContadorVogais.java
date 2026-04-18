public class ContadorVogais {
    public static void main(String[] args) {
        String palavra = "programacao";
        int totalVogais = 0;

        for (int i = 0; i < 11; i++) {
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                totalVogais++;
            }
        }

        System.out.println("Total de vogais: " + totalVogais);
    }
}