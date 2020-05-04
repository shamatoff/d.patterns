package solid.ocp;

import solid.ocp.shop.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class App {
    public static void main(String[] args) {
        Product p1 = new Product("Apple", Color.GREEN, Size.SMALL);
        Product p2 = new Product("Tree", Color.GREEN, Size.LARGE);
        Product p3 = new Product("House", Color.BLUE, Size.HUGE);

        List<Product> products = Arrays.asList(p1, p2, p3);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green products (old): ");
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Green products (new): ");
        pf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large and blue: ");
        pf.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.HUGE)
        )).forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
    }
}
