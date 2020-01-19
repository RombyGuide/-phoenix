package collectionsExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Пример типизированной коллекции
 */
public class TipizCol {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Добавить строки можно.
        list.add("1");
        list.add("2");
        list.add("3");
        //list.add(new Date());

        String s = list.get(0);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        //map.put(2, new Date());
    }

}
