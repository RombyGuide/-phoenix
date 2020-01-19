package collectionsAll;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Пример collectionsAll.Queue
 */
/*
public interface collectionsAll.Queue<E> extends Collection<E> {
E element();
boolean offer(E e);
E peek();
E poll();
E remove();
}
Throws exception	Returns special value
Insert      add(e)              offer(e)
Remove      remove()            poll()
Examine     element()           peek()
 */
public class Que {

    public static void main(String[] args) {
        java.util.Queue q = new LinkedList();

        // Поместить в очередь
        for (int i = 0; i < 5; i++) {
            q.offer("" + i);
        }

        // Получение из очереди
        while (!q.isEmpty()) {
            Object o = q.poll();
            System.out.println("Item:" + o);
        }
    }
}
