package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

  class ListNode
{
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MargeTwoSortedList
{
    private static List<Integer> mergeTwoLists_logic1(List list1, List list2)
    {
        //Logic 1
        List<Integer> nwLst = new ArrayList<>(list1);
        nwLst.addAll(list2);
        Collections.sort(nwLst);
        return nwLst;

    }

    private static ListNode mergeTwoLists_logic2(ListNode list1, ListNode list2)
    {
        //Logic 2
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        ListNode headNode = returnNode;

        while (list1 != null && list2 != null)
        {
            if(list1.val<=list2.val)
            {
                returnNode.next = list1;
                list1 = list1.next;
            }
            else
            {
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }

        if(list1 == null)
        {
            returnNode.next = list2;
        } else if (list2 == null) {
            returnNode.next = list1;
        }

        return returnNode.next;

    }


    public static void main(String[] args)
    {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(9, new ListNode()))));
        ListNode list2 = new ListNode(2, new ListNode(9, new ListNode(18, new ListNode(22, new ListNode()))));


//        List<Integer> list2 = List.of(1,9,3,7,6,2,9,4,0,5,1);


        System.out.println(mergeTwoLists_logic2(list1,list2));

    }

}
