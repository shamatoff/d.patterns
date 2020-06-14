/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package creational.builder.faceted;

public class PersonJobBuilder extends PersonBuilder
{
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    /**
     * @param companyName of the person
     * @return the builder instance
     */
    public PersonJobBuilder at(String companyName)
    {
        person.companyName = companyName;
        return this;
    }

    /**
     * @param position of the person
     * @return the builder instance
     */
    public PersonJobBuilder asA(String position)
    {
        person.position = position;
        return this;
    }

    /**
     * @param annualIncome of the person
     * @return the builder instance
     */
    public PersonJobBuilder earning(int annualIncome)
    {
        person.annualIncome = annualIncome;
        return this;
    }
}
