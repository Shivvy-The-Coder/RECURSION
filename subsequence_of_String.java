public class subsequence_of_String {
    
    public static void main(String[] args) {
        String s="SHIVAM";
        printSubsequence(s,"");
    }
    public static void printSubsequence(String ques ,String ans)
    {
        if(ques.length()==1)
            {
                System.out.print(ans+" ");
                return;
            }
        char ch=ques.charAt(0);
        String s=ques.substring(1);
        printSubsequence(s, ans);
        printSubsequence(s, ans+ch);
    }
}
