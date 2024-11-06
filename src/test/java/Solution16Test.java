import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution16Test {
    /**
     * 等价类划分原则：
     *      正整数数组
     *      包含零的数组
     *      单一数字的数组
     *      所有元素相同的数组
     *      包含前导零的数字的数组
     */
    @Test
    void testLargestNumberWithExample1() { //正整数数组
        Solution16 solution = new Solution16();
        int[] nums = {10, 2};
        String expected = "210";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testLargestNumberWithExample2() { //正整数数组
        Solution16 solution = new Solution16();
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testLargestNumberWithZeros() { //包含零的数组
        Solution16 solution = new Solution16();
        int[] nums = {0, 0};
        String expected = "0";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testLargestNumberWithSingleDigit() {  //单一元素数组
        Solution16 solution = new Solution16();
        int[] nums = {7};
        String expected = "7";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testLargestNumberWithAllSameDigits() {  //所有元素相同的数组
        Solution16 solution = new Solution16();
        int[] nums = {6, 6, 6};
        String expected = "666";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testLargestNumberWithLeadingZeros() {  //包含前导零的数字的数组
        Solution16 solution = new Solution16();
        int[] nums = {0, 4, 0, 4};
        String expected = "4400";
        String actual = solution.largestNumber(nums);
        assertEquals("4400", actual);
    }

}