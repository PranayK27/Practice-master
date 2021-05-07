package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class SuminLambdaExpression {
    public static void main(String[] args) {

        List<Product> products = new ArrayList();
        products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
        products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
        products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
        products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
        products.add(new Product("p5", "laptop 3", 2300, 7, "Manufacturer 2"));

        int s1 = products.stream()
                .mapToInt(p -> p.getQuantity())
                .sum();
        System.out.println("Sum all quantities: " + s1);

        int s2 = products.stream()
                .filter(p -> p.getName().startsWith("mobile"))
                .mapToInt(p -> p.getQuantity())
                .sum();
        System.out.println("Sum quantities of mobile starts with mobile: " + s2);

        long s3 = products.stream()
                .mapToLong(p -> p.getQuantity() * p.getPrice())
                .sum();
        System.out.println("Total: " + s3);

    }
}
