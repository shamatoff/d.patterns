package solid.lsp;

/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Regular case");
        Rectangle rc = new Rectangle(2, 3);
        changeRectangle(rc);

        System.out.println("Violation of LSP");
        Rectangle sq = new Square();
        sq.setWidth(5);
        changeRectangle(sq);

        System.out.println("Fix for the violation of LSP");
        RectangleFactory rf = new RectangleFactory();
        Rectangle sqf = rf.createSquare(5);
        changeRectangle(sqf);
    }

    /**
     * Method that tests if the subclass changes the properties of
     * it's parent
     * @param r rectangle / square
     */
    public static void changeRectangle(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10); // Here the square breaks the LSP

        System.out.println(
                "Expected area of " + (width * 10) +
                        ", got " + r.getArea()
        );
    }
}
