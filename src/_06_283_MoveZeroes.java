import java.util.Arrays;

public class _06_283_MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,0,12};
        int arr[] = new int[nums.length];

        int prev = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[prev];
                nums[prev] = temp;
                prev++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
