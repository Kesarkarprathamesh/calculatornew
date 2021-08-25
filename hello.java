package helloworld;
import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		
		char operator;
	    Double num1,num2,result;
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter operator: +,*,-,/");
		operator=input.next().charAt(0);
		System.out.println("enter num1");
		num1=input.nextDouble();
		System.out.println("enter num2");
		num2=input.nextDouble();
		
		if(operator =='+') {
			result=num1+num2;
			System.out.println(num1+ "+" +num2+ "=" +result);	
		}
		else if(operator=='-') {
			result=num1-num2;
			System.out.println(num1+ "-" +num2+ "=" +result);	
		}
		else if(operator=='*') {
			result=num1*num2;
			System.out.println(num1+ "*" +num2+ "=" +result);
		}
		
		else if(operator=='/') {
			if(num2==0) {
			System.out.println("num2 cant be zero");
			}
			else {
			result=num1/num2;
			System.out.println(num1+ "/" +num2+ "=" +result);
			}
		}
		
	}

}
