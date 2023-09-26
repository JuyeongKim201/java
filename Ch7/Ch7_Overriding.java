package Ch7;

public class Ch7_Overriding {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.x = 1;
		p1.y = 2;
		
		Point3D p2 = new Point3D();
		p2.x = 4;
		p2.y = 3;
		p2.z = 2;

		p1.getLocation();
		p2.getLocation();
	}

}


class Point2D {
	int x;
	int y;
	
	void getLocation() {
		System.out.printf("x좌표(%d),y좌표(%d)%n", x, y);
	}
}

// 자손메서드 Point3D 생성 
class Point3D extends Point2D{
	int z;
	
	// 메서드 오버라이딩
	void getLocation() { 
		System.out.printf("x좌표(%d),y좌표(%d),z좌표(%d)%n", x, y, z);
	}
}
