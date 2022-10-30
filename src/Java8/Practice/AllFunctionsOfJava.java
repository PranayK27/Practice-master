package Java8.Practice;

import Java8.Product;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class AllFunctionsOfJava {
    public static void main(String[] args) {

        List<Product> products = new ArrayList();
        products.add(new Product("p1", "Nord N100", 150, 2, "Oneplus"));
        products.add(new Product("p2", "Iphone 11 Pro", 1179, 4, "Apple"));
        products.add(new Product("p3", "Macbook Pro M2", 1629, 6, "Apple"));
        products.add(new Product("p4", "Macbook Air", 600, 9, "Apple"));
        products.add(new Product("p5", "Aspire E5", 550, 5, "Acer"));

        List<String> names = Arrays.asList("R", "G", "N", "K", "B", "x");

        List<Integer> numbers = Arrays.asList(5,7,6,6,4,1,3,2,2,2,4,10,12,10);

        /* Filters */

        //filters those values that doesn't contain x and reduce them concurrently into a list
        List<String> filtered = names.stream().filter(name -> !"x".equals(name)).collect(Collectors.toList());

        //prints without x
        //filtered.forEach(System.out::print);

        List<String> filter1 = names.stream().filter(n -> n.contains("R")).collect(Collectors.toList());

        //filter1.forEach(System.out::println);

        Product filterSingleObject = products.stream().filter(u -> u.getName().equals("Samsung S22"))
                .findAny()
                .orElse(null);

        //System.out.println(filterSingleObject);

        List<Integer> oddNum = numbers.stream().filter(n -> n%2!=0).collect(Collectors.toList());

        //oddNum.forEach(System.out::println);

        List<Integer> evenNum = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());

        //evenNum.forEach(System.out::println);

        /* distinct() -> works on stream returned from filter,
                        returns stream with unique elements
         */

        /* limit() -> works on stream returned from filter,
                     returns stream with number you provide, works on stream returned from filter
         */

        /* skip() -> works on stream returned from filter, returns the stream by skipping the first n elements,
                    if total number of elements in stream are less than n then it will return empty stream
         */

        /* forEach() ->
        1. It is a terminal operation because it doesnt retrun the stream
        2. All the previous stream maintained as pipeline and processed when this method is called
        3. It takes a consumer functional interface, lambda expression or method reference as argument, so
        it consumes the data of previous streams. Here it consumes and displays each element.
        */

//        numbers
//                .stream()
//                .filter(n->n%2==0)
//                .distinct()
//                .limit(5)
//                .skip(2)
//                .forEach(System.out::println);

        /*
         Map ->
         1. Filter takes the lambda expression as an argument
         2. It takes lambda expression having functional interface having abstract method which takes one argument
            and returns another type object in result
         3. It returns stream of result type parameters
         4. Here it returns each word or number in a separate stream of String or Integer
            containing each character or number

         FlatMap ->
         1. This method works on stream returned from the previous method
         2. It returns the stream merging all the word streams into single stream
         3. If you don't use flatmap here it will give you three stream objects for the given three words
            each contains one character in the string
        */

        List<String> mapped = names.stream().map(String::toLowerCase).collect(Collectors.toList());

        //mapped.forEach(System.out::print);

        List<String> map1 = names.stream().map(n -> n.concat("Y")).collect(Collectors.toList());

        //map1.forEach(System.out::print);

        List<Integer> mapSquares = numbers
                .stream()
                .map(num -> num*num)
                .collect(Collectors.toList());

        //mapSquares.stream().sorted().forEach( System.out::println );

        long count = mapSquares.size();

//        System.out.println("count: ");
//
//        System.out.println(count);
//
//        System.out.println("sorted: ");

        List<Integer> sortNumber = numbers.stream().sorted().collect(Collectors.toList());

//        sortNumber.forEach(System.out::println);

        List<String> propertyOfProduct = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        //propertyOfProduct.forEach(System.out::println);

        List<Product> productList = products.stream().map(p -> {
            Product product = new Product();
            product.setName(p.getName());
            product.setId(p.getId());
            product.setManufacturer(p.getManufacturer());
            product.setPrice(p.getPrice());
            product.setQuantity(p.getQuantity());
            return product;
        }).collect(Collectors.toList());

        //productList.forEach(System.out::println);

        // FlatMap

//        List<String> words = Arrays.asList("Hello, ", "Good", " Morning!");
//
//        words
//                .stream()
//                .map(w -> w.split(""))
//                .flatMap(Arrays::stream)
//                .forEach(System.out::print);

        /*
        * allMatch: It checks all the elments in the stream match the provided filter condition
        * anyMatch: Ot checks any element in the stream match the provided filter condition
        * noneMatch: It checks none element in th stream match the provided filter condition
        * */

//        boolean allPositive = numbers.stream().allMatch(n -> n>0);
//        System.out.println("allPositive: "+allPositive);
//
//        boolean anyEvenAvailable = numbers.stream().anyMatch(n -> n%2==0);
//        System.out.println("anyEvenAvailable: "+anyEvenAvailable);
//
//        boolean noneNegative = numbers.stream().noneMatch(n -> n<0);
//        System.out.println("noneNegative: "+noneNegative);

        /*
        * findAny() -> It find any element from the stream which match the given filter condition
        * isPresent() -> In result optional if the resulted value is available then it will give true or false.
        * result.get() -> It returned the found element, or it will throw NoSuchElementException
        * ifPresent -> The Lambda expression given in this method gets executed
        *              if the provided filter condition match with any element in the stream
        * */

//        Optional<Integer> result = numbers.stream().filter(n -> n%2==0).findAny();
//
//        System.out.println("isPresent: "+result.isPresent()); // true or false
//        System.out.println("resultVal: "+result.get()); // gets the value
//
//        numbers.stream()
//                .filter(n -> n%2==0)
//                .skip(2)
//                .findAny()
//                .ifPresent(val -> System.out.println("ifPresent: "+val));

        // Reduce -> used to convert all the elements in the stream into a single element

        // int sum = numbers.stream().reduce(0,(n1,n2) -> n1+n2); // or the optional sum
//        Optional<Integer> sum = numbers.stream().reduce((n1,n2) -> n1+n2);
//
//        System.out.println(sum);

//        int max = numbers.stream().reduce(0, Integer::max);
//
//        System.out.println("max: "+max);

        /* for finding minimum value we have taken Optional to get the result
           because if we will take initial value 0
           then it will give us 0 as a resulted minimum value
        */

//        Optional<Integer> resultMin = numbers.stream().reduce(Integer::min);
//
//        System.out.println("min: "+resultMin.get());

        /*
        mapToInt() -> fetch all the number from the list and returns an IntStream as the result
        mapDouble()
        mapLong()
       */

//        int total = numbers.stream().mapToInt(n -> n).sum();
//        System.out.println("total: "+total);
//
//        OptionalInt min = numbers.stream().mapToInt(n -> n).min();
//        System.out.println("min: "+min);
//
//        OptionalInt max = numbers.stream().mapToInt(n -> n).max();
//        System.out.println("max: "+max);
//
//        OptionalDouble average = numbers.stream().mapToDouble(n -> n).average();
//        System.out.println("average: "+average.getAsDouble());
//
//        long totalLong = numbers.stream().mapToLong(n -> n*1000).sum();
//        System.out.println(totalLong);

        /* Collect */

        Map<Product, Long> countProducts = products.stream().collect(groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

        //System.out.println(countProducts + " ");

        Map<String, Long> countProd = products.stream().collect(
                groupingBy(
                        Product::getName,
                        Collectors.counting()
                )
        );

        // System.out.println(countProd);

        Map<String, Integer> groupByNameAndQuantity = products.stream().collect(
                groupingBy(
                        Product::getName,
                        Collectors.summingInt(Product::getQuantity)
                )
        );

        // System.out.println(groupByNameAndQuantity);

        Map<Integer, Set<String>> quantity = products.stream().collect(
                groupingBy(
                        Product::getQuantity,
                        Collectors.mapping(Product::getName,
                                Collectors.toSet())
                )
        );

        //System.out.println(quantity);

        // Collectors.joining

        String nameOfProducts = products
                .stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Name of Products: "+nameOfProducts);

        // Collectors.reducing

//        String reducingNames1 = products
//                .stream()
//                .map(Product::getName)
//                .collect(Collectors.reducing((s1,s2) -> s1+s2))
//                .get();
//
//        System.out.println("Using Collectors.reducing: "+reducingNames1);
//
//        String reducingNames2 = products
//                .stream()
//                .collect(Collectors.reducing("Other Way of Names: ", Product::getName, (s1,s2) -> s1+s2));
//
//        System.out.println("Using Collectors.reducing with Identity: "+reducingNames2);

        // Collectors.groupingBy

//        Map<String, List<Product>> result = products
//                .stream()
//                .collect(groupingBy(Product::getManufacturer));
//
//        System.out.println(result);

        Map<String, Map<String, List<Product>>> results = products
                .stream()
                .collect(groupingBy(Product::getManufacturer, groupingBy(Product::getName)));

        System.out.println(results);
    }
}
