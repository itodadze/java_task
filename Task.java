import java.util.List;
import java.util.StringTokenizer;

public class Task {

    public record ListNode(Task.ListNode next, int value) {
    }

    public static int evaluateExpression(String expression) {
        int result = 0;
        StringTokenizer byAddition = new StringTokenizer(expression, "+");
        while (byAddition.hasMoreTokens()) {
            StringTokenizer bySubtraction = new StringTokenizer(byAddition.nextToken(), "-");
            if (bySubtraction.hasMoreTokens()) {
                result += Integer.parseInt(bySubtraction.nextToken());
            }
            while (bySubtraction.hasMoreTokens()) {
                result -= Integer.parseInt(bySubtraction.nextToken());
            }
        }
        return result;
    }

    public static int numberOfHappyStrings(List<String> strings) {
        return 0;
    }

    public static ListNode reverseList(ListNode head) {
        return null;
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        return null;
    }

    public static int lenOfLongSubarr(int[] array, int k) {
        return 0;
    }

    public static boolean isValidSubsequence(int[] array, int[] sequence) {
        return false;
    }

}
