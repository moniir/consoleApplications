package com.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> entries = new HashMap<>();
        entries.put("eight",8);
        entries.put("four",4);
        entries.put("ten",10);
        entries.put("two",2);

        entries.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
    }
}
