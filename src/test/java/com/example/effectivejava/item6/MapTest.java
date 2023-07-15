package com.example.effectivejava.item6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MapTest {

    @Test
    void mapTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", map.getOrDefault(0, 1) + 1);
        map.put("포도", map.getOrDefault(0, 1) + 1);
        map.put("배", map.getOrDefault(0, 1) + 1);

        Set<String> set1 = map.keySet();
        Set<String> set2 = map.keySet();

        Assertions.assertEquals(set1, set2); // true

        set1.remove("사과");

        Assertions.assertEquals(2, set1.size()); //true
        Assertions.assertEquals(set1, set2); // true
    }


}