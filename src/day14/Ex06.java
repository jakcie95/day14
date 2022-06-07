package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 예외처리 : 프로그램에서 예외적인 상황을 처리하는 것.
 		- 프로그램을 종료시키지 않는다.
 강제예외 : throw
 예외전가 : throws
 예외처리 : try, catch
 */
public class Ex06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x, y, result = 0;
	System.out.println("수 입력");
	try {
		x = sc.nextInt();
		y = sc.nextInt();
		result = x/y;
		//문제가 발생할 소지가 있는 코드를 try, catch사이에 넣어준다
		//문제가 없으면 다음 문장 실행, 문제 발생시 catch로 넘어가서 실행
	} catch (Exception e) {//catch(오류 문구 + e)
		//System.out.println("0을 입력하면 안돼요");
		e.printStackTrace();
		//예외상황 발생을 기록 @중요
	//}catch(InputMismatchException e) {
		//System.err.print("문자는 안돼요");
		//err.print : 빨간색 문자로 출력됨
		//부모 형태인 Exception 이 다른 예외의 경우들을 상속함으로 Exception으로 예외처리 가능
	}
	System.out.println(result);
	}
}






