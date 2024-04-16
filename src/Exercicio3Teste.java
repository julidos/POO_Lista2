import java.util.Scanner;

public class Exercicio3Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números (digite 0 para fazer o calculo):");

        int[] nums = new int[1000];
        int index = 0;
        int num;

        while (true) {
            num = scanner.nextInt();
            if (num != 0) {
                nums[index] = num;
                index += 1;
            } else {
                break;
            }
        }

        int[] numeros = new int[index];
        System.arraycopy(nums, 0, numeros, 0, index);

        Exercicio3Logica exercicio3 = new Exercicio3Logica();
        exercicio3.calcularEstatisticas(numeros);
    }
}
