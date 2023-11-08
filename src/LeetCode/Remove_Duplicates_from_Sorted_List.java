package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Remove_Duplicates_from_Sorted_List
{
    public static void logic1(int [] ar)
    {
        Set<Integer> nums = new HashSet<>();
        for(int n: ar)
        {
            nums.add(n);
        }
        System.out.println(nums);
    }

    public static ListNode logic2(int [] ar, ListNode head)
    {
        ListNode prev = head;
        ListNode pointer = prev.next;

        if(pointer==null)
        {
            return head;
        }

        while (pointer != null)
        {
            if(prev.val == pointer.val)
            {
                pointer = pointer.next;
                continue;
            }

            prev.next = pointer;
            prev = pointer;
            pointer = pointer.next;
        }

        prev.next = null;
        return head;
    }


    public static void main(String[] args) {

        int arr[] = {1,1,2, 3, 4, 5,5,5,6};
        logic1(arr);
//        logic2(arr, (1,1,2, 3, 4, 5,5,5,6));
    }
}
