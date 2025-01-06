package algo;

public class TestImpl {

	public Node rotateList(Node head, int n) 
	{
	    Node previous=null;
	    Node last=null;
	    Node current=head;
		while(n>0)
		{
    	    while(current.getNext()!=null)
    	    {
    	        previous=head;
    	        last=head.getNext();
    	        current=last.getNext();
    	    }
    	    last.setNext(head);
    	    previous.setNext(null);
    	    head=last;
    	    n=n-1;
		}
		return head;
	}
	
}

class Node{
	
	private String name;
	private Node next;
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
