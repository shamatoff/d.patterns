package solid.ocp.shop;

/**
 * Product specification for color
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class ColorSpecification implements Specification<Product> {
    private Color color;

    /**
     * Constructor for product color specification
     * @param color to check
     */
    public ColorSpecification(Color color) {
        this.color = color;
    }

    /**
     * Method that checks product color match
     * @param item product
     * @return whether the product color matches the criteria
     */
    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
