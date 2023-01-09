import java.util.HashMap;
//Напишите программу на Java для подсчета количества отображений ключ-значение (размер) на карте.
public class Ex58 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Blue");
        hashMap.put(3, "White");
        hashMap.put(4, "Green");
        hashMap.put(5, "Black");
        System.out.println(hashMap.size());
    }
}
