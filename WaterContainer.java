public class WaterContainer {
    public static void main(String[] args) {
        int [] heigth = {1,8,6,2,5};
        System.out.println(maxArea(heigth));
    }

    public static int maxArea(int[] heigth){
        int l =0;
        int r = heigth.length-1;
        int max =0;
        while (l<r){
            int lh = heigth[l];
            int rh = heigth[r];
            int min_h = Math.min(lh,rh);
            int len = r-l;
            int curr_area = min_h*len;
            max = Math.max(max,curr_area);
            if(lh < rh){
                l++;
            }else r--;
        }return  max;
    }


}
