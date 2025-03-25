import java.util.Collections;
import java.util.Queue;
import java.util.Vector;

public class ReserveFirstK {
    public static void main(String[] args) {
      //  Queue<Integer> x = new int[]{1, 2, 3, 4, 5};
      //  int k = 3;
       // System.out.println(modifyQueue(x,k));
    }


    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Vector<Integer> vec = new Vector<>();

        int remaining = q.size() - k;

        while(k > 0) {
            vec.add(q.peek());
            q.remove();
            k--;
        }

        Collections.reverse(vec);

        for(int i = 0; i < vec.size(); i++) {
            q.add(vec.get(i));
        }

        while(remaining > 0) {
            q.add(q.peek());
            q.remove();
            remaining--;
        }

        return q;
    }
}
