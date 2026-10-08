public class CaesarCipherDecipherer {
    public static String cipher(String str, int d) {
        String str_c = "";
        for (int i = 0; i < str.length(); i++) {
            char c = (char) (str.charAt(i) + d);
            if (c > 'z') {
                c = (char) (c - 26);
            }
            str_c += c;
        }
        return str_c;
    }

    public static String decipher(String str, int d) {
        String str_c = "";
        for (int i = 0; i < str.length(); i++) {
            char c = (char) (str.charAt(i) - d);
            if (c < 'a') {
                c = (char) (c + 26);
            }
            str_c += c;
        }
        return str_c;
    }

    public static void main(String[] args) {
        String originalMessage = "zorro";
        int steps = 2;
        System.out.println("Mensagem original: " + originalMessage);
        String codedMessage = CaesarCipherDecipherer.cipher(originalMessage, steps);
        System.out.println("Mensagem codificada: " + codedMessage);
        String decodedMessage = CaesarCipherDecipherer.decipher(codedMessage, steps);
        System.out.println("Mensagem descodificada: " + decodedMessage);
    }

}
