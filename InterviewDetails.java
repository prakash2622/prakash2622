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

		public void displaynode() {
			System.out.println(data + " ");
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
		if (front == null) // no Node in Q
			System.out.println("Queue is Empty");
		else {
			Node current = front;
			while (current != null) {
				current.displaynode();
				current = current.next;
			}
		}
	}

	public boolean isEmpty() {
		return front == null;
	}

	public String peek() {
		if (front == null) // no Node in Q
			System.out.println("Queue is Empty");
		return front.data;
	}
}

public class InterviewDetails {
	public static void main(String args[]) {
		Interview person = new Interview();
		Scanner input = new Scanner(System.in);

		char ch;
		do {
			System.out.println("******************************************");
			System.out.println("1.Insert a interview candidate..");
			System.out.println("2.Candidate remove from interview room ");
			System.out.println("3.Peek");
			System.out.println("******************************************");
			System.out.println("Enter your choice : ");
			int option = input.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter a candidate : ");
				input.nextLine();
				person.enqueue(input.nextLine());
				break;
			case 2:
				System.out.println("remove candidate : " + person.dequeue());
				break;
			case 3:
				System.out.println("peek candidate : " + person.peek());
			default:
				System.out.println("Invalid option!!!check your option");
			}
			System.out.println("Display Candidate Waiting list :");
			person.queueDisplay();

			System.out.println("\nDo you want to continue (Type y or n)");
			ch = input.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		System.out.println("Thank you for...");
	}
}