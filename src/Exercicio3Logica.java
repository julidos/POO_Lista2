public class Exercicio3Logica {
    public void calcularEstatisticas(int[] numeros) {
        int total = numeros.length;
        int soma = 0;
        int positivos = 0;
        int negativos = 0;
        int index = 0;

        while (index < total) {
            int num = numeros[index];
            soma += num;
            if (num > 0) {
                positivos += 1;
            } else if (num < 0) {
                negativos += 1;
            }
            index += 1;
        }

        double media = (double) soma / total;
        double percentualPositivos = (double) positivos / total * 100;
        double percentualNegativos = (double) negativos / total * 100;

        System.out.println("Média aritmética dos valores lidos: " + media);
        System.out.println("Quantidade de valores positivos: " + positivos);
        System.out.println("Quantidade de valores negativos: " + negativos);
        System.out.println("Percentual de valores positivos: " + percentualPositivos + "%");
        System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");
    }
}
