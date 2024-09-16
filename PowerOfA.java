public class PowerOfA {
    public static void main(String[] args) {
        
        int a=2;
        int n=5;
        System.out.println(power(a,n));
    }
    public static int power(int a,int n)
        {   
                if(n==0)
                    return 1;
                int ans=power(a, n-1);
                return a*ans;
        }
}
