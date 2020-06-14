/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.dip.family;

import org.javatuples.Triplet;
import java.util.List;

/**
 * High-level module (see README)
 */
public class Research
{
    /**
     * This constructor is deprecated because it violates
     * the dependency inversion principle. The class is a high-level
     * but it depends in low-level Relationships. Altering Relationship
     * implementation can lead to breaking changes for Research
     * @param relationships low-level relationship dependency
     */
    @Deprecated
    public Research(Relationships relationships) {
        List<Triplet<Person, Relationship, Person>> relations =
                relationships.getRelations();

        relations.stream()
                .filter(x -> x.getValue0().name.equals("John") &&
                 x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println(
                        "John has a child called " + ch.getValue2().name
                ));

    }

    /**
     * @param browser abstract relationship dependency
     */
    public Research(RelationshipBrowser browser)
    {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child: children)
            System.out.println("John has child called " + child.name);
    }
}
