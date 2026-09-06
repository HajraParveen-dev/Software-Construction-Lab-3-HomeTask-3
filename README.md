# Homework 3 — String Utility Testing

## Objective

The objective of this homework is to apply JUnit to verify the correctness of string-processing logic.

The homework focuses on testing palindrome detection, vowel counting, and anagram checking while also handling case sensitivity and empty or null inputs.

## Implementation and Tasks Completed

The `StringAnalyzer.java` class was implemented with the following methods:

* `isPalindrome(String s)` — checks whether a string is a palindrome.
* `countVowels(String s)` — counts the number of vowels in a string.
* `isAnagram(String s1, String s2)` — checks whether two strings are anagrams.

The following tasks were completed:

* Tested a normal palindrome using `"madam"`.
* Tested a case-insensitive palindrome using `"RaceCar"`.
* Tested an empty string input.
* Tested a `null` input.
* Tested vowel counting using `"education"`.
* Tested a normal anagram using `"listen"` and `"silent"`.
* Tested a case-insensitive anagram using `"Listen"` and `"Silent"`.
* Tested non-anagram strings using `"hello"` and `"world"`.
* Used JUnit to verify the expected results.
* Completed 8 test cases successfully.

## How to Run

### Run the Code

1. Open the project in NetBeans IDE.
2. Open `StringAnalyzer.java`.
3. Run the Java project or class.

### Run the Tests

1. Open `StringAnalyzerTest.java`.
2. Right-click the test file.
3. Select **Test File** to run the JUnit tests.

If the project is configured with Maven, tests can also be run using:

```bash
mvn test
```

## Test Result

The following test cases were completed:

* **TC-01:** `isPalindrome("madam")` → `true` — PASS
* **TC-02:** `isPalindrome("RaceCar")` → `true` — PASS
* **TC-03:** `isPalindrome("")` → `false` — PASS
* **TC-04:** `isPalindrome(null)` → `false` — PASS
* **TC-05:** `countVowels("education")` → `5` — PASS
* **TC-06:** `isAnagram("listen", "silent")` → `true` — PASS
* **TC-07:** `isAnagram("Listen", "Silent")` → `true` — PASS
* **TC-08:** `isAnagram("hello", "world")` → `false` — PASS

**Overall Result: PASS — 8/8 test cases passed successfully.**
