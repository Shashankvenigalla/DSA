import java.util.*;
public class asdfghjkl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int a[] = new int[n];
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        //int a[] = {1,2,3,4,5,6,7};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }
        System.out.println("Maximum number of the given Array: "+max+", Minimum Number of given Array: "+min);
        sc.close();
    }
}
