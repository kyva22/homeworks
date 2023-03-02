package VKS_08;

import VKS_08.Solution;
import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void twoSumTest(){

        int[] numbers = solution.twoSum(new int[]{2,7,11,15}, 9);
        int[] expected = new int[]{0,1};
        Assert.assertArrayEquals(expected, numbers);

        numbers = solution.twoSum(new int[]{2,5}, 6);
        expected = new int[0];
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void isPalindromeTest(){

        String checkPalindrome = "A man, a plan, a canal: Panama";
        Assert.assertTrue(solution.isPalindrome(checkPalindrome));

        checkPalindrome = "race a car";
        Assert.assertFalse(solution.isPalindrome(checkPalindrome));

        Assert.assertTrue(solution.isPalindrome(" "));

    }

    @Test
    public void isDistinct(){
        int[] numbers = new int[]{1,2,3,1};
        Assert.assertTrue(solution.haveDublicate(numbers));

        numbers = new int[]{1,2,3,4};
        Assert.assertFalse(solution.haveDublicate(numbers));

        numbers = new int[]{1,1,1,3,3,4,3,2,4,2};
        Assert.assertTrue(solution.haveDublicate(numbers));
    }

}
