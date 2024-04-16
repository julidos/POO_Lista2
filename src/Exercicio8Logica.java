public class Exercicio8Logica {
    public void calcularFatorial(int n) {
        int resultado = 1;
        int num = n;
        while (num > 1) {
            resultado *= num;
            num -= 1;
        }
        System.out.println(n + "! = " + resultado);
    }
}
