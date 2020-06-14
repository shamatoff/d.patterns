/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.isp.following;

import solid.isp.Document;

/**
 * Method for fax is
 * YAGNI (You Ain't Going to Need It) for the photocopier
 */
public class Photocopier implements Printer, Scanner {

    @Override
    public void print(Document d) {
        System.out.println("Ohh, I can do print! Processing... Done!");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Ohh, I can do scan! Processing... Done!");
    }
}
