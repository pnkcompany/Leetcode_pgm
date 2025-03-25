public class RemoveEle {

    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr,val));


    }


    public static int removeElement(int[] nums, int val) {
        int  tempval = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!= val){
                tempval++;
            }

        }
        return tempval;
    }
}
