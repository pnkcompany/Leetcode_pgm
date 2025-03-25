public class Palindrome {

    public static void main(String[] args) {
        String originalStr="Radar",revStr="";

        for(int i=originalStr.length()-1;i>=0;i--){
            revStr = revStr + originalStr.charAt(i);
        }

        if(originalStr.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println(originalStr + "is Palindrome");
        }else {
            System.out.println("not a Palindrome");
        }
    }
}
