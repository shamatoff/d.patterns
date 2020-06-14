/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package creational.builder.faceted;

public class PersonAddressBuilder extends PersonBuilder {
    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    /**
     * @param streetAddress of the person
     * @return the builder instance
     */
    public PersonAddressBuilder at(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    /**
     * @param postcode of the person
     * @return the builder instance
     */
    public PersonAddressBuilder withPostcode(String postcode) {
        person.postcode = postcode;
        return this;
    }

    /**
     * @param city of the person
     * @return the builder instance
     */
    public PersonAddressBuilder in(String city) {
        person.city = city;
        return this;
    }
}
