import java.util.List;

import static org.junit.Assert.*;

public class TaskTest {

    @org.junit.Test
    public void testEvaluateExpression() {
        int longSum = Task.evaluateExpression("5+20-8+5");
        assertEquals(22, longSum);
        int oneNum = Task.evaluateExpression("9");
        assertEquals(9, oneNum);
        int empty = Task.evaluateExpression("");
        assertEquals(0, empty);
    }

    @org.junit.Test
    public void testHappyStrings() {
        List<String> strings = List.of("abbcc", "abc", "abcabc", "cabcbb");
        int result = Task.numberOfHappyStrings(strings);
        assertEquals(2, result);
    }

    @org.junit.Test
    public void testReverseList() {
        Task.ListNode tail = new Task.ListNode(null, 3);
        Task.ListNode middle = new Task.ListNode(tail, 2);
        Task.ListNode head = new Task.ListNode(middle, 1);
        Task.ListNode result = Task.reverseList(head);
        assert result != null;
        assertEquals(3, result.value());
        assert result.next() != null;
        assertEquals(2, result.next().value());
        assert result.next().next() != null;
        assertEquals(1, result.next().next().value());
        assertNull(result.next().next().next());
    }

    @org.junit.Test
    public void testFindIntersection() {
        int[] nums1 = new int[]{1, 2, 3, 3, 4, 5};
        int[] nums2 = new int[]{3, 4, 4, 5, 6, 7};
        int[] result = Task.findIntersection(nums1, nums2);
        assert result != null;
        assertEquals(3, result.length);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
        assertEquals(5, result[2]);
    }

    @org.junit.Test
    public void testLenOfLongSubarray() {
        int[] example = new int[]{6, 2, 2, 3, 4, 1};
        int resForEight = Task.lenOfLongSubarr(example, 8);
        int resForThirty = Task.lenOfLongSubarr(example, 30);
        int resForSeventeen = Task.lenOfLongSubarr(example, 17);
        int resForSix = Task.lenOfLongSubarr(example, 6);
        assertEquals(4, resForEight);
        assertEquals(-1, resForThirty);
        assertEquals(5, resForSeventeen);
        assertEquals(3, resForSix);
    }

    @org.junit.Test
    public void testValidSubsequence() {
        int[] array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        boolean resForTrue = Task.isValidSubsequence(array, new int[]{1, 6, -1, 10});
        boolean resForPartially = Task.isValidSubsequence(array, new int[]{1, 6, -1, 13});
        boolean resForWrongOrder = Task.isValidSubsequence(array, new int[]{1, 22, -1, 6, 10});
        assertTrue(resForTrue);
        assertFalse(resForPartially);
        assertFalse(resForWrongOrder);
    }
}
