import java.util.Scanner;

public class Exercicio7Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 para calcular a tabuada:");
        int n = scanner.nextInt();

        Exercicio7Logica exercicio7 = new Exercicio7Logica();
        exercicio7.calcularTabuada(n);
    }
}
