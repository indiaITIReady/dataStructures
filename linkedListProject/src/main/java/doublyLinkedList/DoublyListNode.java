package doublyLinkedList;

public class DoublyListNode {

	private int data;
	private DoublyListNode nextNode;
	private DoublyListNode previousNode;
	
	public DoublyListNode(int data) {
		this.data = data;
		nextNode = null;
		previousNode = null;
	}
	
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public DoublyListNode getNextNode() {
		return nextNode;
	}


	public void setNextNode(DoublyListNode nextNode) {
		this.nextNode = nextNode;
	}


	public DoublyListNode getPreviousNode() {
		return previousNode;
	}


	public void setPreviousNode(DoublyListNode previousNode) {
		this.previousNode = previousNode;
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
