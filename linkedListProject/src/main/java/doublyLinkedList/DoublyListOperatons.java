package doublyLinkedList;

public class DoublyListOperatons {
	
	private DoublyListNode insertNode(DoublyListNode head, DoublyListNode nodeToInsert, int position) {
		
		DoublyListNode previousNode = head;
		int index = 1;
		while(index != position) {
			previousNode = head.getNextNode();
		}
		  DoublyListNode currentNode = previousNode.getNextNode();
		  nodeToInsert.setNextNode(currentNode);
		  if(currentNode != null) {
			  currentNode.setPreviousNode(nodeToInsert);
		  }
		  
		  previousNode.setNextNode(nodeToInsert);
		  nodeToInsert.setPreviousNode(previousNode);
		  return head;
	}
	
	private DoublyListNode createDoublyList(DoublyListNode head, int data){
		DoublyListNode newNode = new DoublyListNode(data);
		newNode.setNextNode(null);
		newNode.setPreviousNode(head);
		head.setNextNode(newNode);
		return newNode;	
	}
	
	private Boolean searchNode(DoublyListNode headNode, DoublyListNode nodeToSearch) {
		DoublyListNode currentNode = headNode;
		while(currentNode != null) {
			
			if(currentNode.getData() == nodeToSearch.getData()) {
				return true;
			}
			currentNode = currentNode.getNextNode();
		}
		
		return false;
	}
	
	private void traverseList(DoublyListNode head) {
		DoublyListNode currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}
	
	public static void main(String[] args) {
			  DoublyListOperatons dl = new DoublyListOperatons();
		      DoublyListNode head = new DoublyListNode(1);
		      int index = 2;
		      DoublyListNode currentNode = head;
		      while(index != 10) {
		    	  currentNode = dl.createDoublyList(currentNode, index);
		    	  index++;
		      }
		      
		      dl.traverseList(head);
		      DoublyListNode nodeToSearch = new DoublyListNode(45);
		      Boolean flag = dl.searchNode(head, nodeToSearch);
		      System.out.println(flag);
	}
}