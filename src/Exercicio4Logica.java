public class Exercicio4Logica {
    public void contarIntervalos(int[] numeros) {
        int[] intervalos = new int[4];
        int index = 0;

        while (index < numeros.length) {
            int num = numeros[index];
            if (num < 0) {
                break;
            }
            if (num >= 0 && num <= 25) {
                intervalos[0] += 1;
            } else if (num >= 26 && num <= 50) {
                intervalos[1] += 1;
            } else if (num >= 51 && num <= 75) {
                intervalos[2] += 1;
            } else if (num >= 76 && num <= 100) {
                intervalos[3] += 1;
            }
            index += 1;
        }

        System.out.println("Quantidade de números nos intervalos:");
        System.out.println("[0-25]: " + intervalos[0]);
        System.out.println("[26-50]: " + intervalos[1]);
        System.out.println("[51-75]: " + intervalos[2]);
        System.out.println("[76-100]: " + intervalos[3]);
    }
}
