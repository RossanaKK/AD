import java.util.Arrays;

public class CharacterUtilities {
    public static char lowerLetterSucessorOf(char c) {
        char lower = Character.toLowerCase(c);
        return lower == 'z' ? 'a' : ++lower;
        // char next = Character.toLowerCase(c); // método 1 e 2
        // if (next == 'z')
        // return 'a';
        // next +=1;
        // return next;
        // return ++next; método 1
    }

    public static char lowerLetterPredecessorOf(char c) {
        char lower = Character.toLowerCase(c);
        return lower == 'a' ? 'z' : --lower;
    }

    public static char lowerLetterSuccessorStepsOf(char c, int steps) {
        for (int i = 0; i < steps; i++) {
            c = lowerLetterSucessorOf(c);
        }
        return c;
    }

    public static char lowerLetterPredecessorStepsOf(char c, int steps) {
        for (int i = 0; i < steps; i++) {
            c = lowerLetterPredecessorOf(c);
        }
        return c;
    }

    public static int occurrencesOfCharacterIn (char c, char[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++)  {
            if (array[i] == c) {
                count++;
            }
        }
        return count;
    }

    public static void replaceCharacterIn(char oldChar, char newChar, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldChar) {
                array[i] = newChar;
            }
        }
    }

    public static char[] concatenationOf(char[] array1, char[] array2) {
        char[] newArray = new char[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            newArray[array1.length + j] = array2[j];
        }
        return newArray;
    }

    public static char[] copyOfPartOf(char[] array, int startIndex, int endIndex) {
        char[] newArray = new char[endIndex - startIndex];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[startIndex + i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        char n = CharacterUtilities.lowerLetterSucessorOf('a');
        char m = CharacterUtilities.lowerLetterPredecessorOf('b');
        char steps_n = CharacterUtilities.lowerLetterSuccessorStepsOf('a', 2);
        char steps_m = CharacterUtilities.lowerLetterPredecessorStepsOf('b', 2);
        char[] array = {'a', 'b', 'c', 'a', 'z', 'a'};
        int total = CharacterUtilities.occurrencesOfCharacterIn('a', array);
        System.out.println(n);
        System.out.println(m);
        System.out.println(steps_n);
        System.out.println(steps_m);
        System.out.println("No array " + Arrays.toString(array) + " o caractere 'a' aparece " + total + " vezes.");
        System.out.println("Antes: " + Arrays.toString(array));
        CharacterUtilities.replaceCharacterIn('a','o', array);
        System.out.println("Depois: " +  Arrays.toString(array));
        char[] array1 = {'H', 'e', 'l', 'l', 'o', ' '};
        char[] array2 = {'W', 'o', 'r', 'l', 'd', '!'};
        char[] novoArray = CharacterUtilities.concatenationOf(array1, array2);
        System.out.println("O array concatenado é: " + Arrays.toString(novoArray));
        char[] palavra = {'M', 'a', 'd', 'e', 'i', 'r', 'a'};
        char[] copia = CharacterUtilities.copyOfPartOf(palavra, 2, 5);
        System.out.println("Cópia de parte do Array: " + Arrays.toString(copia));
    }
}
