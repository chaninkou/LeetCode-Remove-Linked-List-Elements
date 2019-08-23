package linkedList;

public class Main {
	public static void main(String[] args) {
		int[] input = {1,2,6,3,4,5,6};
		int val = 6;
		
		System.out.println("Remove: " + val);
		
		ListNode head = LinkedListHelperMethods.insertNode(input);
		
		LinkedListHelperMethods.displayLinkedList(head);
		
		RemoveElementsFromLinkedListFunction solution = new RemoveElementsFromLinkedListFunction();
		
		LinkedListHelperMethods.displayLinkedList(solution.removeElements(head, val));
		
	}
}
