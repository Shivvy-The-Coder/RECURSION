import java.util.*;
public class Subset_Problem{
    static int count =0;
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        // int t=sc.nextInt();
        String ans="";    
        subset(ll,ans,3,0,0);   
        System.out.println("\n"+count);
    }
    public static void subset(ArrayList <Integer>ll,String s ,int t,int sum,int idx)
        {
            if(idx==ll.size() || sum>t)
                return;
            if(sum==t)
                {
                    System.out.print(s+"  ");
                    count++;
                    return;
                }
            for(int i=idx;i<ll.size();i++)
                {
                    int x=ll.get(i);
                    subset(ll,s+" "+x,t,sum+x, idx+1);
                }
        }
}
