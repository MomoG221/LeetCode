class Solution {
    public void moveZeroes(int[] nums) {

        int small = 0;

        int[] result = new int[nums.length];

        int length = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                result[length] = 0;

                length--;

            } else {

                int temp = nums[i];
                nums[i] = nums[small];
                nums[small] = temp;
                small++;

            }

        }
        
    } 
}
