/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package creational.builder.faceted;

/**
 * Builder facade
 */
public class PersonBuilder {
    protected Person person = new Person();

    public Person build() {
        return person;
    }

    /**
     * @return address builder
     */
    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    /**
     * @return job builder
     */
    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }
}
