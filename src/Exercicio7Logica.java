public class Exercicio7Logica {
    public void calcularTabuada(int n) {
        int multiplicador = 0;
        while (multiplicador <= 10) {
            int resultado = multiplicador * n;
            System.out.println(multiplicador + " * " + n + " = " + resultado);
            multiplicador += 1;
        }
    }
}
