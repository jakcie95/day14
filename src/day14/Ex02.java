package day14;

class Calc{
	public void display() {//부모클래스
		System.out.println("계산기 입니다.");
	}
}
class Computer extends Calc{//자식클래스, extends 부모클래스로 상속
	public void print() {
		System.out.println("컴퓨터 입니다.");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Computer calc = new Computer();
		calc.print();
		calc.display();
	}

}
