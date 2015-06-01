// https://leetcode.com/problems/contains-duplicate/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int number : nums) {
            if (numbers.contains(number)) {
                return true;
            } else {
                numbers.add(number);
            }
        }
        return false;
    }
}
