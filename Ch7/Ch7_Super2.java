package Ch7;

public class Ch7_Super2 {

	public static void main(String[] args) {
		Child1 c1 = new Child1(1,2,3);
	}
}



class Parent1 {
	int x;
	int y;
	
	// Parent1 () 기본생성자 없음
	
	Parent1(int x, int y){
		// super(); 자동 추가 -> Object(); 호출
		this.x = x;
		this.y = y;
		System.out.println("x: "+x+" y: "+y);
	}
}


class Child1 extends Parent1 {
	int z;
	
	Child1(int x, int y, int z){
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
