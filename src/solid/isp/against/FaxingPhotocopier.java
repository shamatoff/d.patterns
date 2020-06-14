/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
package solid.isp.against;

import solid.isp.Document;

public class FaxingPhotocopier implements Machine {

    @Override
    public void print(Document d) {
        System.out.println("Ohh, I can do print! Processing... Done!");
    }

    @Override
    public void fax(Document d) {
        System.out.println("Ohh, I can do fax! Processing... Done!");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Ohh, I can do scan! Processing... Done!");
    }
}
