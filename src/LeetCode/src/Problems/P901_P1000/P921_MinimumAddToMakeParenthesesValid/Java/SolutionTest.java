package LeetCode.src.Problems.P901_P1000.P921_MinimumAddToMakeParenthesesValid.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {
    
    Solution solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(1000), () -> {
             String[] args = new String[0];
             assertAll(() -> Solution.main(args));
        });
    }
    
    @Test
    public void TrivialCase1() {
        String S = "()))((";
        assertTimeout(Duration.ofMillis(1000), () -> {
            int expected = 4;
            int actual = Solution.minAddToMakeValid(S);
            assertEquals(expected, actual);
        });
    }
}