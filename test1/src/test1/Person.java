package test1;


class Person1{
private String name;

public void setName(String n){
name=n;
 
}
public String getName(){
return name;
}
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1();     // Creating an object of Dog class 
        p.setName("buddy");      // Setting the name property
                // Setting the age property
        System.out.println(p.getName());              // Calling the bark() method
	}

}
