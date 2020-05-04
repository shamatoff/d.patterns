package solid.ocp.shop;

/**
 * Generic And-Specification
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public class AndSpecification<T> implements Specification<T> {
    private Specification<T> first, second;

    /**
     * AndSpecification constructor
     * @param first specification one
     * @param second specification two
     */
    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Method that checks two criteria of a item
     * @param item to be checked
     * @return whether both specifications are satisfied
     */
    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
