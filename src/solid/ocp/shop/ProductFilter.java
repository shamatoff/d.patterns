package solid.ocp.shop;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class ProductFilter implements Filter<Product> {
    /**
     * Filter by color
     * @param products list of objects
     * @param color filter
     * @return filtered products
     */
    @Deprecated
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    /**
     * Filter by size
     * @param products list of objects
     * @param size filter
     * @return filtered products
     */
    @Deprecated
    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    /**
     * Filter by size and color
     * @param products list of objects
     * @param size filter
     * @param color filter
     * @return filtered products
     */
    @Deprecated
    public Stream<Product> filterBySizeAndColor(
            List<Product> products,
            Size size,
            Color color
    ) {
        return products.stream()
                .filter(p -> p.size == size && p.color == color);
    }

    /**
     *
     * @param items to be filtered
     * @param spec criteria to be filtered by
     * @return filtered products
     */
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
