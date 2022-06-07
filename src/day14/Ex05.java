package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		SimpleDateFormat fo = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 -----");
		String s = fo.format(t);
		System.out.println(s);
		
		Date date = new Date();
		System.out.println(date);
		
		String r = fo.format(date);
		System.out.println(r);
		
		for(int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000); // 1/입력된 숫자의 속도로 출력해줌(출력 속도 조절) 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//try, catch  = 예외처리
			System.out.println(i);
		}
		
		
	}
}










