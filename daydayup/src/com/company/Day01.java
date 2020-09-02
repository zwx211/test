package com.company;

import java.util.List;
//反转链表，链表逆序输出

public class Day01 {
    private   class ListNode{
        ListNode next;
        int val;
        ListNode(int x ){
            val=x;
        }

    }
    class Solution{
        public ListNode reverseList(ListNode head){
            if(head==null||head.next==null){
                return  head;
            }
            ListNode pre = null;
            ListNode cur = head;
            while(cur.next!= null){
                ListNode tmp = cur.next;
                cur.next = pre;
                pre = cur;


            }
            return pre;

            }


    }

}
