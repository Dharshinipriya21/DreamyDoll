package dp.demo;
class LongestPalindrome {

    public static String getLongestPalindrome(final String input) {
        int k = 0, j = 0;
        String str1 = "", str2 = "";
        for (int i = 1; i < input.length() - 1; i++) {
            j = i - 1;  k = i + 1;
            while (j >= 0 && k < input.length()) {
                if (input.charAt(j) != input.charAt(k)) {
                    break;
                }
                str1 = input.substring(j, k + 1);
                str2 = str1.length() > str2.length() ? str1 : str2;
                j--;  k++;
            }
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = "AABBAACARRACE12345678987654321ZZXXYYZZ";
        String longestPalindrome = getLongestPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPalindrome);
    }
}
