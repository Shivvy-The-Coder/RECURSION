public class subsequence_of_String {
    
    public static void main(String[] args) {
        
        String s="ABCD";
        subsequence(s,"");
    }
    public static void subsequence(String s, String Ans)
        {
            if(s.length()==0)
                {
                    System.out.print(Ans+" ");
                    return;
                }
                    char ch=s.charAt(0);
                    s=s.substring(1);
                    subsequence(s, Ans);
                    subsequence(s, Ans+ch);
            }
}
