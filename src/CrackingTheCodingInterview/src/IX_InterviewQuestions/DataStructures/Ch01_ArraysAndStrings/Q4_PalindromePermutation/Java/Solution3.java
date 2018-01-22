package CrackingTheCodingInterview.src.IX_InterviewQuestions.DataStructures.Ch01_ArraysAndStrings.Q4_PalindromePermutation.Java;

public class Solution3 {
    /* Toggle the ith bit in the integer. */
    public static int toggle(int bitVector, int index) {
        if (index < 0) return bitVector;

        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    /* Create bit vector for string. For each letter with value i,
     * toggle the ith bit. */
    public static int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int x = Common.getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    /* Check that exactly one bit is set by subtracting one from the
     * integer and AND-ing it with the original integer. */
    public static boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    public static void main(String[] args) {
        String palindrome = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(palindrome));
    }
}
