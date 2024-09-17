public class fibonacci {
        public static void main(String[] args) {
            
            int n=8;
            System.out.println(fibonacci_number(n));
        }
        public static int fibonacci_number(int n)
            {
                if(n==0)
                    return 0;
                if(n==1)
                    return 1;
                int n1=fibonacci_number(n-1);
                int n2=fibonacci_number(n-2);
                return n1+n2;
            }
}
