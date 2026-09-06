package StringAnalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringAnalyzerTest {

    StringAnalyzer analyzer = new StringAnalyzer();

    @Test
    void testPalindrome() {
        assertTrue(analyzer.isPalindrome("madam"));
    }

    @Test
    void testPalindromeCaseInsensitive() {
        assertTrue(analyzer.isPalindrome("RaceCar"));
    }

    @Test
    void testEmptyPalindrome() {
        assertFalse(analyzer.isPalindrome(""));
    }

    @Test
    void testNullPalindrome() {
        assertFalse(analyzer.isPalindrome(null));
    }

    @Test
    void testVowelCount() {
        assertEquals(5, analyzer.countVowels("education"));
    }

    @Test
    void testAnagram() {
        assertTrue(analyzer.isAnagram("listen", "silent"));
    }

    @Test
    void testAnagramCaseInsensitive() {
        assertTrue(analyzer.isAnagram("Listen", "Silent"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(analyzer.isAnagram("hello", "world"));
    }
}