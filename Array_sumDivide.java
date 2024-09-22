import java.util.*;
public class Array_sumDivide {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int x=1;x<=t;x++)
            {
                int n=sc.nextInt();
                int arr[]=new int [n];
                for(int i=0;i<n;i++)
                    {
                        arr[i]=sc.nextInt();
                    }
              System.out.println(count_divison(arr,0,arr.length-1));  
            }
            sc.close();
    }
      public static int count_divison(int []arr,int si,int li)
        {
            int sum=get_Sum(arr, si, li);

            if(li-si<=0)
                return 0;

            if(sum%2!=0)
                return 0;

            int mid=get_mid(arr, si, li, sum);
            if(mid==-1)
                return 0;

            
            int ct1=count_divison(arr, si, mid);
            int ct2=count_divison(arr, mid+1, li);
            
            return Math.max(ct1,ct2)+1;
        } 

        public static int get_Sum(int arr[], int si, int li)
        {
            int sum=0;
            for(int i=si;i<=li;i++)
                sum+=arr[i];
            return sum;
        }

            public static int get_mid(int arr[], int si, int li,int sum)
        {
            int x=0;
            for(int i=si;i<=li;i++)
                {
                    x+=arr[i];
                    if(x==sum/2)
                       {
                         return i;}
                    
                }
            return -1;
        }

}