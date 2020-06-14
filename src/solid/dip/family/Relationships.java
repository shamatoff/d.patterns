/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.dip.family;

import org.javatuples.Triplet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * This is low-level module ()
 */
public class Relationships implements RelationshipBrowser
{
    private List<Triplet<Person, Relationship, Person>> relations =
            new ArrayList<>();

    /**
     * @param parent in the relationship
     * @param child in the relationship
     */
    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    /**
     * @return list of all relationships
     */
    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    /**
     * @param name of the parent
     * @return list of children
     */
    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
