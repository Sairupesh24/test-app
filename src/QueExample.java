import java.util.Queue;
import java.util.LinkedList;

public class QueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println("Queue: " + queue);
        String head = queue.poll();
        System.out.println("Head of the queue: " + head);
        System.out.println("Modified Queue: " + queue);
        boolean containsBanana = queue.contains("Banana");
        System.out.println("Queue contains 'Banana'? " + containsBanana);
        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);
    }
}
