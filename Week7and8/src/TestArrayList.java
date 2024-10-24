import java.util.Collections;
import java.util.ArrayList;

public class TestArrayList {

    public static void TestArrayListMethod() {
        // Question 1: Add six user-defined names and search for a specific name
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add(0, "Lena");
        nameList.add(1, "Nicholas");
        nameList.add(2, "Aruna");
        nameList.add(3, "Anthony");
        nameList.add(4, "Daniel");
        nameList.add(5, "Thomas");


        String searchName = "Lena";
        String result = findName(nameList, searchName);
        if (result != null) {
            System.out.println("Name found: " + result);
        } else {
            System.out.println("No such name found.");
        }

        // Question 2: Add integers in random order and find a repeated number
        ArrayList<Integer> intList = new ArrayList<>();
        int n = 6;
        ArrayList<Integer> numbers = generateRandomNumbers(n - 1);

        // Manually add a repeated number
        numbers.add(3);

        // Shuffle the numbers to simulate random order
        Collections.shuffle(numbers);

        // Add the shuffled numbers to the intList
        for (int i = 0; i < numbers.size(); i++) {
            intList.add(i, numbers.get(i));
        }

        // Print the list to verify
        System.out.println("List of integers (random order): " + intList);

        // Find the repeated number
        int repeated = findRepeatedNumber(intList);
        if (repeated != -1) {
            System.out.println("Repeated number found: " + repeated);
        } else {
            System.out.println("No repeated number found.");
        }

        // Question 3: Throw an error when accessing out of bounds
        try {
            System.out.println("Accessing 11th element (out of bounds): " + intList.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Question 4: Trim the array to exact size
        trimToExactSize(intList);
        System.out.println("ArrayList after trimming: " + intList);

        // Question 5:
        Splat sp = new Splat();
        sp.SplatTest();
    }

    //Find a name in the list
    public static String findName(ArrayList<String> list, String name) {
        for (String n : list) {
            if (n.equals(name)) {
                return n;
            }
        }
        return null;
    }

    //Generate random numbers from 1 to n-1
    public static ArrayList<Integer> generateRandomNumbers(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    //Find the repeated number in the list
    public static int findRepeatedNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (current == list.get(j)) {
                    return current;
                }
            }
        }
        return -1;
    }

    //Trim the array to its exact size
    public static <E> void trimToExactSize(ArrayList<E> list) {
        list.trimToSize();
    }



}
