package LinkedList;

import java.util.Scanner;

public class B2_returnKthToLast {

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
		int k = 3;
		System.out.println(returnKthToLast(head, k));
	}

	private static int returnKthToLast(Node<Integer> head, int k) {
		if(head==null) {
			return -1;
		}
		Node<Integer> temp = head;
		int len =0;
		while(temp != null) {
			len++;
			temp = temp.next;
		}
		int pos = (len-k)+1;
		Node<Integer> curr = head;
		int i =1;
		int ans = 0;
		while(curr != null) {
			if(i == pos) {
				ans = curr.data;
				break;
			}
			else {
				i++;
				curr = curr.next;
			}
		}
		return ans;
	}

}
