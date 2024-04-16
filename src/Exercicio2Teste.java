import java.util.Scanner;
import java.util.Random;

public class Exercicio2Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] alturas = new double[15];
        Random random = new Random();

        System.out.println("Digite as alturas das 15 pessoas (ex: 1.50, 1.86) ou digite 'teste' para gerar aleatoriamente:");

        int contador = 0;
        while (contador < 15) {
            System.out.print("Altura da pessoa " + (contador + 1) + ": ");
            String input = scanner.nextLine();

            if (input.equals("teste")) {
                while (contador < 15) {
                    alturas[contador] = Math.round((1.50 + (2.00 - 1.50) * random.nextDouble()) * 100.0) / 100.0;
                    System.out.println("Altura da pessoa " + (contador + 1) + ": " + alturas[contador]);
                    contador += 1;
                }
                break;
            } else {
                alturas[contador] = Double.parseDouble(input);
            }

            contador += 1;
        }

        Exercicio2Logica.calcularAlturas(alturas);

        scanner.close();
    }
}
