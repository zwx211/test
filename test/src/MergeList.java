public class MergeList {
    public class ListNode{
        private ListNode next;
        int val;
        public ListNode(int x){
            val = x;
        }
    }
    public ListNode mergeList(ListNode l1,ListNode l2){
        ListNode dump = new ListNode(-1);
        ListNode pre = dump;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                pre.next = l1;
                pre = l1;
                l1 = l1.next;

            }
            else{
                pre.next = l2;
                pre = l2;
                l2= l2.next;
            }
        }
        if(l1!= null){
            pre.next = l1;

        }
        if(l2!=null){
            pre.next =l2;
        }
        return dump.next;
    }

}
