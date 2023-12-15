import java.util.*;
public class numberrev1
{
    public static int reverse(int n){
        int reverse=0;
        int r=n;
        while(n!=0){
        r=n%10;
        reverse=(reverse*10)+r;
        n/=10;}
        return reverse;
    }
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        System.out.println("reverse of "+n+"="+reverse(n));
        Sc.nextInt();
    }}