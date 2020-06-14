/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */
package solid.isp.against;

import solid.isp.Document;

public interface Machine {
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
