package Ch7;

import ch7_OOP.Car;

public class Ch7_Composite {

	public static void main(String[] args) {
		Car c = new Car();
		
		System.out.println(c.e.gear);
		System.out.println(c.e.color);
		System.out.println(c.e.size);
		
		c.speed = 10;
		System.out.println(c.speed);
		c.speedUp();
		System.out.println(c.speed);
		
	}

}


// 최종 완성체
class Car {
	static int speed;
	
	// 작은 부품들을 포함 
	Engine e = new Engine(); // 엔진 
	Door[] d = new Door[4]; // 문의 개수를 넷으로 가정하고 배열로 처리
	
	// 기능들은 메서드로 정의
	int speedUp() {
		speed += 100;
		
		return speed;
	}
}

// 작은 속성1 - 엔진
class Engine {
	String gear = "auto";
	String color = "silver";
	String size = "big";
}

// 작은 속성2 - 문짝 
class Door {
	// ... 
}