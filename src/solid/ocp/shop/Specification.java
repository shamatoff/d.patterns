package solid.ocp.shop;

/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public interface Specification<T> {
    /**
     * @param item to be checked
     * @return whether the item satisfies the specification
     */
    boolean isSatisfied(T item);
}
