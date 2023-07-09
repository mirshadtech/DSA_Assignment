public class Assignment6
{
    static void linkdelete(Node head, int M, int N)
    {
        Node point = head;
        while(point!=null){
        for(int i=1;i<M && point!=null;i++){
            point=point.next;
        }
        for(int i=0;i<N && point!=null && point.next!=null;i++){
            point.next=point.next.next;
        }
        if(point!=null)
            point=point.next;
        }
        
    }
}