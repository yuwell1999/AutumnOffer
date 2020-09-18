package YearOne.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 2);
        hm.put(2, 3);
        hm.put(3, 4);

        for (Integer i : hm.keySet()) {
            hm.remove(i);
        }

        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        Map<Integer, Integer> hashTable = new Hashtable<>();

    }
}
