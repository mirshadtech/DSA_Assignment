public class Assignment4 {
	
	public boolean isPalindrome(Node head) {
		
		// FINDING MIDDLE
		if (head.next == null)
			return true;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// REVERSING THE SECOND HALF
		Node prev = slow;
		slow = slow.next;
		prev.next = null;
		Node temp;
		while (slow != null) {
			temp = slow.next;
			slow.next = prev;
			prev = slow;
			slow = temp;
		}
		// COMPARING BOTH HALFS
		Node start = head;

		while (prev != null) {
			if (start.val != prev.val)
				return false;
			start = start.next;
			prev = prev.next;
		}
		return true;
	}
}