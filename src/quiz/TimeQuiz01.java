package quiz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeQuiz01 {
	private Date date;
	private SimpleDateFormat simple;
	public TimeQuiz01() {
		simple = 
	new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");//포맷
	}
	public void print() {
		String result = null;
		for(int i = 0; i < 10; i++) {
			date = new Date();//현재시간을 얻어옴, 
							  //반복문 안쪽에 있어야 시간이 진행됨
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			result = simple.format(date);
			System.out.println(result);
		}
	}
}



