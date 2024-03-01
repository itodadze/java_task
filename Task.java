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
        int result = strings.size();
        for (String current: strings) {
            for (int i = 1; i < current.length(); i++) {
                if (current.charAt(i) == current.charAt(i - 1)) {
                    result -= 1;
                    break;
                }
            }
        }
        return result;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode tracker = head;
        ListNode reversedHead = new ListNode(null, tracker.value());
        while (tracker.next() != null) {
            tracker = tracker.next();
            ListNode newHead = new ListNode(reversedHead, tracker.value());;
            reversedHead = newHead;
        }
        return reversedHead;
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
