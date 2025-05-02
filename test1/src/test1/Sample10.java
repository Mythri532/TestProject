package test1;
abstract class Suma{
	abstract void bark();
}
	class Sumathi extends Suma{
		void bark() {
			System.out.println("barking");
			
		}
	}

public class Sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Suma s=new Sumathi();
s.bark();
	}

}






