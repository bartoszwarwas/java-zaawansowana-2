package oop.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercises {
        private static Map<String, String> disciotnary = getDictionary();
        private static Map<String,String> getDictionary(){
            Map<String, String> pairs = new HashMap<>();
            pairs.put("mama","mother");
            return  pairs;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("POdaj słowa po polsku");
       String polishWord =  scanner.next();
       if (disciotnary.containsKey(polishWord)){
           System.out.println(disciotnary.get(polishWord));

       }else {
           System.out.println("Słowo nie wystepuje");
       }
    }
    }
