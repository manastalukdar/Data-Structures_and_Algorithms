package EducativeIo.Courses.GrokkingTheCodingInterview.Ch15_KWayMerge.P2_KthSmallestNumberInMSortedLists._Variants.P2_MergeKSortedArrays.Java;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Integer[] l1 = new Integer[] {2, 6, 8};
        Integer[] l2 = new Integer[] {3, 6, 7};
        Integer[] l3 = new Integer[] {1, 3, 4};
        List<Integer[]> lists = new ArrayList<Integer[]>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        assertTimeout(Duration.ofMillis(1000), () -> {
            List<Integer> expected = Arrays.asList(1, 2, 3, 3, 4, 6, 6, 7, 8);
            List<Integer> actual = Solution.merge(lists);
            assertEquals(expected, actual);
        });
    }
}
