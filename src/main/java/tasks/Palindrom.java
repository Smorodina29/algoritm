package tasks;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(longestPalindromeString("1234"));
        System.out.println(longestPalindromeString("12321"));
        System.out.println(longestPalindromeString("9912321456"));
        System.out.println(longestPalindromeString("9912333321456"));
        System.out.println(longestPalindromeString("12145445499"));
    }

    private static String longestPalindromeString(String s) {
        char[] input = s.toCharArray();

        int start = 0, end = 0, left = 0, right = 0;

        for (int mid = 0; mid < input.length; mid++) {
            if (input.length % 2 != 0) {
                left = mid - 1;
                right = mid + 1;
            } else {
                left = mid - 1;
                right = mid + 2;
            }
            while (left >= 0 && right < input.length) {
                if (input[left] == input[right]) {
                    if (right - left > end - start) {
                        start = left;
                        end = right;
                    }
                }
                left--;
                right++;
            }
        }
        return s.substring(start, end+1);
    }
}
