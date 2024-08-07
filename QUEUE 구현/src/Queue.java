public class Queue {
	
	// size, front, rear 변수와 queue 배열 선언
	int size;
	int front;
	int rear;
	int[] queue;
	
	// 생성자 만들기
	public Queue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		queue = new int[size];
	}
	
	// queue가 비어있는지 확인하기 위한 isEmpty 메소드 구현
	public boolean isEmpty() {
		return front == rear;
	}

	// queue가 가득 차있는지 확인하기 위한 isFull 메소드 구현
	public boolean isFull() {
		return rear == size - 1;
	}
	
	// queue가 가득 차지 않았을 때 num을 queue에 넣기 위한 enQueue 메소드 구현
	public void enQueue(int num) {
		if (!isFull()) {
			queue[++rear] = num;
		}
		else {
			System.out.println("큐가 가득 찼습니다.");
		}
	}
	
	// queue가 비어있지 않을 때 값을 출력하고 삭제하기 위한 deQueue 메소드 구현
	public int deQueue() {
		if (!isEmpty()) {
			return queue[++front];
		}
		else {
			System.out.println("큐가 비어있습니다.");
			return 0;
		}
	}
	
	// queue가 비어있지 않을 때 값을 확인하기 위한 Qpeek 메소드 구현
	public int Qpeek() {
		if (!isEmpty()) {
			return queue[front+1];
		}
		else {
			System.out.println("큐가 비어있습니다.");
			return 0;
		}
	}
	
	// queue의 사이즈를 구하기 위한 size 메소드 구현
	public int size() {
		return rear - front;
	}
	
}
