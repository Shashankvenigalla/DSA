public class Boyer_Moyer {
    //Boyer - Moore Voting Algo
    public static void main(String ...asdf){
        int[] nums={1,2,2,1,1,3,5,1,1,1};
        int votes = 0;
        int majorityElement= nums[0];
        for(int i=0;i<nums.length;i++){
            if(votes ==0){
               majorityElement= nums[i];
               votes++;
            }
            else if(majorityElement !=nums[i]){
                votes--;
            }
            else{
                votes++;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majorityElement){
                count++;
            }
        }
        if(count>nums.length/2)System.out.print(majorityElement);
    }
}
