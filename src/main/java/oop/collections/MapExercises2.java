package oop.collections;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises2 {

    public static void main(String[] args) {

        //Chcemy przechowywać wszystkie oceny danego ucznia
        //Jan
        String jan = "Jan";
        Integer matemematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matemematyka1, biologia1);
        //Basia
        String basia = "Basia";
        Integer matemematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matemematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(jan, ocenyJan);
        classroom.put(basia, ocenyBasia);

        //Wyświetlamy uczniów wraz z ocenami:
        var entrySet = classroom.entrySet();
        for (Map.Entry<String, List<Integer>> record : entrySet) {
            System.out.println("Uczeń: " + record.getKey() + " oceny: " + record.getValue());
        }

        //Dodawanie oceny Janowi


        //Liczenie średniej z ocen
        System.out.println("To ma równać się 4.0: " + countAvgForStudents(classroom).get("Jan"));
    }

    private static Map<String, Double> countAvgForStudents(Map<String, List<Integer>> students) {
        Map<String, Double> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> record : students.entrySet()) {
            int sum = 0;
            for (Integer grade : record.getValue())
                sum = sum + grade;

            Double avg = (double) sum / record.getValue().size();

            result.put(record.getKey(), avg);
        }
        return result;

    }
}