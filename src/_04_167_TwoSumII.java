import java.util.Arrays;

public class _04_167_TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        ans[0]= -1;
        ans[1] = -1;

        int lp = 0;
        int rp = numbers.length-1;

        while(lp<rp){
            int sum = numbers[lp]+numbers[rp];

            if(sum == target){
               ans[0] = lp+1;
               ans[1] = rp+1;
               return ans;
             }

            else if(sum>target){
                rp--;
            }

            else{
                lp++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
