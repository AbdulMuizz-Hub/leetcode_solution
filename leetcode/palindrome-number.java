class Solution {
    public static boolean isPalindrome(int x) {  // function for palindrome
         if (x < 0) {
            return false;
        }

        int number = x;
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        return number == rev;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.print(isPalindrome(x));
    }
}