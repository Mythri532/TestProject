package test1;
class Dog{
	void bark() {
		System.out.println("dog is barking");
		
	}
}
class Dog1 extends Dog{
	void bark() {
		System.out.println("dog is running");
	}
}

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog1();
d.bark();
	}

}
