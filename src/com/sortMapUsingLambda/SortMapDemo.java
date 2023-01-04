package com.sortMapUsingLambda;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Here every commented line of code is valid exercise. Commented because some are similar output but different approach
 *
 */
public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);

        List<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        /*Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());  // ascending by key
//                return o2.getKey().compareTo(o1.getKey());  // descending key
//                return o1.getValue().compareTo(o2.getValue());  // ascending by value
//                return o2.getValue().compareTo(o1.getValue());  // descending by value
            }
        });*/
        /*****************ANOTHER WAY**************************/
//        Collections.sort(entries,(o1,o2)-> o1.getKey().compareTo(o2.getKey()));

      /*  for(Entry<String,Integer> item : entries){
            System.out.println(item.getKey()+": "+item.getValue());
        }*/


        /*****************ANOTHER WAY java 8 stream()**************************/
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  //sorting by key
 //       map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); //sorting by value


/*****************************************************USING OBJECT****************************************************/
        /*Map<Employee,Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());  //salary ascending order
                return (int) (o2.getSalary() - o1.getSalary());  //salary ascending order
            }
        });*/

        Map<Employee,Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())); //salary ascending order

        employeeMap.put(new Employee(176,"Monir","CSE",12000),60);
        employeeMap.put(new Employee(388,"Abir","ECE",10000),90);
        employeeMap.put(new Employee(470,"Mac Alister","Arts",5000),50);
        employeeMap.put(new Employee(624,"Alvarez","Sports",4000),40);
        employeeMap.put(new Employee(284,"Molina","Fine Arts",3000),30);

//        System.out.println(employeeMap);

        /*****************ANOTHER WAY java 8 stream()**************************/
//        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);  //salary ascending order
//        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);    //salary descending order
//        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).sorted().forEach(item-> System.out.println(item));
        employeeMap.entrySet().stream().sorted();
        System.out.println(employeeMap);
    }
}
