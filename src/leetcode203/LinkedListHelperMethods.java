package leetcode203;

public class LinkedListHelperMethods {
	public static void displayLinkedList(ListNode head){
		ListNode current = head;
		
		while(current != null){
			System.out.print(current.val + " ");
			
			current = current.next;
		}
		
		System.out.println(" ");
	}
	
	public static ListNode insertNode(int[] input){
		ListNode dummyRoot = new ListNode(0);
		ListNode previous = dummyRoot;
		
		for(int item : input){
			previous.next = new ListNode(item);
			previous = previous.next;
		}
	
		return dummyRoot.next;
	}
}
