class Solution_On2 {
    public int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length]; 

        for (int i = 0; i < nums.length; i++) {
            int numbers = 1; 
            int test = nums[i];
            
            for (int j = 0; j < nums.length; j++) { 
                if (j != i) { 
                    numbers = numbers * nums[j];
                }
            }

            array[i] = numbers;
        }

        return array; 
    }

}