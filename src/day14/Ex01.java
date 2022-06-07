package day14;
class DBconnect{
	private static DBconnect db;
	private static int cnt = 0;
	private DBconnect() { cnt++; }
	public int getCnt() {return cnt;}
	public void controllDB() {
		System.out.println("db사용");
	}
	public static DBconnect getInstance() {
		if(db == null) //db값이 null 일 경우 객체를 만듬
		db = new DBconnect();//이후 db값이 null 이 아님으로 이미 만들어진 객체를 이용
		return db;
	}
	
}
public class Ex01 {
public static void main(String[] args) {
	DBconnect db01 = DBconnect.getInstance();
	DBconnect db02 = DBconnect.getInstance();
	DBconnect db03 = DBconnect.getInstance();
	DBconnect db04 = DBconnect.getInstance();
	System.out.println(db01);
	System.out.println(db02);
	System.out.println(db03);
	System.out.println(db04);
	
	//db01.controllDB();
	System.out.println(db01.getCnt() + "명 연결 되었습니다.");
}
}
