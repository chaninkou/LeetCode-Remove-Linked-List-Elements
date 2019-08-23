package linkedList;

public class RemoveElementsFromLinkedListFunction {
	// Recursion way
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		head.next = removeElements(head.next, val);

		if (head.val == val) {
			return head.next;
		} else {
			return head;
		}
	}

	// Iterative way with dummy node
	// public ListNode removeElements(ListNode head, int val){
	// ListNode fakeHead = new ListNode(0);
	// fakeHead.next = head;

	// ListNode current = head;
	// ListNode dummyNode = fakeHead;

	// while(current != null){
	// if(current.val == val){
	// dummyNode.next = current.next;
	// } else {
	// dummyNode = dummyNode.next;
	// }
	// current = current.next;
	// }

	// return fakeHead.next;
	// }
}
