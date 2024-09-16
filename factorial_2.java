public class factorial_2 {
    public static void main(String[] args) {
        
        System.out.println(factorial(6, 1));
    }
    public static int factorial(int x, int ans)
        {
            if(x==0)
                return ans;
            ans=ans*x;
            return factorial(x-1, ans);
        }
}
