import java.util.ArrayList;
import java.util.Collection;

public class LearnArrayList {
    public static void main(String[] args) {
        // Collection Interface
        /* If we want to work with index we could use,
            List <Integer> nums = new ArrayList <Integer> () ;
        */
        // Also with the use of it, it's possible to get the index values.
        Collection <Integer> nums = new ArrayList <Integer> () ;
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println();
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
