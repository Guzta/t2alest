package calculator;

public class Pilha {

	Node head;
	int count;

	class Node {
		int element;
		Node next;

		public Node(int e) {
			this.element = e;
		}
	}

	public void push(int e) {
		Node n1 = new Node(e);
		Node aux = head;
		head = n1;
		head.next = aux;
		count++;
	}

	public int pop() {
		if (count == 0) {
			System.out.println("Erro!");
		}
		Node aux = head;
		head = head.next;
		count--;

		return aux.element;
	}

	public int top() {
		if (count == 0) {
			System.out.println("Erro");
		}
		return head.element;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public void clear() {

	}

}
