import java.util.HashMap;
import java.util.Map;

//Напишите программу на Java, чтобы проверить, содержит ли карта сопоставления значения ключа (пусто) или нет.
public class Ex59 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Green");
        hashMap.put(2, "Blue");
        hashMap.put(3, "Black");
        hashMap.put(4, "Black");
        boolean result = hashMap.isEmpty();
        System.out.println("Map is empty " + result);



        System.out.println("Map is empty " + result);

        System.out.println(hashMap.containsValue("Green"));
    }
}
