package application;

public class Text03 {

    /**
     * Demonstação de quando o interpretador executa o bloco de codigo de um
     * método dentro do bloco de codigo de outro método.
     */
    public static void drawLegs() {
        System.out.println("     ||     ||      ");
        System.out.println("     ||     ||      ");
        System.out.println("    (||)   (||)     ");
    }

    public static void main(String[] args) {
        System.out.println("   /\\         /\\   ");
        System.out.println("  /  \\_______/  \\  ");
        System.out.println(" /               \\ ");
        System.out.println("(  /\\         /\\  )");
        System.out.println("====     V     ====");
        System.out.println("======(__|__)======");
        System.out.println("  (             )  ");
        System.out.println("   (___________)   ");
        drawLegs();
    }
}
