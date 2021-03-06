package CrackingTheCodingInterview.src.Book.IX_InterviewQuestions.DataStructures.Ch01_ArraysAndStrings.Q4_PalindromePermutation.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Solution1Test {
    
    Solution1 solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution1();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(1000), () -> {
             String[] args = new String[0];
             assertAll(() -> Solution1.main(args));
        });
    }
    
    @Test
    public void TrivialCase1() {
        String palindrome = "Rats live on no evil star";
        assertTimeout(Duration.ofMillis(1000), () -> {
            Boolean expected = true;
            Boolean actual = Solution1.isPermutationOfPalindrome(palindrome);
            assertEquals(expected, actual);
        });
    }
}