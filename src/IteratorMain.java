import implementations.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args)
    {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(7, 2, 11, 21, 77, 90, 105));
        ListIterator<Integer> integerIterator = new ListIterator<>(integerList);
        iterateThroughListOfIntegers(integerIterator);

        System.out.println("--------------------------------------------------------------------------");

        List<String> stringList = new ArrayList<>(Arrays.asList("Test20", "Test60", "Test50", "Test22"));
        ListIterator<String> stringIterator = new ListIterator<>(stringList);
        iterateThroughListOfStrings(stringIterator);
    }

    /**
     * Iterating through list of integers
     *
     * @param iterator given iterator reference
     */
    private static void iterateThroughListOfIntegers(ListIterator<Integer> iterator)
    {
        while (iterator.hasNext())
        {
            Integer item = iterator.next();
            System.out.println("Integer item value: " + item);
        }
    }

    /**
     * Iterating through list of strings
     *
     * @param iterator given iterator reference
     */
    private static void iterateThroughListOfStrings(ListIterator<String> iterator)
    {
        while (iterator.hasNext())
        {
            String item = iterator.next();
            System.out.println("String item value: " + item);
        }
    }
}
