import java.util.*;
public class basiscs {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        System.out.println(q.isEmpty());
        q.add(2);
        System.out.println(q.size());
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.remove();
        System.out.println(q.size());
        q.poll();
        System.out.println(q.size());
        q.peek();
        System.out.println(q);
        q.add(8);
        q.element();
        System.out.println(q.size());
        q.add(7);
        System.out.println(q);

    }
    
}
