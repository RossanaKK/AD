public class CharacterDrawingUtilities {

    public static void drawElement (char c) {
        System.out.print(c);
    }

    public static void drawNewLine () {
        System.out.println();
    }

    public static void drawHorizontalSegment(char c, int size) {
        for (int i = 0; i < size; i++) {
            drawElement(c);
        }
    }

    public static void drawFilledRectangle(char c, int width, int height) {
        for (int row = 0; row < height; row++) {
            drawHorizontalSegment(c, width);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangle(char c, int width, int height) {
        for (int row = 0; row < height; row++) {
            if (row == 0 || row == height - 1) {
                drawHorizontalSegment(c, width);
            } else {
                drawElement(c);
                drawHorizontalSegment(' ', width - 2);
                drawElement(c);
            }
            drawNewLine();
        }
    }
}
