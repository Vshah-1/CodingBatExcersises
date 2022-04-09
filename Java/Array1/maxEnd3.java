/* Problem Description:
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value.
Return the changed array.
 */

package Java.Array1;

public int[] maxEnd3(int[] nums) {

        int big = nums[0] > nums[2] ? nums[0] : nums[2];

        nums[0] = big;
        nums[1] = big;
        nums[2] = big;

        return nums;
}

