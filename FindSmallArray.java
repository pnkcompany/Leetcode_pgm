public class FindSmallArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arrys = {3,2,4,6,5,6};
        for(int i=0;i<arrys.length;i++) {
            int min = arrys[0];
            if( arrys[i] < min ) {
                min = arrys[i];
                System.out.println(min);
            }

        }
    }
}
