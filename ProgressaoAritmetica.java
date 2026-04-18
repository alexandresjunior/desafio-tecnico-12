
public class ProgressaoAritmetica{

    public static void main(String[] args) {
        int inicio = 2;
        int razao = 3;
        int limite = 20;

        int termoAtual = inicio;

        System.out.println("Termos da PA:");

        while (termoAtual <= limite) {
            System.out.print(termoAtual + " ");
            termoAtual = termoAtual + razao;

        }
    }
}