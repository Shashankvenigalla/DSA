import java.util.*;
public class numberReRotate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]= new int[a.length];
        System.out.println("Enter the right Rotate value: ");
        int n=sc.nextInt();
        int x=0;
        if(n%a.length==0){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
        else{
        for(int i =0;i<a.length;i++){
            if((i+n)>a.length-1){
                b[i]=a[x];
                x++;
            }
            else{
            b[i]=a[i+n];}
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
            }
    }
}
}

