import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static  int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> num_map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int complement = target - nums[i];
                if(num_map.containsKey(complement)){
                    return  new int[] {num_map.get(complement),i};
                }
                num_map.put(nums[i],i);

            }
            throw  new IllegalArgumentException("no match found");

    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(nums, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
    }
}
