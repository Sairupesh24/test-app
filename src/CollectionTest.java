import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.add(10);
        s.add(30);
        s.add(40);
        s.add(50);
        int x = s.pop();
        int x1 = s.pop();
        System.out.println(x);


        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(40);
        queue.add(90);

        int q1 = queue.poll();
        System.out.println(q1);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(60);
        numbers.add(60);
        numbers.add(30);

        for (int val : numbers) {
            System.out.println(val);
        }

        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(30);
        numbersSet.add(60);
        numbersSet.add(60);
        numbersSet.add(30);
        for (int val : numbersSet) {
            System.out.println(val);
        }

        Map<String, String> map = new HashMap<>();
        map.put("1", "Krishna");
        map.put("2", "siva");
        map.put("3", "raju");

        System.out.println(map.get("3"));
    }
}
