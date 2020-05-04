package solid.ocp.shop;

import java.util.List;
import java.util.stream.Stream;

/**
 * Filter Interface
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
public interface Filter<T> {
    /**
     * @param items to be filtered
     * @param spec criteria to be filtered by
     * @return filtered items
     */
    Stream<T> filter(List<T> items, Specification<T> spec);
}
