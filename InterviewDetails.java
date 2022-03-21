import java.util.*;

class Interview {
	Node front, rear;

	Interview() {
		front = null;
		rear = null;
	}

	static class Node { // class node
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void enqueue(String data) {
		Node newNode = new Node(data);
		if (front == null)
			front = newNode;
		else
			rear.next = newNode;
		rear = newNode;
	}

	public String dequeue() {
		if (front == null) // no Node in Q
			System.out.println("Queue is Empty");
		String temp = front.data;
		front = front.next;
		return temp;
	}

	public void queueDisplay() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public boolean isEmpty() {
		return front == null;
	}

	public String peek() {
		if (front == null) // no Node in Q
			throw new IndexOutOfBoundsException("Queue is Empty");
		return front.data;
	}
}

public class InterviewDetails {
	public static void main(String args[]) {
		Interview person = new Interview();
		int option;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1.Insert a interview candidate..");
			System.out.println("2.Candidate remove from interview room ");
			System.out.println("3.Candidate waiting list");
			System.out.println("Enter your choice : ");
			option = input.nextInt();
			switch (option) {
			case 1: 
				System.out.println("Enter a candidate");
				person.enqueue(input.nextLine());
				break;
			case 2: 
				System.out.println("remove candidate "+person.dequeue());
				break;
			case 3: 
				person.queueDisplay();
				break;
			}
			
		} while (option!= 0);
		System.out.println("Exit Successfully");
	}
}