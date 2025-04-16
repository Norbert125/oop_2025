package oop.labor09.lab9_1;

public class Main {
    public static void main(String[] args) {
        IQueue queue1 = new ArrayListQueue(5);
        for (int i = 0; i < 10; i++) {
            queue1.enQueue(i);
            queue1.printQueue();
        }
        while (!queue1.isEmpty()) {
            queue1.deQueue();
            queue1.printQueue();
        }

        IQueue q1 = new ArrayListQueue(5);
        IQueue q2 = new ArrayListQueue(10);
        for (int i = 0; i < 5; ++i) {
            q1.enQueue(i);
            q2.enQueue(i);
        }
        System.out.println(q1.equals(q2));
    }
}
