
public class P {

	public static void main(String[] args) 
	{
		P.m1();
		P m2=new P();
		m2.m2();

	}
 public static void m1()
 {
	 System.out.println("static method");
 }
 public void m2()
 {
	 System.out.println("non static method");
 }
}
