import java.util.*;

class numberCheck{
	public static void main (String[] args){
		Scanner input =new Scanner(System.in);
		int max=0;
		int number=0;
		for(int i=0;i<10;i++){
			System.out.print("Enter number: "+(i+1)+":");
			 number= input.nextInt();
			
			if(max<number){
				max=number;
				
			}
		}
		System.out.println();
        System.out.println("Maximum number: "+max);
	}
	
}