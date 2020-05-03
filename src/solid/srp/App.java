/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.srp;

public class App {
    public static void main(String[] args) throws Exception {
        Journal testJournal = new Journal();
        testJournal.addEntry("The general was wearing a civil outfit for the first during the crisis.");
        testJournal.addEntry("I rode a bike to IKEA this morning.");
        System.out.println(testJournal);

        Persistence p = new Persistence();
        String filename = "/home/peter/Desktop/journal.txt";
        p.saveToFile(testJournal, filename, true);

        Runtime.getRuntime().exec("atom " + filename);
    }
}
