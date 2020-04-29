package InterviewCake.src.Questions.BracketValidator.Java;

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
        String input = "(a + (a + b))";
        assertTimeout(Duration.ofMillis(1000), () -> {
            boolean expected = true;
            boolean actual = Solution.isValid_editorial(input);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        String input= "((a + b))";
        assertTimeout(Duration.ofMillis(1000), () -> {
            boolean expected = true;
            boolean actual = Solution.isValid_editorial(input);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase3() {
        String input= "((a + b))]";
        assertTimeout(Duration.ofMillis(1000), () -> {
            boolean expected = false;
            boolean actual = Solution.isValid_editorial(input);
            assertEquals(expected, actual);
        });
    }
}