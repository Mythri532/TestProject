package test1;

class Appu{
int SPEED_LIMIT=400;

final void run() {    
	  System.out.println("running safely with 100kmph");   //we cannot change the final variable    
	  }   
}

public class Mythri extends Appu{
void run()
{
System.out.println("running safely with 100kmph");  
}

public class Sample10 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Appu a=new Appu();
a.run();
	}

}
}

