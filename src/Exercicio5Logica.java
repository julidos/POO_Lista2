public class Exercicio5Logica {
    public void calcularEstatisticas(int[] numeros) {
        int pares = 0;
        int impares = 0;
        int somaPares = 0;
        int total = 0;
        int index = 0;

        while (numeros[index] != 0) {
            int num = numeros[index];
            if (num % 2 == 0) {
                pares += 1;
                somaPares += num;
            } else {
                impares += 1;
            }
            total += num;
            index += 1;
        }

        double mediaPares = (double) somaPares / pares;
        double mediaGeral = (double) total / (pares + impares);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("Média de valores pares: " + mediaPares);
        System.out.println("Média geral dos números lidos: " + mediaGeral);
    }
}
