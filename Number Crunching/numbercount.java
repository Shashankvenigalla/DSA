import java.util.*;
public  class numbercount {
    public static int count(int num){
        int count=0;
        while(num!=0){
            count+=1;
            num/=10;
        }
        return count;
    }
    public static void main(String ...aed){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        System.out.println("The number of digits "+num+" has is : "+count(num));
    }
}
