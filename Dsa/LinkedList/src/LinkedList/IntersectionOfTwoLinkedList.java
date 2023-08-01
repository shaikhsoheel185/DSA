package LinkedList;

public class IntersectionOfTwoLinkedList {




   /*  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0
        int lenB = 0;

        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != null)
        {
            lenA++;
            currA = currA.next;
        }

        while(currB != null)
        {
            lenB++;
            currB = currB.next;
        }

        currA = headA;
        currB = headB;

        if(lenA > lenB)
        {
            for(int i=0; i<lenA-lenB; i++)
                currA = currA.next;
        }
        else
        {
            for(int i=0; i<lenB-lenA; i++)
                currB = currB.next;
        }
        while( currA != currB )
        {
            currA = currA.next;
            currB = currB.next;
        }

        return currA;

    }*/

    //TC: O(max(m,n) where m,n is the no of nodes in L.L A,B respectively.
         //   SC: O(1)
}
