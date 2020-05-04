package solid.ocp.shop;

/**
 * Sample product class
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class Product {
    public String name;
    public Color color;
    public Size size;

    /**
     * Product constructor
     * @param name text representation of the product
     * @param color property of the product
     * @param size property of the product
     */
    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
