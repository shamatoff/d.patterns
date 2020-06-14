/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package creational.builder.fluent;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return self();
    }

    /**
     * @return the builder instance
     */
    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
