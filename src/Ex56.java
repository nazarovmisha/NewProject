import java.util.PriorityQueue;
//Напишите программу на Java для вставки данного элемента в очередь с приоритетами.
public class Ex56 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Green");
        priorityQueue.add("Black");
        priorityQueue.add("White");
        priorityQueue.add("Blue");
        System.out.println(priorityQueue);
        priorityQueue.offer("Orange");
        System.out.println(priorityQueue);
    }
}
