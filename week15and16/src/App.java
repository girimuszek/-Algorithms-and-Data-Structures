import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedQueue<Integer> queue = new LinkedQueue<>();

     
        Integer[] unsortedArray = new Integer[20];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = (int) (Math.random() * 100); 
            queue.enqueue(unsortedArray[i]);
        }


        System.out.println("Question 1: \n");
        List<Integer> list1 = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8);
        List<Integer> mergedList = mergeTwoSortedLists(list1, list2);
        System.out.println("Merged List: " + mergedList);

        System.out.println("\nQuestion 2: \n");
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        mergeSort(unsortedArray, Integer::compareTo);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));


        System.out.println("\nQuestion 3: \n");
        System.out.println("Unsorted Queue: " + queue);
        quickSort(queue, Integer::compareTo);
        System.out.println("Sorted Queue: " + queue);
    }

    public static List<Integer> mergeTwoSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

       
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }


        while (i < list1.size()) mergedList.add(list1.get(i++));
        while (j < list2.size()) mergedList.add(list2.get(j++));

        return mergedList;
    }

    public static <K> void mergeSort(K[] S, Comparator<K> comp) {
        int n = S.length;
        if (n < 2) return; 
        int mid = n / 2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid); 
        K[] S2 = Arrays.copyOfRange(S, mid, n); 

        mergeSort(S1, comp); 
        mergeSort(S2, comp); 

        merge(S1, S2, S, comp); 
    }

    public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0)) {
                S[i + j] = S1[i++];
            } else {
                S[i + j] = S2[j++];
            }
        }
    }

  
    public static <K> void quickSort(Queue<K> S, Comparator<K> comp) {
        int n = S.size();
        if (n < 2) return; 
        K pivot = S.dequeue(); 
        LinkedQueue<K> less = new LinkedQueue<>();
        LinkedQueue<K> equal = new LinkedQueue<>();
        LinkedQueue<K> greater = new LinkedQueue<>();

        equal.enqueue(pivot); 


        while (!S.isEmpty()) {
            K element = S.dequeue();
            int comparison = comp.compare(element, pivot);
            if (comparison < 0) less.enqueue(element);
            else if (comparison == 0) equal.enqueue(element);
            else greater.enqueue(element);
        }


        quickSort(less, comp);
        quickSort(greater, comp);

   
        while (!less.isEmpty()) S.enqueue(less.dequeue());
        while (!equal.isEmpty()) S.enqueue(equal.dequeue());
        while (!greater.isEmpty()) S.enqueue(greater.dequeue());
    }
}
