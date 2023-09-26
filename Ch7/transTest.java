package Ch7;

class a { }
class aB extends a { }
class aC extends a { }

public class transTest {

public static void main(String[] args) {
	aB ab = new aB();
	System.out.println(ab instanceof Object); // true
	System.out.println(ab instanceof a); // true
	System.out.println(ab instanceof aB); // true
	System.out.println(ab instanceof Ch7.aC); // ? 
	}
}
