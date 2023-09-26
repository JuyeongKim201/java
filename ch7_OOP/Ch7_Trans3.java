package ch7_OOP;

///////
class Car { }
class FireEngine extends Car { }
class Ambulance extends Car { }

public class Ch7_Trans3 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof Object); // true
		System.out.println(fe instanceof Car); // true
		System.out.println(fe instanceof FireEngine); // true
		System.out.println(fe instanceof Ambulance); // 에러 
		
//		void doWork(Car c) {
//			if (c instanceof FireEngine) { // 'c 주소값에 있는 객체가 FireEngine 또는 그의 자손입니까?'
//				FireEngine fe = (FireEngine)c;	
//				// ...
//			} else if (c instanceof Ambulance) { 
//				Ambulance ab = (Ambulance)c;
//				/// ... 
//			}
//		}

	}
}
