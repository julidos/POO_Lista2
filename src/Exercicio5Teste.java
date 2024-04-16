import java.util.Scanner;

public class Exercicio5Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números (digite 0 para encerrar):");

        int[] nums = new int[1000];
        int index = 0;
        int num;

        while (true) {
            num = scanner.nextInt();
            nums[index] = num;
            index += 1;
            if (num == 0) {
                break;
            }
        }

        int[] numeros = new int[index];
        System.arraycopy(nums, 0, numeros, 0, index);

        Exercicio5Logica exercicio5 = new Exercicio5Logica();
        exercicio5.calcularEstatisticas(numeros);
    }
}
