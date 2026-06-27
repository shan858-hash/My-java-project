import java.util.*;
class Marks{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subject 1 Marks: ");
		int Mark1 = input.nextInt();
		
		System.out.print("Enter the subject 2 Marks: ");
		int Mark2 = input.nextInt();
		
		System.out.print("Enter the subject 3 Marks: ");
		int Mark3 = input.nextInt();
		
		System.out.print("Enter the subject 4 Marks: ");
		int Mark4 = input.nextInt();
		
		System.out.print("Enter the subject 5 Marks: ");
		int Mark5 = input.nextInt();
		
		System.out.println();
		int total=Mark1+Mark2+Mark3+Mark4+Mark5;
		
		System.out.println("Total Marks: "+total);
		double avg=total/(double)5;
		System.out.println("Average Marks: "+avg);
		
		if(avg>=50){
			System.out.println("Result: Pass");
		} else{
			System.out.println("Result: Fail");
		}
	}
}