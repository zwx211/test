package com.test001;

public class ListTest {
    ListNode Head;
    int Val;

    public void listNode(int x) {
        Val = x;

    }

    public int getVal() {
        return Val;

    }
    public void setVal(){
        this.Val = Val;
    }
    public  ListNode getHead(){
        return Head;
    }
    public  void setHead(){
        this.Head= Head;
    }
    public static  ListNode reverseList(ListNode head){
        if(head == null||head.next==null){
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        while(head.next!= null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(0);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head1 = head.next;
        head2 = head1.next;
        ListNode l = head;
        while (null != l) {
            System.out.print(l.getVal() );
            l = l.getHead();
        }
        head = reverseList(head);



    }

}
