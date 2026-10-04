public class Main {
    public static void main(String[] args) {
        NumericalUtilities.powerOf(2, 3);
        NumericalUtilities.sumOfNaturalNumbersUpTo(5);
        NumericalUtilities.sumOfNaturalNumbersBetween(3, 6);
        NumericalUtilities.sumOfEvenNumbersBetween(3, 10);
        NumericalUtilities.isPrime(7);
        int divisoresDe10 = NumericalUtilities.numberOfDivisorsOf(10);
        System.out.println("O número 10 tem " + divisoresDe10 + " divisores.");
        int[] array = {2, 3, 6, 9, 12};
        ArrayUtilities.toString(array);
        ArrayUtilities.maximumOf(array);
        ArrayUtilities.minimumOf(array);
        ArrayUtilities.copyOf(array);
        ArrayUtilities.contains(array, 6);
        ArrayUtilities.containsDuplicates(array);
        int posicaoDo9 = ArrayUtilities.indexOf(array, 9);
        System.out.println("O índice do valor 9 é: " + posicaoDo9);
        ArrayUtilities.add(array, 15);
        ArrayUtilities.remove(array, 6);
    }
}
