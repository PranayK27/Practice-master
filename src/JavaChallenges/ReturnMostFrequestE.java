package JavaChallenges;

import java.util.*;

import static java.util.stream.Collectors.toMap;

class ArrayUtilForElement{
    public static int[] mostFrecuent(int[] array){
        Map<Integer, Integer> mapFrequencyByElement = new HashMap<>();

        for (int element : array){ // traverse elements of the array
            Integer frequency = mapFrequencyByElement.get(element);
            mapFrequencyByElement.put(element, frequency == null ? 1: frequency + 1);
        }

        Map<Integer, Integer> mapOrderedByTopFrequency =
                mapFrequencyByElement
                        .entrySet()
                        .stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                        .collect(
                                toMap(Map.Entry::getKey, Map.Entry::getValue,
                                        (e1, e2) -> e2, LinkedHashMap::new)
                        );

        List<Integer> result = new ArrayList<>();
        int idx=0;
        for (Map.Entry<Integer, Integer> entry:
        mapOrderedByTopFrequency.entrySet()){
            if (idx > 0){
                if (entry.getValue().equals(result.get(idx - 1))) {
                    result.add(entry.getKey());
                } else {
                    break;
                }
            } else {
                result.add(entry.getKey());
            }
            idx++;
        }
        int[] mostFrecuent = result.stream().mapToInt(i -> i).toArray();
        return mostFrecuent;
    }
}

public class ReturnMostFrequestE {
    public static void main(String[] args) {
       int[] arr = {3, 2, 0, 3, 1, 2};
       int[] displayed = ArrayUtilForElement.mostFrecuent(arr);
       // traverse the array or convert to list to show the elements
        for (int i=0; i<displayed.length; i++){
            System.out.println(displayed[i]);
        }
        List<Integer> myList = new ArrayList<>();
        for (int i: displayed){
            myList.add(i);
        }
        System.out.println(myList);

    }
}
