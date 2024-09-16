public class FIrstApprearanceof4 
{
    public static void main(String[] args) {
        int []arr={2,3,4,3,4,7,4,6,5};

        System.out.println(appearance(arr,0));
    }    
    public static int appearance(int []arr , int idx)
        {
            if(idx==arr.length)
                return -1;
            if(arr[idx]==4)
                return idx;
            int x= appearance(arr, idx+1);
            return x;
        }
}
