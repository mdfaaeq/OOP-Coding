import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // Set doesn't five the output in a sorted format.
        /* To get it sorted this code can be used,
            Set<Integer> nums = new TreeSet<Integer>() ;
        */
        Set<Integer> nums = new HashSet<Integer>() ;
        nums.add(62);
        nums.add(51);
        nums.add(86);
        nums.add(29);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
