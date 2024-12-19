    import java.util.*;

    class Solution {
        
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int max  = 0 ;

            for (int i = 0 ; i < candies.length ; i++){
                
                if (candies[i] > max){
                    max = candies[i];
                }

            }

            List<Boolean> result = new ArrayList<>();

            for (int i = 0 ; i < candies.length ; i++){
                
                if (candies[i] + extraCandies >= max){
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

            return result;
            
        }
        
        // Main method for testing
        public static void main(String[] args) {
        
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        Solution solution = new Solution();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println("Test Case 1: " + result); // Expected: [true,true,true,false,true]


            
        }
    }
