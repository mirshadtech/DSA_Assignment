public class Assignment3 {
    public Node removeNthFromEnd(Node head, int n) {
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++) { 
        	fast=fast.next;
        }
        if(fast==null) return head.next;
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow.next;
    }
}