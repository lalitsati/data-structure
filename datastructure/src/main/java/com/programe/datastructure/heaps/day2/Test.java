package com.programe.datastructure.heaps.day2;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("waitTime", 3600);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime plus3600 = now.plusSeconds((Integer) map.get("waitTime"));
        System.out.println(plus3600);

    }
}
