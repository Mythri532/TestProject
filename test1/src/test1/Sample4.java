package test1;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12345;
int rem=0;
int rev=0;
while(num>0) {
	rem=num%10;
	rev=(rev*10)+rem;
	num=num/10;
}
System.out.println("Reverse of a string " +rev);
}
	

}
