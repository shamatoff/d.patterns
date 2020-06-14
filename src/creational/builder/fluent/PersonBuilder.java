/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package creational.builder.fluent;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person = new Person();

    /**
     * @param name of the person
     * @return generic specific builder instance
     */
    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    /**
     * @return the person
     */
    public Person build() {
        return person;
    }

    /**
     * @return the generic specific builder instance
     */
    protected SELF self() {
        return (SELF) this;
    }
}
