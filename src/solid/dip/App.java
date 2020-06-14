/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.dip;

import solid.dip.family.Person;
import solid.dip.family.Relationships;
import solid.dip.family.Research;

public class App {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        /*
        If the deprecated Research constructor is deleted,
        the Research functionality will continue to work as expected
        without violating DIP
        */
        new Research(relationships);
    }
}
