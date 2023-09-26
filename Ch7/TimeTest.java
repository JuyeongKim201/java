package Ch7;

class time {
	// 접근 제어자를 private으로 바꿔 class 외부에서 직접 접근하지 못하도록 수정 
	private int hour; 
	private int minute; 
	private int second; 
	
	public void setTime(int h,int m,int s) {
		if (isNotValidTime(h, m, s)) {
			System.out.println("범위 내의 올바른 값을 입력하세요.");
			return ;
		} else {
			System.out.printf("%d시 %d분 %d초 저장되었습니다. %n", h, m, s);
			this.hour = h;
			this.minute = m;
			this.second = s;
		}
	}
	
	public void getTime() {
		System.out.printf("현재 세팅된 시각은 %d시 %d분 %d초 입니다. %n", this.hour, this.minute, this.second);
	}
	
	// 시간 판별 메서드 추가 
	private boolean isNotValidTime(int h, int m, int s) {
		if (h > 24 || m > 59 || s > 59) return true;		
		else return false;
	}
}

public class TimeTest {

	public static void main(String[] args) {
		time t = new time();
		
		// iv에 바로 접근할 수 없다. 
//		t.hour = 200; // 에러 
//		t.minute = 320; // 에러 
//		t.second = 100; // 에러 
		
		// 메서드를 통한 간접 접근 
		t.setTime(300, 20, 30);
		t.getTime();
		t.setTime(23, 15, 30);
		t.getTime();
		

	}

}




