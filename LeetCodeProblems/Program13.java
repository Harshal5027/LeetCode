/*Square of Sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number 
 * sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */

import java.util.Arrays;

public class Program13 {

    public int[] sortedSquares(int[] nums) {

        int nums1[] = new int[nums.length];

        for( int i = 0; i < nums.length; i++){
            int sqr = nums[i]*nums[i];
            nums1[i] = sqr;
        }

        // for( int i = 0; i < nums1.length; i++){
        //     int ele = nums1[i];

        //     for( int j = i+1; j < nums1.length; j++){
        //         if( ele < nums1[j]){
        //             int temp = 
        //         }
        //     }
        // }
        Arrays.sort(nums1);

        return nums1;
    
}
