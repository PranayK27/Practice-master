package Collections.Experiments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOnCollection {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Red", "Blue", "Green");

        List<String> shortNamesList = new ArrayList<>();

        shortNamesList.addAll(namesList);

        System.out.println(shortNamesList);

        //Java 8 implementation of the Predicate
        shortNamesList
                .stream()
                .filter(c -> c.length() < 5)
                .collect(Collectors.toList());
        System.out.println(shortNamesList);


    }
}
