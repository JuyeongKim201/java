package Ch7;

public class Ch7_Inheritance {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

		System.out.println(parent.age); // 0
		System.out.println(child.age); // 5

		child.play();
	}

}

class Parent {
	// 인스턴스 변수 age 선언
	int age;
}

class Child extends Parent {
	// 인스턴스 변수 age를 선언받음
	
	// 기본생성자로 age에 5 초기화
	Child(){ 
		age = 5;
	}
	
	void play() {
		System.out.println("애들아 놀자~");
	}
}
