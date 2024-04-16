import java.util.Scanner;

public class Exercicio4Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números e coloque um negativo para calcular:");

        int[] nums = new int[1000];
        int index = 0;
        int num;

        while (true) {
            num = scanner.nextInt();
            if (num >= 0) {
                nums[index] = num;
                index += 1;
            } else {
                break;
            }
        }

        int[] numeros = new int[index];
        System.arraycopy(nums, 0, numeros, 0, index);

        Exercicio4Logica exercicio4 = new Exercicio4Logica();
        exercicio4.contarIntervalos(numeros);
    }
}
