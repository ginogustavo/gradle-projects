/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package product.app;

import java.math.BigDecimal;


public class App {


    public static void main(String[] args) {

        Product product = new Product("Product1", "Description1", BigDecimal.valueOf(1.0));
        System.out.println(product);

    }
}
