import java.util.*;
public class Dictionary_order{
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList <String> ll = new ArrayList<>();
        Dictionary_Order(ll,s,"",s);
        Collections.sort(ll);
        for(int i=0;i<ll.size();i++)
            System.out.println(ll.get(i));
    }
    public static void Dictionary_Order(ArrayList <String> ll ,String ques, String ans,String match)
        {
            if(ques.length()==0 && ans.compareTo(match)<0)
                {
                    ll.add(ans);
                    return;
                }

            for(int i=0;i<ques.length();i++)
                {
                    char ch=ques.charAt(i);
                    String st1=ques.substring(0,i);
                    String st2=ques.substring(i+1);
                    Dictionary_Order(ll,st1+st2,ans+ch,match);
                }
        }

}
