package ch7_modifiers;


public class MyParent{
	public int int_public; // 범위: 프로젝트 파일 내 어디서든 접근가능
	protected int int_protected; // 범위: 같은 패키지 + 자손 클래스 접근가능
	int int_default; // 범위: 같은 패키지 접근가능 
	private int int_private; // 범위: 같은 클래스 접근가능 
	
	public void printMembers() {		
		System.out.println(int_public);
		System.out.println(int_protected);
		System.out.println(int_default);
		System.out.println(int_private); 
	}
}

class modifiers {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		
		// 같은 클래스에서의 접근: 모두 가능
		p.printMembers(); 
		
		// 같은 패키지의 다른 클래스: private 제외 접근가능 
		System.out.println(p.int_public);
		System.out.println(p.int_protected);
		System.out.println(p.int_default);
//		System.out.println(p.int_private); // The field MyParent.int_private is not visible
	}

}
