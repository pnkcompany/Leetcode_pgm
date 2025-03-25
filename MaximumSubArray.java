public class MaximumSubArray {
    public static void main(String[] args) {
        int[] a= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray(a));

    }

    static int maximumSubArray(int[] nums){
        int maxsum =0;
        int currsum =0;
        for(int i =0;i<nums.length;i++){
            currsum = currsum + nums[i];
            if(currsum> maxsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        } return maxsum;

    }

}
