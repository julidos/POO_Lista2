public class Exercicio2Logica {
    public static void calcularAlturas(double[] alturas) {
        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        int contador = 1;
        while (contador < alturas.length) {
            if (alturas[contador] < menorAltura) {
                menorAltura = alturas[contador];
            }
            if (alturas[contador] > maiorAltura) {
                maiorAltura = alturas[contador];
            }
            contador += 1;
        }

        System.out.println("Menor altura: " + menorAltura + " metros");
        System.out.println("Maior altura: " + maiorAltura + " metros");
    }
}
