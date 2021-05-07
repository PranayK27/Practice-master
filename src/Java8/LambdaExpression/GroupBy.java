package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {

        List<Product> products = new ArrayList();
        products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
        products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
        products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
        products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
        products.add(new Product("p5", "laptop 3", 2300, 7, "Manufacturer 2"));

        System.out.println("Count the number of products in each group");
        Map group = products.stream()
                .collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));

        for(Object groupName : group.keySet()) {
            System.out.println("Group Name: " + groupName);
            System.out.println("Products: " + group.get(groupName));
            System.out.println("=====================");
        }

        System.out.println("Calculate the total number of products in each group");
        Map calculateGroup = products.stream()
                .collect(Collectors.groupingBy(Product::getManufacturer, Collectors.summingInt(Product::getQuantity)));
        for(Object groupName : calculateGroup.keySet()) {
            System.out.println("Group Name: " + groupName);
            System.out.println("Total number of products: " + calculateGroup.get(groupName));
            System.out.println("=====================");
        }
    }
}
