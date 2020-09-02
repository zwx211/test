package com.company;

import java.util.List;

public class Day07{
    private class ListNode{
        ListNode next;
        int val;
        ListNode(int x ){
            val =x;
        }
    }
    public ListNode delListNode(ListNode head,int value){
        //需要考虑到删除头结点的情况
        if(head!= null&&head.val==value){
            head = head.next;
        }
        if(head==null){
            return head;
        }
        ListNode cur = head;
        //ListNode pre = null;
        while(cur.next!= null){
            if(cur.val ==value) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }

        }
        return head;
    }


}
