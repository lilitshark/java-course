package chapter12;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map originalGrades = TestResults.getOriginalGrades();
        Map makeUpGrades = TestResults.getMakeUpGrades();

        calculateFinalResults(originalGrades, makeUpGrades);
    }

    public static Map calculateFinalResults(Map originalGrades, Map makeUpGrades){
        Map<String, Integer> finalGrades = originalGrades;

        for (var entry : finalGrades.entrySet()) {
            String currentKey = entry.getKey();

            if(entry.getValue() < (Integer) makeUpGrades.get(currentKey)){
                finalGrades.put(currentKey, (Integer) makeUpGrades.get(currentKey));
            }
            //System.out.println("Student: " + currentKey + ", Grade: " + entry.getValue());
        }

        //forEach is used to demonstrate another approach, printing the elements in above loop is more efficient
        finalGrades.forEach((st,gr) -> System.out.println("Student: " + st + ", Grade: " + gr));

        return finalGrades;
    }
}
