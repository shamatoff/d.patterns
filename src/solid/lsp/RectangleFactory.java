package solid.lsp;

/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class RectangleFactory {
    /**
     * @param width of rectangle
     * @param height of rectangle
     * @return new Rectangle object
     */
    public static Rectangle create(int width, int height) {
        return new Rectangle(width, height);
    }

    /**
     * @param side of square
     * @return new Rectangle object that is also a square
     */
    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }
}
