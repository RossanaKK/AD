public class NumericalUtilities {

    public static void powerOf(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }

    public static void sumOfNaturalNumbersUpTo(int valorLimite) {
        int soma = 0;
        for (int i = 1; i <= valorLimite; i++) {
            soma += i;
        }
        System.out.println("Soma até " + valorLimite + " = " + soma);
    }
    public static void sumOfNaturalNumbersBetween(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        System.out.println("Soma entre " + inicio + " e " + fim + " = " + soma);
    }

    public static void sumOfEvenNumbersBetween(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("Soma dos pares entre " + inicio + " e " + fim + " = " + soma);
    }
    public static int numberOfDivisorsOf(int numero) {
        int count = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static void isPrime(int numero) {
        if (numberOfDivisorsOf(numero) == 2) {
            System.out.println("O número " + numero + " é primo? true");
        } else {
            System.out.println("O número " + numero + " é primo? false");
        }
    }
}
