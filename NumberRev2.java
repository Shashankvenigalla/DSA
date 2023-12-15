import java.util.*;
public class NumberRev2{
    public static void main(String[] args){
        int start=0;
        int end=0;
        //int a[]={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int a[] = new int[n];
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        int b[]= new int[a.length];
        for(int i=0;i<a.length/2+1;i++){
            start=i;
            end=a.length-i-1;
            b[start]=a[end];
            b[end]=a[start];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }sc.close();
    }
}