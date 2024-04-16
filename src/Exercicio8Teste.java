import java.util.Scanner;

public class Exercicio8Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial:");
        int n = scanner.nextInt();

        Exercicio8Logica exercicio8 = new Exercicio8Logica();
        exercicio8.calcularFatorial(n);
    }
}
