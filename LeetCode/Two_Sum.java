package LeetCode;

import java.util.HashMap;

public class Two_Sum {

    //Slow
    public int[] twoSum(int[] nums, int target) {  
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target)
                {
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        return nums;
    }

    //Fast
    public int[] twoSumm(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }
            indexMap.put(numbers[i], i);
        }
        return null;
    }
}
