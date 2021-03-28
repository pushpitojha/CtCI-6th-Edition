package LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class B1_RemoveDups {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head==null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		//head = removedups(head);
		head = removeUsingSet(head);
		print(head);
	}
	
	private static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	// removeUsingSet function has a time complexity of O(n).	----------> BETTER
	private static Node<Integer> removeUsingSet(Node<Integer> head){
		if(head==null || head.next == null) {
			return head;
		}
		HashSet<Integer> set = new HashSet<>();
		Node<Integer> curr = head, prev = null;
		while(curr !=null) {
				if(set.contains(curr.data)) {
					prev.next = curr.next;
				}
				else {
					set.add(curr.data);
					prev = curr;
				}
			curr = curr.next;
		}
		return head;
	}

	
	
	
	//removedups function has time complexity of O(n^2)
	private static Node<Integer> removedups(Node<Integer> head) {
		if(head==null) {
			return null;
		}
		Node<Integer> curr = head;
		while(head != null) {
			Node<Integer> runn = curr;
			while(runn.next != null) {
				if(curr.data == runn.next.data) {
						runn.next = runn.next.next;
				}
				else {
					runn = runn.next;
				}
			}
		}
		return head;
	}
	 
}
