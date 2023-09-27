package ch7_OOP;

/* 추상 클래스 정의 */
abstract class Asian {
	int regionCode;
	
	abstract void sayHello();
	
	void sayRegionCode(int regionCode) {
		System.out.println("저의 지역번호는 " + regionCode + " 입니다.");
	}
}

/* Asian 추상클래스 구현1 - Korean */
class Korean extends Asian {
	/* 기본 생성자 */
	Korean(){
		this.regionCode = 82; // this가 필수는 아니지만, 가독성에 도움이 됨
	}
	
	void sayHello() {
		System.out.println("안녕하세요~");
	}
	
	/* Korean 클래스에만 있는 메서드 */
	void sayGoodbye() {
		System.out.println("잘가~");
	}
	
}

/* Asian 추상클래스 구현2 - Korean */
class Japanese extends Asian {
	Japanese(){
		this.regionCode = 81;
	}
	
	void sayHello() {
		System.out.println("곤니치와~");
	}
}


/* 구현 테스트 */
public class Ch7_AbstractClass2 {

	public static void main(String[] args) {
		Korean kim = new Korean();
		kim.sayHello();
		kim.sayRegionCode(kim.regionCode);  
		kim.sayGoodbye();
		
		Japanese sato = new Japanese();
		sato.sayHello();
		sato.sayRegionCode(sato.regionCode);  
//		sato.sayGoodbye(); // 에러. 접근할 수 없음. 
		
		
		/* 다형성 활용하기 */ System.out.println("------다형성 활용하기------");
		
		Asian kim2 = new Korean();
		kim2.sayHello();
		kim2.sayRegionCode(kim2.regionCode);  	
//		kim2.sayGoodbye(); // 에러. 객체는 Korean이지만 참조변수가 Asian 타입이기 떄문
		
	}
}
