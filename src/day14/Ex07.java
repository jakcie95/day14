package day14;

class D01{
	public void test() {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//예외전가를 할경우 
		//호출된 다른 클래스로 예외처리가 전가됨
		//try, catch 혹은 throw로 상황에 맞게 예외 처리
	}
}
class D02 extends D01{
	public void test2() {
		test();
	}
}

public class Ex07 {

	public static void main(String[] args)  {
		D02 d = new D02();
		d.test2();
		
		try {
			System.out.println(10/2);
			//문제 발생시 catch실행 -> finally실행 ->다음 문장 실행
			//
		} catch (Exception e) {
			System.out.println("catch 실행");
		}finally {
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장들 실행 !");
	}

}











