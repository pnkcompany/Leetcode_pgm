public class SumNoOperator {
    public static void main(String[] args) {
        int  a=10 ,b=5;
        System.out.println(getSum(a,b));
    }

    public static int getSum(int a, int b){
        while(b!=0) {
            int answer = a ^ b;
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }
        return a;
    }

}
