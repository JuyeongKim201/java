package Ch7;

import static java.lang.System.out;
import static java.lang.Math.*;

public class Ch7_StaticImport {

	public static void main(String[] args) {
//		System.out.println(Math.random());
		out.println(random());
		
//		System.out.println("Math.PI: "+Math.PI);
		out.println("Math.PI: "+ PI);
		
		testAbstract ab = new testAbstract(); // 에러. 추상 클래스의 객체 생성불가
		
	}
}

abstract class testAbstract {
	abstract void move();
}


