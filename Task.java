import java.util.ArrayList;
import java.util.Arrays;
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
            reversedHead = new ListNode(reversedHead, tracker.value());
        }
        return reversedHead;
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        /* It's unclear from the instruction and the example whether nums1 and
        nums2 are sorted arrays. So, I added Arrays.sort in case they are
        unsorted. These sorts cause the solution to be O(n*logn) in time complexity,
        so, keep in mind that I would avoid it if I knew for sure the arrays
        are sorted. There is also a fast solution even without sorts using maps;
        however, maps add the space complexity of O(n) so I wrote the solution
        using two pointers algorithm.
         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                result.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static int lenOfLongSubarr(int[] array, int k) {
        return 0;
    }

    public static boolean isValidSubsequence(int[] array, int[] sequence) {
        return false;
    }

}
