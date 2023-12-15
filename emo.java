package DSA;
public class emo {
    public static void main(String[] args) {
        int[] x={1,2,3,5};
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<x.length;i++){
            max=Math.max(max,x[i]);
            min=Math.min(min,x[i]);
            sum+=x[i];
        }
        
        System.out.println(n-sum);
    }
}
