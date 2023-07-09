public class Assignment8
{
    boolean isCircular(Node head)
    {
	    Node pointer = head;
	    while(pointer!=null){
	        pointer=pointer.next;
	        if(pointer==head)
	            return true;
	    }
	    return false;
    }
}