/**
 * descending_order
 */
public class descending_order {

    public static void main(String[] args) {
        int n=9;
        desc(n);
    }
    public static void desc(int n)
        {
            if(n==0)
                return;
            System.out.println(n);
            desc(n-1);
        }
}