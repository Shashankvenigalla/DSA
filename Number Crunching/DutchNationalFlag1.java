public class DutchNationalFlag1 {
    public static void main(String args[]){
        int[] a={0,2,1,0,1,2,0,1};
        int low=0;
        int mid=0;
        int high=a.length-1;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                int temp = a[mid];
                a[mid] = a[high];
                a[high]=temp;
                high--;
            }
        }
        for(int i =0;i<a.length;i++)System.out.print(a[i]+" ");
    }
}
