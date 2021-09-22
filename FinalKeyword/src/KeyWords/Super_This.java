package KeyWords;
class A{
	protected int x=0;
}
class B extends A{
	private int x;
	 public void f1() {
		int x;
		x=5;
		this.x=10;
		super.x=15;
		System.out.println(x+" "+this.x+" "+super.x);
	 }
	}
public class Super_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B obj = new B();
       obj.f1();
	}

}
