/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
package solid.srp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple implementation of Journal
 */
public class Journal {
    private final List<String> entities = new ArrayList<>();
    private static int count = 0;

    /**
     * Adding post to the journal
     * @param text journal post body
     */
    public void addEntry(String text) {
        entities.add("" + (++count) + ": " + text);
    }

    /**
     * Remove journal post by index
     * @param index index of the post to be removed
     */
    public void removeEntry(int index) {
        entities.remove(index);
    }

    /**
     * @return formatted journal posts
     */
    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entities);
    }

    /**
     * @deprecated as it is not responsibility of the journal to know how to be saved on disk
     * @param filename path where file will be saved
     * @throws FileNotFoundException
     */
    @Deprecated
    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }
}
