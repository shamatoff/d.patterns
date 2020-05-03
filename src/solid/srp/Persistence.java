/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * TODO: Implement load method
 * The class takes the persistence functionalities out of
 * the Journal
 */
public class Persistence {
    /**
     * Saving method for journals
     * @param journal the journal to be saved
     * @param filename destination to be saved
     * @param overwrite should it be overwritten if exist
     * @throws FileNotFoundException if the file doesn't exist while trying to write in it
     */
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        File file = new File(filename);
        if (overwrite || file.exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }
}
