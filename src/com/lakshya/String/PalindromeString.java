public class PalindromeString {   
    public static int isPlaindrome(String S) {
        // We solve this problem Stack data structure
        if (S == null) return 0;
        
        int n = S.length() - 1;
        
        if (n == 0) return 1;
        else if (S.charAt(0) != S.charAt(n)) return 0;
        
        // int left = 0;
        // int right = n;
        
        // while (left < right) {
        //     Character left_char = S.charAt(left++);
        //     boolean isEquals = left_char.equals(S.charAt(right--));
        //     if (!isEquals) {
        //         return 0;
        //     }
        // }
        
        int i;
        int half = n/2;
        for (i = 0; i <= half; i++) {
            Character left_char = S.charAt(i);
            boolean isEquals = left_char.equals(S.charAt(n - i));
            if (!isEquals) {
                return 0;
            }
        }
        
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPlaindrome("mam"));
    }
}