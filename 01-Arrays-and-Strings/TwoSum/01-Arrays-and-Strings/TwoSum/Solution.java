import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // This HashMap is our "smart checklist".
        // It will store <The Number, The Position We Saw It At>
        Map<Integer, Integer> checklist = new HashMap<>();

        // Go through the list of numbers one by one.
        for (int i = 0; i < nums.length; i++) {
            
            // This is the number we need to find to make the target.
            // For example, if our current number is 2 and target is 9, the partner is 7.
            int partner = target - nums[i];

            // Ask the checklist: "Have we seen the partner number before?"
            if (checklist.containsKey(partner)) {
                
                // YES! We found it. Return the partner's position (from the checklist)
                // and the current number's position (i).
                return new int[] { checklist.get(partner), i };
            }

            // NO, we haven't seen the partner. 
            // So, add the CURRENT number and its position to the checklist for the future.
            checklist.put(nums[i], i);
        }

        // If the loop finishes and we found nothing, there's no solution.
        throw new IllegalArgumentException("No solution found");
    }
}
