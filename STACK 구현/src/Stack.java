public class Stack {
	 
	// size 변수, top 변수, stack 배열 선언
	int size;
	int top;
	int[] stack;
	
	// 생성자 만들기
	public Stack(int size) {
		this.size = size;
		top = -1;
		stack = new int[size];
	}
	
	// stack 배열이 비어있는지 확인하기 위한 isEmpty 메소드
	public boolean isEmpty() {
		return top == -1;
	}
	
	// stack 배열이 꽉 차있는지 확인하기 위한 isFull 메소드
	public boolean isFull() {
		return top == size-1;
	}
	
	// stack 배열이 꽉 차있지 않으면 삽입할 수 있는 push 메소드
	public void push(int num) {
		if (!isFull()) {
			stack[++top] = num;
		}
		else {
			System.out.println("스택이 가득 찼습니다.");
		}
	}
	
	// stack 배열에 값이 하나라도 있을 때 값을 출력하고 삭제하기 위한 pop 메소드
	public int pop() {
		if (!isEmpty()) {
			return stack[top--];
		}
		else {
			System.out.println("스택이 비어있습니다.");
			return 0;
		}
	}
}
