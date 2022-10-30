package Java8.Practice.Stream_Complex_Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
    public static void main(String[] args) {

        Client raj = new Client("Raj", "India");
        Client rose = new Client("Rose", "USA");
        Client rock = new Client("Rock", "USA");
        Client jack = new Client("Jack", "USA");
        Client peter = new Client("Peter", "UK");

        List<Balance> balances = Arrays.asList(
                new Balance(peter, 2011, 400),
                new Balance(raj, 2012, 4000),
                new Balance(rose, 2011, 810),
                new Balance(rock, 2013, 900),
                new Balance(jack, 2014, 1050)
        );

        // Find all Balance of 2011 and Sort them in ascending order

        List<Balance> balanceOf2011 = balances
                .stream()
                .filter(bal -> bal.getYear()==2011)
                .sorted(Comparator.comparing(Balance::getAmount))
                .collect(Collectors.toList());

        System.out.println("---Balance of 2011 and Sorted in Ascending Order: ");

        balanceOf2011.forEach(System.out::println);

        // Unique Countries where the client stays

        List<String> uniqueCities = balances
                .stream()
                .map(balance -> balance.getClient().getCountry())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("---Unique Countries where the client stays: ");

        uniqueCities.forEach(System.out::println);

        // Find All Clients from the USA and sort them by name

        List<Client> clientsFromUSA = balances
                .stream()
                .map(balance -> balance.getClient())
                .filter(client -> client.getCountry().equals("USA"))
                .sorted(Comparator.comparing(Client::getName))
                .collect(Collectors.toList());

        System.out.println("---All Clients from the USA and sorted by their name: ");

        clientsFromUSA.forEach(System.out::println);

        // Find all Traders Name only in Alphabetical Order

        List<String> names = balances
                .stream()
                .map(balance -> balance.getClient().getName())
                .sorted()
                .collect(Collectors.toList());
                //.reduce("", (name1, name2) -> name1+name2);

        System.out.println("---Find all Traders Name only in Alphabetical Order");

        System.out.println(names);

        // Find all Traders comma separated names only in Alphabetical order

        List<String> commaSeparatedNames = balances
                .stream()
                .map(balance -> balance.getClient().getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("---Find all Traders comma separated names only in Alphabetical order: ");

        commaSeparatedNames.forEach(System.out::println);

        // Find is there any client from China

        boolean clientFromChina = balances
                .stream()
                .anyMatch(balance -> balance.getClient().getCountry().equals("China"));

        System.out.println("---Any Client from China: ");

        System.out.println(clientFromChina);

        // Find Client having the highest balance

        balances
                .stream()
                .reduce((b1, b2)-> b1.getAmount()> b2.getAmount()?b1:b2)
                .ifPresent(balance -> System.out.println("---Client with Highest balance: "+balance.getClient()));

        // Find total of all amount of all the Clients

        int totalAmount = balances
                .stream()
                .mapToInt(Balance::getAmount)
                .sum();

        System.out.println("---Total of all amount of all the Clients: ");

        System.out.println(totalAmount);

        // Collectors.joining

        Stream<String> strings = Stream.of("Vikram", "Ashok", "Pratap");

        String str = strings.collect(Collectors.joining(","));

        System.out.println("Joined Strings: "+str);
    }
}
