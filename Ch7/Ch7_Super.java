package Ch7;

public class Ch7_Super {

	public static void main(String[] args) {
		ChildSuper cs = new ChildSuper();
		cs.run();
	}

}


// 부모클래스 
class ParentSuper {
	int x = 10; // super.x
}

// 자식클래스 ChildSuper 생성 
class ChildSuper extends ParentSuper{
	int x = 20; // this.x 
	
	void run() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}

}
