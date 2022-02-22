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
		for (int i = front; i < rear; i++) {
			System.out.println(arr[i]);
		}

	}
}

public class QueueDemo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		QueueUsingArrays q = new QueueUsingArrays();
		System.out.println("Enter the element");
		q.enqueue(input.nextInt());
		System.out.println("Enter the element");
		q.enqueue(input.nextInt());
		System.out.println("Deque element....");
		System.out.println(q.dequeue());
		System.out.println("Print queue elements...");
		q.queueDisplay();
		System.out.println("Enter the element");
		q.enqueue(input.nextInt());
		System.out.println("Enter the element");
		q.enqueue(input.nextInt());
		System.out.println("Enter the element");
		q.enqueue(input.nextInt());
		System.out.println("Deque element....");
		System.out.println(q.dequeue());
		System.out.println("Print queue elements...");
		q.queueDisplay();

	}
}