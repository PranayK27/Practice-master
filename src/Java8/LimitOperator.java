package Java8;

import java.util.ArrayList;
import java.util.List;

public class LimitOperator {
    public static void main(String[] args) {

        List<Product> products = new ArrayList();
        products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
        products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
        products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
        products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
        products.add(new Product("p5", "laptop 3", 2300, 9, "Manufacturer 2"));

        System.out.println("Descending Order and Limit");
        products.stream()
                .sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()))
                .limit(2)
                .forEach(p -> {
                    System.out.println(p.toString());
                    System.out.println("======================");
                });

    }
}
