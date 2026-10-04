public class ArrayUtilities {
    public static void toString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i < array.length -1)
                str += array[i] + ", ";
            else
                str += array[i] + "]";
        }
        System.out.println(str);
    }
    public static void maximumOf(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            maximo = Math.max(maximo, array[i]);
        }
        System.out.println("Valor máximo: " + maximo);
    }
    public static void minimumOf(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            minimo = Math.min(minimo, array[i]);
        }
        System.out.println("Valor mínimo: " + minimo);
    }
    public static void copyOf(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        System.out.print("Cópia do array: ");
        toString(copia); // Usa o seu método para imprimir os parênteses retos
    }
    public static void contains(int[] array, int numero) {
        boolean existe = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                existe = true;
            }
        }
        System.out.println("Contém o número " + numero + "? " + existe);
    }
    public static void containsDuplicates(int[] array) {
        boolean temRepetidos = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temRepetidos = true;
                }
            }
        }
        System.out.println("Tem duplicados? " + temRepetidos);
    }
    public static int indexOf(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    public static void add(int[] array, int valor) {
        int[] novoArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }
        novoArray[novoArray.length - 1] = valor;
        System.out.print("Array após adicionar " + valor + ": ");
        toString(novoArray);
    }
    public static void remove(int[] array, int valor) {
        int index = indexOf(array, valor);
        if (index == -1) {
            System.out.println("O valor " + valor + " não existe no array.");
            return;
        }
        int[] novoArray = new int[array.length - 1];
        int posicaoNovo = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                novoArray[posicaoNovo] = array[i];
                posicaoNovo++;
            }
        }
        System.out.print("Array após remover " + valor + ": ");
        toString(novoArray);
    }
}
