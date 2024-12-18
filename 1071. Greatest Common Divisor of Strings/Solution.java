class Solution {
    public static String gcdOfStrings(String str1, String str2) {

        String word1 = str1 + str2;
        String word2 = str2 + str1;

        if (word1.equals(word2)) {

            int gcd = gcd(str1.length(), str2.length());

   
            return str1.substring(0, gcd);

        }
        
        else 

        return "";
    }

    public static int gcd (int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        
        String str1 = "ABABABAB" ;
        String str2 = "AB" ;

        gcdOfStrings(str1, str2);
    
    }
}