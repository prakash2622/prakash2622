import java.util.*;

class QueueUsingArrays {
	static final int MAX_SIZE = 5;
	int arr[];
	int front, rear;

	QueueUsingArrays() {
		arr = new int[MAX_SIZE];
		front = 0;
		rear = 0;
	}

	public void enqueue(int val) {
		arr[rear] = val;
		rear++;
	}

	public int dequeue() {
		return arr[front++];
	}

	public void queueDisplay() {
		if (front == rear) {
			System.out.printf("Queue is Empty\n");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

	public void peek() {
		if (front == rear) {
			System.out.printf("Queue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element : %d", arr[front]);
		return;
	}
}

public class QueueDemo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		QueueUsingArrays q = new QueueUsingArrays();
		q.queueDisplay();
		System.out.println();
		for (int i = 1; i < q.MAX_SIZE - 2; i++) {
			System.out.println("Enter the element");
			q.enqueue(input.nextInt());
		}
		System.out.println("Deque element : " + q.dequeue());
		System.out.println();
		System.out.print("Print queue elements : ");
		q.queueDisplay();
		System.out.println("\n**********************");
		for (int i = 1; i < q.MAX_SIZE - 1; i++) {
			System.out.println("Enter the element");
			q.enqueue(input.nextInt());
		}
		System.out.println("Deque element : " + q.dequeue());
		System.out.println();
		System.out.print("Print queue elements : ");
		q.queueDisplay();
		System.out.println("\n*************************");
		q.peek();
	}
}
