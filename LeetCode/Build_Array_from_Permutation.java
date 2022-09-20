package LeetCode;

public class Build_Array_from_Permutation {

    //normal
    public int[] buildArray(int[] nums) {
     
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    //Best
    public static int[] buildArr(int[] nums) {

        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] + (nums[nums[i]]%10000)*10000;
        }
        
        for(int i=0; i<nums.length; i++)
            nums[i] = nums[i]/10000;
        
        return nums;
    }
}
