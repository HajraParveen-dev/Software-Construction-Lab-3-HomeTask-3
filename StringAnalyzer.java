package StringAnalyzer;

import java.util.Arrays;

public class StringAnalyzer {

    public boolean isPalindrome(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        String clean = s.toLowerCase();

        String reverse = new StringBuilder(clean)
                .reverse()
                .toString();

        return clean.equals(reverse);
    }

    public int countVowels(String s) {

        if (s == null) {
            return 0;
        }

        int count = 0;

        for (char c : s.toLowerCase().toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public boolean isAnagram(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return false;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}