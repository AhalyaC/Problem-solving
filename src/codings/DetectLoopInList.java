/*
 * package codings;
 * 
 * import java.util.*; import java.util.HashSet; import java.util.LinkedList;
 * 
 * 
 * public class DetectLoopInList {
 * 
 * static Node head;
 * 
 * static class Node{ int data; Node next; Node(int d){ data=d; next=null; } }
 * 
 * public static void push(int newNode) { Node node = new Node(newNode);
 * 
 * node.next=head; head=node; } public static boolean detect(Node h) {
 * 
 * HashSet<Node> hash = new HashSet<Node>();
 * 
 * while(h!=null) { if(hash.contains(h))
 * 
 * return true; hash.add(h); h=h.next; } return false;
 * 
 * 
 * }
 * 
 * public static void main(String[] args) { LinkedList l = new LinkedList();
 * l.push(29); l.push(2);
 * 
 * l.head.next.next.next.next.next=l.head; } }
 * 
 * 
 * 
 * // Java program to detect loop in a linked list //package codings; //import
 * java.util.*; //public class DetectLoopInList //{ // static Node head; // head
 * of list // /* Linked list Node
 */
//	static class Node {
//		int data;
//		Node next;
//		Node(int d)
//		{
//			data = d;
//			next = null;
//		}
//	}
//	static public void add(int newData)
//	{
//		Node newNode = new Node(newData);
//		newNode.next = head;
//		head = newNode;
//	}
//	static boolean checkLoop(Node n)
//	{
//		HashSet<Node> hset = new HashSet<Node>();
//		while (n != null) {
//			if (hset.contains(n))
//				return true;
//			hset.add(n);
//			n = n.next;
//		}
//		return false;
//	}
//	//Driver program
//	public static void main(String[] args)
//	{
//		LinkedList ll = new LinkedList();
//		ll.add(8);
//		ll.add(12);
//		ll.add(15);
//		ll.add(21);
//		ll.head.next.next.next.next = ll.head;
//		if (checkLoop(head))
//			System.out.println("Loop found");
//		else
//			System.out.println("No Loop found");
//	}
//}*/