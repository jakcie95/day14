package day14;
class C01{//protected : 상속받은 자식클래스나 패키지에서는 접근 가능
	protected String n;//변수도 상속
}
class C02 extends C01{
	public void test() {
		n = "안녕하세요";
		print();
	}
	public void print() {System.out.println(n);}
}
public class Ex04 {
	public static void main(String[] args) {
		C02 c = new C02();
		c.test();
	}
}











