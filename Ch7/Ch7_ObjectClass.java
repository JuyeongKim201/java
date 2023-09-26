package Ch7;

public class Ch7_ObjectClass {

	public static void main(String[] args) {
		testClass tc = new testClass();
		System.out.println(tc.toString());
		System.out.println(tc);

	}

}


class testClass {
	
}


/* 자동으로 이런 코드가 컴파일된다.

class testClass extends Object {
	
}

*/