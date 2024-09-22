import java.util.*;
public class TowerOfHanoi 
{
    public static void main(String[] args) {
        String src="A";
        String hlp="B";
        String des="C";

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TOH(n,src,hlp,des);
        sc.close();
    }   
    public static void TOH(int n, String src, String hlp, String des)
        {
            if(n==0)
                return;
            
            TOH(n-1,src,des,hlp);
            System.out.println("Moved ring "+n+" from Stand "+src+" to "+des);
            TOH(n-1,hlp,src,des);
        } 
}
