import java.util.PriorityQueue;

public class KthlargestElement {
    public static void main(String[] args) {
       int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minh = new PriorityQueue<>();
        for(int num :nums){
            minh.add(num);
            if(minh.size()>k){
                minh.remove();
            }
        }
        return  minh.peek();
    }

}
