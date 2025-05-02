package test1;
interface Sonu{
	 void bark();
	
}

class Sonu1 implements Sonu{
	public void bark() {
		System.out.println(" Animal running");
	}
}

public class Sample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sonu1 a=new Sonu1();
a.bark();

	}

}
