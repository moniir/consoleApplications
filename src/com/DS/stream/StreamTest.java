package com.DS.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(1,"orin","Software Engineer"));
        students1.add(new Student(2,"sakib","Software Engineer"));
        students1.add(new Student(3,"pavel","Student"));
        students1.add(new Student(4,"amal","manager"));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student(1,"orin","Software Engineer"));
        students2.add(new Student(2,"sakib","Software Engineer"));
        students2.add(new Student(3,"pavel","Student"));
        students2.add(new Student(4,"amal","manager"));
        students2.add(new Student(5,"sazzad","sr. software engineer"));
        students2.add(new Student(6,"sifat","sr. software engineer"));

        List<Integer> existListIds = students1.stream().map(y-> y.getId()).collect(Collectors.toList());
//        List<Student> notInList = students2.stream().filter(x-> !students1.stream().map(y-> y.getId()).collect(Collectors.toList()).contains(x.getId())).collect(Collectors.toList());

        List<Student> notInList = students2.stream().filter(x-> !students1.stream().map(y-> y.getId()).collect(Collectors.toList()).contains(x.getId())).collect(Collectors.toList());
//        List<Student> finalList =  students2.stream().filter(x-> !(students1.stream().map(y->  x.getId()))).collect(Collectors.toList());
        System.out.println(notInList);
    }
}
