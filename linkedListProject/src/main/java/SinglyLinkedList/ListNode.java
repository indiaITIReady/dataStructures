package SinglyLinkedList;

public class ListNode {

	private int data;
	private ListNode node;

	public ListNode(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setNext(ListNode node) {
		this.node = node;
	}

	public ListNode getNext() {
		return this.node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
