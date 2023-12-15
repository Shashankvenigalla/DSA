import java.util.*;
public class kadanes {
    public static int kadanesAlgorithm(int[] a){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        for(int i =0; i<a.length;i++){
            currentSum+=a[i];
            if(currentSum<0){
                currentSum=0;
                start=i+1;
            }
            if(maxSum<=currentSum){
                maxSum=currentSum;
                end=i;
            }
        }
        System.out.println("SubArray indexes:"+start+","+end);
    return maxSum;
    }
    public static void main(String ...asd){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int maxSum=kadanesAlgorithm(a);
          System.out.println("Max Sum of given array is "+maxSum);
        sc.close();
    }
}
