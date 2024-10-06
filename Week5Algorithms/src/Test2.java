public class Test2 {
    public static void main(String[] args) {

        ArrayQueue<Integer> Queue = new ArrayQueue<>();

        Queue.enqueue(5);  // Queue: [5]
        Queue.enqueue(3);  // Queue: [5, 3]
        Queue.enqueue(7);  // Queue: [5, 3, 7]

        System.out.println("Queue before rotation: ");
        System.out.println(Queue.dequeue());  // Outputs: 5
        System.out.println(Queue.dequeue());  // Outputs: 3
        System.out.println(Queue.dequeue());  // Outputs: 7

        // Re-enqueue to test rotation
        Queue.enqueue(5);
        Queue.enqueue(3);
        Queue.enqueue(7);

        Queue.rotate();  // Rotates: [3, 7, 5]

        System.out.println("Queue after rotation: ");
        System.out.println(Queue.dequeue());  // Outputs: 3
        System.out.println(Queue.dequeue());  // Outputs: 7
        System.out.println(Queue.dequeue());  // Outputs: 5
}
}