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
	Scanner input = new Scanner(System.in);
		QueueUsingArrays q = new QueueUsingArrays();
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the element");
			q.enqueue(input.nextInt());
		}
		System.out.println("Deque element : " + q.dequeue());
		System.out.print("Print queue elements : ");
		q.queueDisplay();
		System.out.println("\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the element");
			q.enqueue(input.nextInt());
		}
		System.out.println("Deque element : " + q.dequeue());
		System.out.print("Print queue elements :");
		q.queueDisplay();

	}
}
