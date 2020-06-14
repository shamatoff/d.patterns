/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.isp.following;

import solid.isp.Document;

/**
 * Methods for scan and fax are
 * YAGNI (You Ain't Going to Need It) for the basic printer
 */
public class BasicPrinter implements Printer {
    @Override
    public void print(Document d) {
        System.out.println("Ohh, I can do print! Processing... Done!");
    }
}
