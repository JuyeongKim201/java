package ch7_OOP;

class Product {
	int price; // 제품 가격 
	int bonusPoint;  // 보너스포인트
	
	Product(int price){ // 생성자 추가
		this.price = price; // 매개변수와 이름 겹치므로 this.로 정확히 지정해줌
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다. 
		super(100); // Product(100)을 호출
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		// 출력문에 p를 호출했을 때 p.toString()의 결과인 "Tv" 대신 "텔레비전"이 출력됨
		return "텔레비전"; 
	}
}

class Computer extends Product {
	Computer(){
		super(200); // Product(200)을 호출
	}
	
	public String toString() {
		return "컴퓨터";
	}
}


class Buyer {
	int money = 1000;  // 소유 금액
	int bonusPoint = 0; // 보너스포인트
	
	// 구입 목록 추가 
	Product[] cart = new Product[10]; // 구입한 물건을 담을 배열
	int i=0;
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구입하실 수 없습니다.");
			return;
		}
		
		money -= p.price; // 가진 돈 - 구입한 제품의 가격 
		bonusPoint += p.bonusPoint; // 해당 제품의 보너스포인트 받음 
		cart[i++] = p; // 구매 목록(cart)에 해당 제품 추가 
		System.out.println(p + "을/를 " + p.price + "원에 구입하셨습니다.");
	}
	
	void checkState() {
		System.out.println("현재 잔액: " + money);
		System.out.println("현재 보너스포인트: " + bonusPoint);
	}
	
	void checkTotalBuying() {  
		int sum = 0;
		for (int i = 0; i < this.cart.length; i++) {
			if(cart[i] != null) {
				sum += cart[i].price;
			}
		}
		
		System.out.println("지금까지 구입하신 금액은 총 "+sum+"원 입니다.");
		return;
	}
	
	void checkBuyingList() {
		String names = "";
		for (int i = 0; i < this.cart.length; i++) {
			if(cart[i] != null) {
				names += "[" + cart[i] +"]";
			}
		}
		
		System.out.println("지금까지 구입하신 물건은"+names+"입니다.");
	}
}

public class Ch7_Polymorphism2 {

	public static void main(String[] args) {
		Buyer jay = new Buyer();

		jay.buy(new Tv()); 
		jay.checkState();

		jay.buy(new Computer()); 
		jay.checkState();
		
		System.out.println("----------");
		
		jay.checkTotalBuying();
		jay.checkBuyingList();

	}
}
