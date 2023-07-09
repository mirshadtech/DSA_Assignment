public class Assignment5 {
	
    public Node removeLoop(Node head) {
        Node slow=head;
        Node fast=head;
        Node element=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head.next;
                fast=fast.next;
                element=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                    element=element.next;
                }
            }
        }
        element.next=null;
        return head;
    }
}