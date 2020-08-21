class ListNode<I extends Number> {
    ListNode<Number> head;
    ListNode<Number> next;
    int foot;
    int val;
    public ListNode(int data ){
        data = val;
    }

    public ListNode() {

    }

    public  void add(int data){
        if(this.next == null){
            this.next = new ListNode<Number>(data);
        }else {
            this.next.add(data);
        }
    }
    public int get(int index){
        if(ListNode.this.foot++ == index){
            return this.val;
        }else{
            while(head!=null)
            return this.next.get(index);
        }
        return  this.val;
    }
}
public class GetKLIst {
    public ListNode<Number> getKListNode(ListNode<Number> head,int k){
         ListNode<Number> right = head;
         ListNode<Number> left = head;
         for(int i = 0;i<k;i++){
             right = right.next;
         }
         while(right!=null){
             right= right.next;
             left = left.next;
         }
         return left;

    }

    public static void main(String[] args) {
        ListNode<Integer> mylist = new ListNode<Integer>();
        ((ListNode<Integer>) mylist).add(11);
        ((ListNode<Integer>) mylist).add(2);
        ((ListNode<Integer>) mylist).add(1);
        System.out.println(mylist.get(0));


    }
}

