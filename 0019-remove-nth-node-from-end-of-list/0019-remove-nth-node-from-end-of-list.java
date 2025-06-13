class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode();
        dummy.next=head;

        ListNode firstprt=dummy;
        ListNode secondprt=dummy;

        for(int i=0;i<n;i++){
            secondprt=secondprt.next;
        }
        while(secondprt!=null && secondprt.next!=null){
            firstprt=firstprt.next;
            secondprt=secondprt.next;
        }
        firstprt.next=firstprt.next.next;
        return dummy.next;
    }
}
