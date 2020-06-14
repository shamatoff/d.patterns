/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.isp.against;

import solid.isp.Document;

public class BasicPrinter implements Machine {
    @Override
    public void print(Document d) {
        System.out.println("Ohh, I can do print! Processing... Done!");
    }

    @Override
    public void fax(Document d) {
        System.out.println("Oops, I can't do fax! Sorry!");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Oops, I can't do scan! Sorry!");
    }
}
