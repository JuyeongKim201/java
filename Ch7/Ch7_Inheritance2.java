package Ch7;

public class Ch7_Inheritance2 {

	public static void main(String[] args) {
		print2D a = new print2D(); 
		print3D b = new print3D();
		
		// 자식클래스의 변화는 부모클래스에 영향 X
		b.x = 1;
		b.y = 2;
		b.z = 3;

		System.out.println(a.x);
		System.out.println(a.y);
		
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		
		// 부모클래스의 변화도 이미 생성된 자식인스턴스에는 영향 X
		a.x = 10;
		a.y = 9;

		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		
		// 새로 만든다면 영향 O 
		print3D c = new print3D();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);		
	}

}

class print2D {
	int x = 10;
	int y;
}

class print3D extends print2D {
	int z;
}
