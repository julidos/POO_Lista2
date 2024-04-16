public class Exercicio1Logica {
    public int somar() {
        int soma = 0;
        int num = 0;

        while (num <= 500) {
            if (num % 2 != 0) {
                if (num % 3 == 0) {
                    soma += num;
                }
            }
            num += 1;
        }

        return soma;
    }
}