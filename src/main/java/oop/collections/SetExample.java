package oop.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        String s1 = "napis";
        String s2 = "napis2";
        Set<String> strings = new HashSet<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s1);
        System.out.println(strings);
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Tomek");
        treeSet.add("Adam");
        treeSet.add("Joanna");
    }
}

