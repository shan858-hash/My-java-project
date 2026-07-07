import java.util.*;

class subjectMsrks{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int total=0;
		int marks=0;
		
		System.out.print("Enter Number of subject: ");
		int subject=input.nextInt();
		
		for(int i=0;i<subject;i++){
			System.out.print("subject "+(i+1)+":");
			 marks=input.nextInt();
			
			total+=marks;
			
		}
		System.out.println();
		System.out.println("Total Marks: "+total);
		double avg=total/(double)subject;
		System.out.println("Average marks: "+avg);
		
		if(avg>=50){
			System.out.println("Status: pass");
		}else{
			System.out.println("Status: Fail");
		}
	}
}