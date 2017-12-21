package SinglyLinkedList;

public class SingliLinkedListOperations {

	private ListNode insertInLinkedList(ListNode headNode, ListNode nodeToInsert, int position) {
		if (headNode == null) {
			return nodeToInsert;
		}

		if (position == 1) {
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			ListNode previousNode = headNode;
			int index = 1;
			while (index != position - 1) {
				previousNode = previousNode.getNext();
			}
			ListNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return nodeToInsert;

	}

	private ListNode createLinkedList(ListNode headNode, ListNode newNode) {
		headNode.setNext(newNode);
		newNode.setNext(null);
		headNode = newNode;
		return headNode;
	}

	
	private void traverseLinkedlist(ListNode headNode) {
		do {
			System.out.println(headNode.getData());
			headNode = headNode.getNext();
		} while (headNode != null);
	}

	public static void main(String[] args) {
		ListNode headNode = new ListNode(1);
		SingliLinkedListOperations ops = new SingliLinkedListOperations();
		ListNode newNode;
		ListNode currentNode = headNode;
		int i = 2;
		while (i <= 10) {
			newNode = new ListNode(i);
			currentNode = ops.createLinkedList(currentNode, newNode);
			i++;
		}

		ops.traverseLinkedlist(headNode);
	}

}
