/**
 * @author - Peter Petrov (peter.petrov@quezter.org)
 * @link - https://github.com/shamatov
 */

package creational.builder;

import creational.builder.simple.HtmlBuilder;
import creational.builder.fluent.EmployeeBuilder;
import creational.builder.faceted.PersonBuilder;

public class App {
    public static void main(String[] args) {
        /*
        No Builder
        Suitable for instantiation of object with few properties
         */
        System.out.println("No Builder");
        String hello = "hello";
        System.out.println("<p>" + hello + "</p>");
        System.out.println("--------\n");

        /*
        Build-in StringBuilder
        Allows easy string concatenation
         */
        System.out.println("Build-in StringBuilder");
        String[] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word: words) {
            sb.append(String.format("    <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);
        System.out.println("--------\n");

        /*
        Simple HtmlBuilder implementation
        Allows generation of formatted html with minimal code written
         */
        System.out.println("Simple HtmlBuilder implementation");
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChild("li", "hello")
                .addChild("li", "world");
        System.out.println(builder);
        System.out.println("--------\n");

        /*
        Fluent Builder
        Allows chaining of the concatenation methods
         */
        System.out.println("Fluent Builder");
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        creational.builder.fluent.Person mitko = employeeBuilder
                .withName("Mitko")
                .worksAt("Developer")
                .build();
        System.out.println(mitko);
        System.out.println("--------\n");

        /*
        Faceted Builder
        Allows chaining different sub-builders and switching between their context
         */
        System.out.println("Faceted Builder");
        PersonBuilder personBuilder = new PersonBuilder();
        creational.builder.faceted.Person person = personBuilder
            .lives()
                .at("1 Dondukov")
                .in("Sofia")
                .withPostcode("1000")
            .works()
                .at("Bulgarian Post")
                .asA("Courier")
                .earning(132000)
            .build();
        System.out.println(person);
    }
}
