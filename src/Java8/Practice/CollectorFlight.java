package Java8.Practice;

import Java8.Product;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorFlight {
    public static void main(String[] args) {

//        long totalNumbers = Stream.of(1,2,3,4,5,6,7,8,9).count();
//
//        System.out.println("Total Numbers: "+totalNumbers);
//
//        Stream<Integer> numStream = Stream.of(1,3,4,5,6,7,45,6,9);
//
//        long totalNums = numStream.collect(Collectors.counting());
//
//        System.out.println("TotalNum: "+totalNums);

        Stream<Product> productStream = getProductsStream();

        Comparator<Product> productComparator = Comparator.comparing(Product::getPrice);

        Optional<Product> maxPriceProduct = productStream.collect(Collectors.maxBy(productComparator));

        maxPriceProduct.ifPresent(product -> System.out.println("Max Price Product: "+product));

        System.out.println();

        productStream = getProductsStream();

        Optional<Product> minPriceProduct =
                productStream.collect(Collectors.minBy(productComparator));

        maxPriceProduct.ifPresent(product -> System.out.println("Min Price Product: "+product));

        System.out.println();

        productStream = getProductsStream();

        double averagePrice = productStream.collect(Collectors.averagingInt(p -> (int) p.getPrice()));

        System.out.println("Average Price: "+averagePrice);

        productStream = getProductsStream();

        DoubleSummaryStatistics summaryStatistics =
                productStream
                        .collect(Collectors.summarizingDouble(Product::getPrice));

        System.out.println("\n Max Price: "+summaryStatistics.getMax());

        System.out.println("\n Min Price: "+summaryStatistics.getMin());

        System.out.println("\n Average Price: "+summaryStatistics.getAverage());

        System.out.println("\n Total Price: "+summaryStatistics.getSum());

        System.out.println("\n Count Products: "+summaryStatistics.getCount());
    }

    private static Stream<Product> getProductsStream() {
        Stream<Product> productStream = Stream.of(
                new Product("p1", "Tab S6 lite", 310, 1, "Samsung"),
                new Product("p2", "Tab A 2020", 200, 1, "Samsung"),
                new Product("p3", "Nord 5G", 300, 1, "Oneplus")
        );
        return productStream;
    }
}
