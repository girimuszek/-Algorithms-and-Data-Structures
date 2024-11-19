import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PositionalList<Integer> S = new LinkedPositionalList<>();
        S.addLast(7);
        S.addLast(4);
        S.addLast(8);
        S.addLast(2);
        S.addLast(5);
        S.addLast(3);
        S.addLast(9);

        // Question 1:
        System.out.println("Question 1: ");
        List<Integer> list1 = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8);


        List<Integer> mergedList = merge(list1, list2);

        System.out.println("Merged List: " + mergedList);

        System.out.println();

        // Question 2:
        System.out.println("Question 2: ");
        PriorityQ<Integer, Integer> P = new PriorityQ<>();
        System.out.println("\nSelection Sort (using Priority Queue):");
        System.out.println("\nPhase 1");
        while (S.size() > 0) {
            Integer element = S.remove(S.first());
            P.insert(element, null);
            System.out.println(listToString(S) + " | " + pqToString(P));
        }

        System.out.println("\n----------------------------");
        System.out.println("Phase 2");
        while (P.size() > 0) {
            Integer element = P.removeMin().getKey();
            S.addLast(element);
            System.out.println(listToString(S) + " | " + pqToString(P));
        }
        System.out.println("Sorted using Priority Queue: " + listToString(S));


        // Question 3:
        System.out.println("\nAnswer to question 3 is posted as an image in the Blackboard submission");

        //Question 4:
        System.out.println("\nQuestion 4: ");

        PositionalList<Integer> T = new LinkedPositionalList<>();
        T.addLast(7);
        T.addLast(4);
        T.addLast(8);
        T.addLast(2);
        T.addLast(5);
        T.addLast(3);
        T.addLast(9);

        List<Integer> heap = new ArrayList<>();
        System.out.println("\nPhase 1");
        while (T.size() > 0) {
            Integer element = T.remove(T.first());
            heap.add(element);
            buildHeap(heap);
            System.out.println(listToString(T) + " | " + heap.toString());
        }

        System.out.println("\n----------------------------");
        System.out.println("Phase 2");
        while (heap.size() > 0) {
            Integer smallest = heap.remove(0);
            T.addLast(smallest);
            buildHeap(heap);
            System.out.println(listToString(T) + " | " + heap.toString());
        }
        System.out.println("Sorted using Heap Sort: " + listToString(T));

        System.out.println("Are Question 2 and 4 outputs the same? " + listToString(S).equals(listToString(T)));

    }
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> tempList1 = new ArrayList<>(list1);
        List<Integer> tempList2 = new ArrayList<>(list2);


        while (!tempList1.isEmpty() || !tempList2.isEmpty()) {
            if (!tempList1.isEmpty() && (tempList2.isEmpty() || tempList1.get(0) <= tempList2.get(0))) {
                result.add(tempList1.get(0));
                tempList1.remove(0);
            } else if (!tempList2.isEmpty()) {
                result.add(tempList2.get(0));
                tempList2.remove(0);
            }
        }

        return result;
    }


    private static String listToString(PositionalList<Integer> list) {
        StringBuilder sb = new StringBuilder("(");
        for (Integer i : list) {
            sb.append(i).append(",");
        }
        if (sb.length() > 1) sb.setLength(sb.length() - 1);
        sb.append(")");
        return sb.toString();
    }

    private static String pqToString(PriorityQueue<Integer, Integer> pq) {
        List<Integer> temp = new ArrayList<>();
        while (!pq.isEmpty()) {
            temp.add(pq.removeMin().getKey());
        }
        for (Integer i : temp) {
            pq.insert(i, null);
        }
        return temp.toString();
    }

    private static void buildHeap(List<Integer> heap) {
        for (int i = heap.size() / 2 - 1; i >= 0; i--) {
            heapify(heap, heap.size(), i);
        }
    }

    private static void heapify(List<Integer> heap, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && heap.get(left) < heap.get(smallest)) {
        }

        if (right < n && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            Integer temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);

            heapify(heap, n, smallest);
        }
    }
}
