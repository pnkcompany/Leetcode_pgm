public class ReverseNo {

    public static void main(String[] args) {
        String orgstr = "abc";
        System.out.println(reverseString(orgstr));
    }

    private static String reverseString(String strr) {

        if(strr == null)
            throw new IllegalArgumentException("Ill valid exception");
        String reverse ="";
        for(int i=strr.length() -1 ;i>=0;i--){

            //System.out.println("Reserve string s" + strr.charAt(i));
            reverse = reverse + strr.charAt(i);


        }


        return reverse;
    }


}
