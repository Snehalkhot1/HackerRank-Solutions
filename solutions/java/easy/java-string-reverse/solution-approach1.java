// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-29, 05:50 p.m.
// Technique   string-concatenation-reversal
// Time        O(n^2)
// Space       O(n)
// Insight     The implementation constructs a reversed string by iterating backwards through the input and comparing the result to the original string using equality.
// Interview   Before: "I will reverse the string by appending characters to a new string in a loop." After: "This approach has O(n^2) time complexity due to immutable string concatenation in Java, which is inefficient for large inputs compared to a two-pointer O(n) approach."
// Pitfalls    (1) String concatenation inside a loop creates multiple intermediate objects, leading to O(n^2) time complexity.  (2) The solution does not handle potential null inputs, though the problem constraints specify lower case English letters.
// ──────────────────────────────────────────────────


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String reverse = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            reverse = reverse + A.charAt(i);
        }

        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
