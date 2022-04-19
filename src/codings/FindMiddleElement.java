package codings;

import java.util.LinkedList;

import javax.print.event.PrintJobAttributeListener;

import org.w3c.dom.Node;


public class FindMiddleElement {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void push() {
		
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(fastPtr!= null && fastPtr.next!=null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
		}
		
		System.out.println("Middle Element "+slowPtr.data);
	}
	
	public static void pus(int new_data)
    {
        Node new_node = new Node(new_data);
 
        new_node.next = head;
 
        head = new_node;
    }
	
	public static void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }
	public static void main(String[] args) {
		LinkedList<Integer> list =  new LinkedList<>();
		
		for(int i=5;i>0;--i) {
			pus(i);
			printList();
			push();
		}
	}
}
