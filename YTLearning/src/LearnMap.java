import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        // Map<Key(Data Type), Value(Data Type)> students = new HashMap<>() ;
        Map<String, Integer> students = new HashMap<>() ;
        students.put("Hatim",23);
        students.put("Sarah",21);
        students.put("James",30);
        students.put("Jack",29);
        students.put("Sarah", 26);
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
