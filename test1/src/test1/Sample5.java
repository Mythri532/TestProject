package test1;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int rem=0;
		int rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev+(rem*rem*rem);
			num=num/10;
		}
		if(num==rev) {
			   System.out.println("Armstrong number");

        } else {

                       System.out.println("Not an Armstrong number");

        }
		}
	}


