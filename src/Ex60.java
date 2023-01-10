import java.util.HashMap;
import java.util.Map;

//Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного ключа.
public class Ex60 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Green");
        hashMap.put(2, "Blue");
        hashMap.put(3, "Black");
        hashMap.put(4, "Black");

        System.out.println(hashMap.containsValue("Green"));
        System.out.println(hashMap.containsKey(5));
    }
}
