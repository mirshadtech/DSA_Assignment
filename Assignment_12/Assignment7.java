public class Assignment7 {
    
    public void mergeAlt(Node head1, Node head2){
        Node p1=head1;
        Node p2=head2;
        while(p1!=null && p2!=null){
            Node temp1=p1.next;
            p1.next=p2;
            p2=p2.next;
            p1.next.next=temp1;
            p1=temp1;
        }
    }
}