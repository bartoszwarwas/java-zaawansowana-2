package oop.collections;

import java.util.*;

public class SetExercises{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Tomek");
        stringList.add("Joanna");
        stringList.add("Janina");
        stringList.add("Barbara");
        stringList.add("Barbara");
        removeDuplicates(stringList);
        System.out.println(stringList);

    }
    private static void removeDuplicates (List<String> list){
        Set<String> set = new HashSet<>(list);
       list.clear();
       list.addAll(set);
    }
}
