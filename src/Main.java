import java.util.LinkedList;


//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Main {
    static LinkedList<Integer> list = new LinkedList();

    public static void main(String[] args) {
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(3);
        list.add(17);
        System.out.println(list);
        enqueue(1);
        System.out.println(list);
        System.out.println(dequeue());
        System.out.println(list);
        System.out.println(first());
        System.out.println(list);
    }

    public static void enqueue(Integer element) {
        list.addLast(element);
    }

    public static Integer dequeue() {
        return list.pollFirst();
    }

    public static Integer first() {
        return list.getFirst();
    }
}
