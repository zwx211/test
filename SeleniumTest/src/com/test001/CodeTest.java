package com.test001;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

//import com.sun.org.apache.xerces.internal.impl.xs.util.XInt;
 class ListNode{
	 int value;
	 ListNode next;
	 ListNode(int x) {
		 x=value;
		 
		// TODO Auto-generated constructor stub
	}
	
}

public class CodeTest {
	public static ListNode reverseList(ListNode head) {
		//if(head==null||head.next==null) {
			//return head;
		//}
		ListNode pre = null;
		ListNode cur = head;
		while(cur!=null) {
			ListNode tmp = cur.next;
			cur.next = pre;
			pre = tmp;
			
		}
		
		return pre;
		
	}
	public static void main(String [] args) {
		//List<Integer> list = new LinkedList<>();
		//ListNode head = new ListNode(0) ;
		//ListNode xxx = new ListNode(1);
		//head.value = 1;
		//xxx.value = 2;
		int[] input=new int[]{1,2,3,3,4,4,5};
	    ListNode listNode=buildListNode(input);
	    //head=listNode;
		
		
		//list.add(12);
		//list.add(111);
		//ListNode ;
		System.out.print(reverseList( listNode));
		System.out.print("�ҵļ�");
		
		
		
	}
	private static ListNode buildListNode(int[] input) {
		// TODO Auto-generated method stub
		return null;
	}

}
