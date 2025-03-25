import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
       System.out.println(containsDuplicate(nums)) ;


    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (hs.contains(nums[i]))
                return true;
                hs.add(nums[i]);

        }
        return false;
    }
}
