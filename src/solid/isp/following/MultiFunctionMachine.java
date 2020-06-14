/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package solid.isp.following;

import solid.isp.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {
    private Printer printer;
    private Scanner scanner;

    /**
     * @param printer sub device
     * @param scanner sub device
     */
    public MultiFunctionMachine(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }


    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}
