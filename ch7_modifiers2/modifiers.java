package ch7_modifiers2;

import ch7_modifiers.MyParent; // 다른 패키지의 클래스는 import 후 상속가능

//다른 패키지의 public 클래스를 여기서 상속
class MyChild extends MyParent{
	public void printMembers() {		
		System.out.println(int_public); // OK
		System.out.println(int_protected); // OK. 다른 패키지이지만 자손 클래스라 접근가능
//		System.out.println(int_default); // 에러
//		System.out.println(int_private); // 에러 
	}
}

public class modifiers {

	public static void main(String[] args) {
		MyChild p = new MyChild();
		
		// 같은 클래스에서의 접: 모두 가능
		p.printMembers(); 
		 
		System.out.println(p.int_public); // OK
//		System.out.println(p.int_protected); // 여기는 자손 클래스가 아니므로 접근 불가
//		System.out.println(p.int_default); // 에러 
//		System.out.println(p.int_private); // 에러
	}
}
