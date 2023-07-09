public class Assignment1 {
	
    public Node deleteMiddle(Node head) {
    	
        if(head.next==null)
            return null;
        Node slow=head;
        Node fast=head.next.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
        
    }
}