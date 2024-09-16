/**
 * descending_order
 */
public class Ascending_order {

    public static void main(String[] args) {
        int n=9;
        Asc(n);
    }
    public static void Asc(int n)
        {
            if(n==0)
                return;
            Asc(n-1);
            System.out.println(n);
        }
}