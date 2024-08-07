public class Queuetest {
	
	public static void main(String[] args) {
		
		// Queue 클래스를 통해 객체 qu 생성
		Queue qu = new Queue(3);
		
		// 1, 2, 3, 4 삽입
		qu.enQueue(1);
		qu.enQueue(2);
		qu.enQueue(3);
		qu.enQueue(4);
		
		// 1 출력
		System.out.println(qu.deQueue());
		
		// 사이즈 출력
		System.out.println(qu.size());
		
		// 2 출력
		System.out.println(qu.deQueue());
		
		// 3 확인
		System.out.println(qu.Qpeek());
		
		// 3 출력
		System.out.println(qu.deQueue());
		
		// 비어있는 경우 출력
		System.out.println(qu.deQueue());
	}
}