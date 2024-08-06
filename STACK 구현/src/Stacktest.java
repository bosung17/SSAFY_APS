public class Stacktest {

	public static void main(String[] args) {
		
		// Stack 클래스를 통해 객체 st 생성
		Stack st = new Stack(3);
		
		// 1, 2, 3, 4 push 해보기 (1, 2, 3 은 push 되지만 4는 안 됨) 
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		// pop 4번 해보기 (나중에 들어간 3부터 처음에 들어간 1까지 pop 되고 4번째 pop은 안 됨)
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
}
