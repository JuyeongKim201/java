package ch7_OOP;

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("Stop!");
	}
}

class FireEngine extends Car { // 소방차. 멤버 5개.  
	void water() { // 물을 뿌리는 기능 
		System.out.println("water!!");
	}
}

class Ambulance extends Car { // 구급차  
	void save() {  
		System.out.println("save~~~");
	}
}

public class Ch7_Trans {

	public static void main(String[] args) {
		FireEngine f = new FireEngine(); 
		
		f.stop();
		f.water();
		
		Car c = (Car)f; // 자손 (FireEngine) -> 조상 (Car) 타입으로 형변환
		
		
		f.water(); // OK. 참조변수 f는 그대로 유지됨
//		c.water(); // 에러. c는 f와 같은 주소값을 가리키지만 Car 타입임
		
		
		FireEngine f2 = (FireEngine)c; // OK. 조상 (Car) -> 자손 (FireEngine) 타입으로 형변환 
		
		f2.water(); // OK. 다시 버튼 많은 리모콘으로 변경한 셈 		
		
		
		// 참조변수의 범위가 가리키는 객체보다 넓어지면 안된다. 
//		Car cc = new Car();
//		FireEngine FF = (FireEngine)cc; // 에러. 
		
		
		////////////////
//		Car c = f; // 자손 -> 조상인 경우 형변환 연산자 생략가능
//		Ambulance a = (Ambulance)f; // 에러. 상속관계가 아닌 클래스 간의 형변환 불가
	}

}