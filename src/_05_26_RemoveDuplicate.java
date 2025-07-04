public class _05_26_RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        int prev = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[prev] != nums[i]){
                prev++;
                nums[prev] = nums[i];
            }
        }
        System.out.println(prev+1);
    }
}
