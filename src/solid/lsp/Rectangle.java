package solid.lsp;

/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class Rectangle {
    protected int width, height;

    public Rectangle() {}

    /**
     * @param width of the rectangle
     * @param height of the rectangle
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return the rectangle width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the rectangle height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param width of the rectangle
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @param height of the rectangle
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the area of the rectangle
     */
    public int getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
