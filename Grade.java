import java.util.*;
class Grade{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the subject Marks: ");
		int Marks=input.nextInt();
		
		String grade = "F";
		
		if (Marks >=75){
			grade = "A";
		}else if (Marks>=65){
			grade = "B";
		}else if(Marks >=55){
			grade = "C";
		}else if (Marks >=35){
			grade= "S";
		}
		System.out.println("Grade: "+grade);
		
	}
}