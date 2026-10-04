//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void alinea6(){
        System.out.println("Hello World");
    }

    public static void alinea7(int height, int width) {
        int perimeter = height + width + height + width;
        System.out.println("O perímetro do retângulo é: " + perimeter);
    }

    public static void alinea8(int height, int width, int length) {
        int volume = height * width * length;
        System.out.println("O volume do paralelepípedo é: " + volume);
    }

    public static void alinea9(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5/9);
        System.out.println(fahrenheit + " graus Fahrenheit são " + celsius + " graus Celsius");
    }

    public static void alinea10() {
        int[] array = {1, 7, 6, 8, 11};
        int maximo = array[0];
        int minimo = array[0];
        double soma = 0;
        for (int i = 0; i != array.length; i++) {
            maximo = Math.max(maximo, array[i]);
            minimo = Math.min(minimo, array[i]);
            soma += array[i];
        }
        double media = soma / array.length;
        System.out.println("O valor máximo é: " + maximo);
        System.out.println("O valor minimo é: " + minimo);
        System.out.println("A média é: " + media);
    }
    public static void main(String[] args) {
        alinea6();
        alinea7(4, 8);
        alinea8(26, 12, 16);
        alinea9(100);
        alinea10();
    }
}