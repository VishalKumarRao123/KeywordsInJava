package KeyWords;
class AC{
	public static void f1() {
		System.out.println("Parent");
	}
}
class BC extends AC{
	public static void f1() {
		
		System.out.println("Child");
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
	   BC.f1();
	}

}
