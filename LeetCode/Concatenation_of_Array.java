package LeetCode;

public class Concatenation_of_Array {
    
   //Correct 
   public int[] getConcatenation(int[] nums) {   
        int lng = nums.length;

        int[] ans = new int[2*lng];
        
        for (int i = 0; i < lng; i++) {
            ans[i] = ans[lng+i] = nums[i];
        }
        
        return ans;
    }

    //fastest
    public int[] getConcat(int[] nums) {

        int[] ans = new int[2*nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            ans[i]= ans[nums.length+i] = nums[i];
        }
        
        return ans;
    }
}
