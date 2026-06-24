import java.util.*;
class Salary{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter your salary: ");
	int salary = input.nextInt();
	
	int notes = salary/5000;
	salary = salary%5000;
	System.out.println("5000 notes: "+notes);
	
	
	 notes = salary/1000;
	salary = salary%1000;
	System.out.println("1000 notes: "+notes);
	
	 notes = salary/500;
	salary = salary%500;
	System.out.println("500 notes: "+notes);
	
	 notes = salary/100;
	salary = salary%100;
	System.out.println("100 notes: "+notes);
	
	 notes = salary/50;
	salary = salary%50;
	System.out.println("50 notes: "+notes);
	
	 notes = salary/20;
	salary = salary%20;
	System.out.println("20 notes: "+notes);
	
	 int coins = salary/10;
	salary = salary%10;
	System.out.println("10 coins: "+coins);
	
	 coins = salary/5;
	salary = salary%5;
	System.out.println("5 coins: "+coins);
	
	 coins = salary/2;
	salary = salary%2;
	System.out.println("2 coins: "+coins);
	
	System.out.println("1 coins: "+salary);
	
	
	

	}
}
