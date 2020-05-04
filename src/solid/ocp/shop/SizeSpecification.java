package solid.ocp.shop;

/**
 * Product specification for size
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class SizeSpecification implements Specification<Product> {
    private Size size;

    /**
     * Constructor for product size specification
     * @param size to check
     */
    public SizeSpecification(Size size) {
        this.size = size;
    }

    /**
     *Method that checks product size match
     * @param item product
     * @return whether the product size matches the criteria
     */
    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
